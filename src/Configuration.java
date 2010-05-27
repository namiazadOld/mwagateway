
public class Configuration {
	
	
	private String location;
	private String deviceName;
	private double timeInterval;
	
	public Configuration(String location, String deviceName, double timeInterval )
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
	
	public Double getTimeInterval() {
		return timeInterval;
	}
	
	

}
