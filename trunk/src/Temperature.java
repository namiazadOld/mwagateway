
public class Temperature {

	private double value;
	private double humidity;
	
	public Temperature(double value, double humidity)
	{
		this.value = value;
		this.humidity = humidity;
	}
	
	public Double getValue() {
		return value;
	}
	
	public Double getHumidity() {
		return humidity;
	}
}
