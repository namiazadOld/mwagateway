
public class Configuration {
	
	
	private String location;
	private String deviceName;
	private int timeInterval;
	
	public Configuration(String deviceName, String location , int timeInterval )
	{
		this.location = location;
		this.deviceName = deviceName;
		this.timeInterval = timeInterval;
	}
	
	
	public String getLocation() {
		return location;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public int getTimeInterval() {
		return timeInterval;
	}
	
	

}
