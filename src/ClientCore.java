import java.io.File;
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

	private ISensorAPI sensorAPI;
	private ITemperatureSynchronizer temperatureSynchronizer;
	private Timer timer;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		
		sensorAPI = (ISensorAPI)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_SENSORAPI);
		temperatureSynchronizer = (ITemperatureSynchronizer) MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_TEMPERATURESYNCHRONIZER);
		timer = new Timer();
		timer.scheduleAtFixedRate(new TemperatureManager(), 5000, 5000);
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
		return null;
		
	}

	
	@Override
	public void ConfigurationSent(Configuration configuration){
		// TODO Auto-generated method stub
		
		
			
		System.out.println("configuration");	
		
		
		
	
	}
	
	
}
