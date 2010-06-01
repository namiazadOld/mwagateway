
public class QueryResult {
	
	private double min;
	private double max;
	private double average;
	private String deviceName;
	private double temperature;
	
	public double getMax() {
		return max;
	}
	
	public double getMin() {
		return min;
	}
	
	public double getAverage() {
		return average;
	}
	
	public String getDeviceName() {
		return deviceName;
	}
	
	public double getTemperature() {
		return temperature;
	}
	
	public QueryResult(double min, double max, double average, String deviceName)
	{
		this.min = min;
		this.max = max;
		this.average = average;
		this.deviceName = deviceName;
	}
	
	public QueryResult(double temperature, String deviceName)
	{
		this.temperature = temperature;
		this.deviceName = deviceName;
	}
}
