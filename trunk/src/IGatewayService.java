import java.util.List;


public interface IGatewayService {

	public List<QueryResult> query(QueryParameter parameter);
}
