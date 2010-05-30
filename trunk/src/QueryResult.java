
public class QueryResult {
	
	private double min;
	private double max;
	private double average;
	private String deviceName;
	private boolean hasAnswer;
	
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
	
	public QueryResult(double min, double max, double average, String deviceName, boolean hasAnswer)
	{
		this.min = min;
		this.max = max;
		this.average = average;
		this.deviceName = deviceName;
		this.hasAnswer = hasAnswer;
	}

}
