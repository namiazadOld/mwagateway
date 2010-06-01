import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import org.omg.CORBA.Environment;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class ClientCore extends AbstractMyxSimpleBrick implements IClientService, ISearchCallService, IQueryProcessed{
	
	
	private void LogHistory(Temperature temperature)
	{
		 File file = new File(CACHFILENAME);
		 FileWriter fw;
		 try 
		 {
			 
			 //For simplicity each day we delete the log. we only saves the log of one day
			 boolean isAppend = Calendar.HOUR != 0;
			 
			 fw = new FileWriter(file, isAppend);
			 
			 fw.append(configuration.getLocation() + "#" + temperature.getValue() + "#" + Calendar.HOUR);
			 fw.append("\r\n");
			 fw.close();			 
			 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
	
	class TemperatureManager extends TimerTask
	{
		public void run()
		{
			Temperature temperature = new Temperature(sensorAPI.CurrentTemperatureInC(), 0);
			LogHistory(temperature);
			guiSynchronizer.TemperatureUpdated(temperature);
		}
	}
	
	public static final IMyxName INTERFACE_NAME_OUT_SENSORAPI = MyxUtils.createName("SensorAPI");
	public static final IMyxName INTERFACE_NAME_OUT_LOCATIONAPI = MyxUtils.createName("LocationAPI");
	public static final IMyxName INTERFACE_NAME_OUT_GUISYNCHRONIZER = MyxUtils.createName("GuiSynchronizer");
	public static final IMyxName INTERFACE_NAME_IN_CLIENTSERVICE= MyxUtils.createName("ClientService");
	public static final IMyxName INTERFACE_NAME_OUT_QUERYHANDLER= MyxUtils.createName("QueryHandler");
	public static final IMyxName INTERFACE_NAME_IN_SEARCHCALLSERVICE= MyxUtils.createName("SearchCallService");
	public static final IMyxName INTERFACE_NAME_IN_QUERYPROCESSED= MyxUtils.createName("QueryProcessed");
	
	private String CONFIGURATIONFILENAME = "";
	private String CACHFILENAME = "";
	private static final int INITIALDELAY = 5000;
	
	private ISensorAPI sensorAPI;
	private ILocationAPI locationAPI;
	private IGuiSynchronizer guiSynchronizer;
	private Timer timer;
	private IQueryHandler queryHandler;
	
	private Configuration configuration;
	
	@Override
	public void init() {
		Helper.INDEX++;
		CONFIGURATIONFILENAME = "Configuration" + Helper.INDEX + ".txt";
		CACHFILENAME = "Cache" + Helper.INDEX + ".txt";
	}
	
	private void loadConfiguration()
	{
			FileReader file;
			String location;
			String deviceName;
			int timeInterval;
			try 
			{
				File f = new File(CONFIGURATIONFILENAME);
				if (!f.exists())
					return;
				
				file = new FileReader(CONFIGURATIONFILENAME);
				
				BufferedReader br = new BufferedReader(file);
					 
				try 
				{
					deviceName = br.readLine();
					location = br.readLine();
					timeInterval = Integer.parseInt(br.readLine());
					configuration = new Configuration(deviceName, location, timeInterval);
					
					br.close();
					file.close();
					
					guiSynchronizer.ConfigurationUpdated(configuration);
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				e.printStackTrace();
			} 
	}
	
	@Override
	public void begin() {
		
		sensorAPI = (ISensorAPI)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_SENSORAPI);
		locationAPI = (ILocationAPI)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_LOCATIONAPI);
		guiSynchronizer = (IGuiSynchronizer) MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_GUISYNCHRONIZER);
		timer = new Timer();
		queryHandler = (IQueryHandler)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_QUERYHANDLER);
		
		loadConfiguration();
		int interval = configuration == null ? INITIALDELAY : configuration.getTimeInterval();
		timer.scheduleAtFixedRate(new TemperatureManager(), INITIALDELAY, interval*1000);
		
	}
	
	
	
	@Override
	public Object getServiceObject(IMyxName name) {
		if (name.equals(INTERFACE_NAME_OUT_SENSORAPI))
			return sensorAPI;
		if (name.equals(INTERFACE_NAME_OUT_LOCATIONAPI))
			return locationAPI;
		else if (name.equals(INTERFACE_NAME_OUT_GUISYNCHRONIZER))
			return guiSynchronizer;
		else if (name.equals(INTERFACE_NAME_IN_CLIENTSERVICE))
			return this;
		else if (name.equals(INTERFACE_NAME_IN_SEARCHCALLSERVICE))
			return this;
		else if (name.equals(INTERFACE_NAME_OUT_QUERYHANDLER))
			return queryHandler;
		else if (name.equals(INTERFACE_NAME_IN_QUERYPROCESSED))
			return this;
		return null;
		
	}
	
	@Override
	public void configurationSent(Configuration configuration){
		
		 File file = new File(CONFIGURATIONFILENAME);
		 FileWriter fw;
		 try 
		 {
			 fw = new FileWriter(file);
			 fw.append(configuration.getDeviceName());
			 fw.append("\r\n");
			 fw.append(configuration.getLocation());
			 fw.append("\r\n");
			 fw.append(new Integer(configuration.getTimeInterval()).toString());
			 fw.append("\r\n");
			 fw.close();
			 
			 this.configuration = configuration;
			 
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	public void query(QueryParameter parameter) {
		queryHandler.querySent(parameter);
	}

	@Override
	public List<QueryResult> Search(QueryParameter parameter) {
				
		//we only check the required query with current location of station. If we want to implement completely we have to search in log file.
		if (!parameter.getLocation().toLowerCase().equals(configuration.getLocation().toLowerCase()))
			return null;
		
		FileReader file;
		List<QueryResult> results = new ArrayList<QueryResult>();
		try 
		{
			File f = new File(CACHFILENAME);
			
			if (!f.exists())
			{
				results.add(new QueryResult(sensorAPI.CurrentTemperatureInC(), 
						sensorAPI.CurrentTemperatureInC(), 
						sensorAPI.CurrentTemperatureInC(), configuration.getDeviceName()));
				return results;
			}
			
			file = new FileReader(CACHFILENAME);
			BufferedReader br = new BufferedReader(file);
			String rawData; 
			try 
			{
				while ((rawData = br.readLine()) != null)
				{
					String[] parts = rawData.split("#");
					int hour = Integer.parseInt(parts[2]);
					double temperature = Double.parseDouble(parts[1]);
					
					if (hour >= Calendar.HOUR - parameter.getHours())
						results.add(new QueryResult(temperature, configuration.getDeviceName()));
				}
			
				br.close();
				file.close();
				
				
			} 
			catch (IOException e)
			{
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} 
		
		if (results.size() == 0)
			return null;
		return results;
	}

	@Override
	public void queryProcessed(List<QueryResult> result) {
		guiSynchronizer.QueryResultReceived(result);
	}
}
