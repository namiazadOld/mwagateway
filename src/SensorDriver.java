import java.util.Random;


import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class SensorDriver extends AbstractMyxSimpleBrick implements ISensorAPI{

	public static final IMyxName INTERFACE_NAME_IN_SENSORAPI = MyxUtils.createName("SensorAPI");
	
	private static final int NULLTEMPERATURE = -1000;
	private static final int RANGE = 40; 
	
	private int lastTemperature = NULLTEMPERATURE;
	private Random temperatureGenerator;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
	}
	
	public SensorDriver()
	{
		temperatureGenerator = new Random();
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		
		if (name.equals(INTERFACE_NAME_IN_SENSORAPI))
			return this;
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public double CurrentTemperatureInC() {
		// TODO Auto-generated method stub
		
		if (lastTemperature == NULLTEMPERATURE)
		{
			lastTemperature = temperatureGenerator.nextInt() % RANGE;
			return lastTemperature;
		}
		
		double coin = temperatureGenerator.nextDouble();
		
		if (coin > 0.3 && coin < 0.6)
			if (lastTemperature > (0 - RANGE))
				lastTemperature--;
		else if (coin >= 0.6)
			if (lastTemperature < RANGE)
				lastTemperature++;
		
		return lastTemperature;
	}

	@Override
	public double CurrentTemperatureInF() {
		// TODO Auto-generated method stub
		return 1.8 * CurrentTemperatureInC() + 32;
	}

}
