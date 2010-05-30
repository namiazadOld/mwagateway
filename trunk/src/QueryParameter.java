
public class QueryParameter {

	private String location;
	private double radius;
	private double hours;
	private String deviceName;
	
	public QueryParameter(String deviceName, String location, double radius, double hours)
	{
		this.deviceName = deviceName;
		this.location = location;
		this.radius = radius;
		this.hours = hours;
	}
	
	public String getLocation() {
		return location;
	}
	
	public double getRadius() {
		return radius;
	}
	
	public double getHours() {
		return hours;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
}
