import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;
import java.util.Timer;
import java.util.TimerTask;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class ClientCore extends AbstractMyxSimpleBrick implements IClientService{
	
	
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
	public static final IMyxName INTERFACE_NAME_OUT_GATEWAYSERVICE= MyxUtils.createName("GatewayService");
	
	private ISensorAPI sensorAPI;
	private ITemperatureSynchronizer temperatureSynchronizer;
	private Timer timer;
	private IGatewayService gatewayService;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		
		sensorAPI = (ISensorAPI)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_SENSORAPI);
		temperatureSynchronizer = (ITemperatureSynchronizer) MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_TEMPERATURESYNCHRONIZER);
		timer = new Timer();
		timer.scheduleAtFixedRate(new TemperatureManager(), 5000, 5000);
		gatewayService = (IGatewayService)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_GATEWAYSERVICE);
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
		else if (name.equals(INTERFACE_NAME_OUT_GATEWAYSERVICE))
			return gatewayService;
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
		
		 File file = new File("Configuration.txt");
		 FileWriter fw;
		try {
		 fw = new FileWriter(file);
		 fw.append(configuration.getDeviceName());
		 fw.append("\r\n");
		 fw.append(configuration.getLocation());
		 fw.append("\r\n");
		 fw.append((configuration.getTimeInterval()).toString());
		 fw.append("\r\n");
		 fw.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	public void query(QueryParameter parameter) {
		// TODO Auto-generated method stub
		System.out.println("query");
		gatewayService.query(parameter);
	}
}
