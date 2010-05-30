import java.util.List;


public interface IClientService{
	
	public void ConfigurationSent(Configuration configuration);
	public List<QueryResult> query(QueryParameter parameter);
	
}
