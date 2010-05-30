
public class QueryParameter {

	private String location;
	private double radius;
	private double hours;
	
	public QueryParameter(String location, double radius, double hours)
	{
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
	
}
