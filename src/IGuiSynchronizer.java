import java.util.List;


public interface IGuiSynchronizer {
	
	public void TemperatureUpdated(Temperature temperature);
	public void ConfigurationUpdated(Configuration configuration);
	public void QueryResultReceived(List<QueryResult> result);
}
