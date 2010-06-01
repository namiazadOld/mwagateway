import java.util.Random;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class LocationDriver extends AbstractMyxSimpleBrick implements ILocationAPI{

	public static final IMyxName INTERFACE_NAME_IN_LOCATIONAPI = MyxUtils.createName("LocationAPI");
	
	private static final String NULLLOCATION = "";
	 
	
	private String lastTemperature = NULLLOCATION;
	private Random temperatureGenerator;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
	}
	
	public LocationDriver()
	{
		
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		
		if (name.equals(INTERFACE_NAME_IN_LOCATIONAPI))
			return this;
		// TODO Auto-generated method stub
		return null;
	}
	@Override
	public String CurrentLocation() {
		// TODO Auto-generated method stub
		return null;
	}

	

}
