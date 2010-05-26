
public class Temperature {

	private double value;
	private double humidity;
	
	public Temperature(double value, double humidity)
	{
		this.value = value;
		this.humidity = humidity;
	}
	
	public double getValue() {
		return value;
	}
	
	public double getHumidity() {
		return humidity;
	}
}
