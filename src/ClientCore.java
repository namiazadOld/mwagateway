import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Timer;
import java.util.TimerTask;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class ClientCore extends AbstractMyxSimpleBrick implements IClientService, ISearchCallService, IQueryProcessed{
	
	
	class TemperatureManager extends TimerTask
	{
		public void run()
		{
			Temperature temperature = new Temperature(sensorAPI.CurrentTemperatureInC(), 0);
			temperatureSynchronizer.TemperatureUpdated(temperature);
		}
	}
	
	public static final IMyxName INTERFACE_NAME_OUT_SENSORAPI = MyxUtils.createName("SensorAPI");
	public static final IMyxName INTERFACE_NAME_OUT_TEMPERATURESYNCHRONIZER = MyxUtils.createName("TemperatureSynchronizer");
	public static final IMyxName INTERFACE_NAME_IN_CLIENTSERVICE= MyxUtils.createName("ClientService");
	public static final IMyxName INTERFACE_NAME_OUT_QUERYHANDLER= MyxUtils.createName("QueryHandler");
	public static final IMyxName INTERFACE_NAME_IN_SEARCHCALLSERVICE= MyxUtils.createName("SearchCallService");
	public static final IMyxName INTERFACE_NAME_IN_QUERYPROCESSED= MyxUtils.createName("QueryProcessed");
	
	private String CONFIGURATIONFILENAME = "";
	private static final int INITIALDELAY = 5000;
	
	private ISensorAPI sensorAPI;
	private ITemperatureSynchronizer temperatureSynchronizer;
	private Timer timer;
	private IQueryHandler queryHandler;
	
	private Configuration configuration;
	
	@Override
	public void init() {
		// TODO Auto-generated method stub
		Helper.INDEX++;
		CONFIGURATIONFILENAME = "Configuration" + Helper.INDEX + ".txt";
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
					
					temperatureSynchronizer.ConfigurationUpdated(configuration);
				} 
				catch (IOException e)
				{
					e.printStackTrace();
				}
				
			} catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} 
	}
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		
		
		sensorAPI = (ISensorAPI)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_SENSORAPI);
		temperatureSynchronizer = (ITemperatureSynchronizer) MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_TEMPERATURESYNCHRONIZER);
		timer = new Timer();
		queryHandler = (IQueryHandler)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_QUERYHANDLER);
		
		loadConfiguration();
		int interval = configuration == null ? INITIALDELAY : configuration.getTimeInterval();
		timer.scheduleAtFixedRate(new TemperatureManager(), INITIALDELAY, interval);
		
	}
	
	
	
	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_OUT_SENSORAPI))
			return sensorAPI;
		else if (name.equals(INTERFACE_NAME_OUT_TEMPERATURESYNCHRONIZER))
			return temperatureSynchronizer;
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
	public void ConfigurationSent(Configuration configuration){
		// TODO Auto-generated method stub
//		System.out.println("Start");	
//		double i = 1000000000.0;
//		
//		while (i > 0)
//			i--;
//		System.out.println("End");
		
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
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void query(QueryParameter parameter) {
		// TODO Auto-generated method stub
		queryHandler.querySent(parameter);
	}

	@Override
	public QueryResult Search(QueryParameter parameter) {
		// TODO Auto-generated method stub
		if (parameter.getLocation().toLowerCase().equals(configuration.getLocation().toLowerCase()))
			return new QueryResult(sensorAPI.CurrentTemperatureInC(), sensorAPI.CurrentTemperatureInC(), sensorAPI.CurrentTemperatureInC(), configuration.getDeviceName());
		return null;
	}

	@Override
	public void processed(QueryResult result) {
		// TODO Auto-generated method stub
		temperatureSynchronizer.QueryResultReceived(result);
	}
}
