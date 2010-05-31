import java.util.ArrayList;
import java.util.List;

import edu.uci.isr.myx.conn.IMultiwayResults;
import edu.uci.isr.myx.conn.SynchronousMultiwayProxyConnector;
import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class GatewayCore extends AbstractMyxSimpleBrick implements IGatewayService{

	public static final IMyxName INTERFACE_NAME_IN_GATEWAYSERVICE= MyxUtils.createName("GatewayService");
	public static final IMyxName INTERFACE_NAME_OUT_SEARCHCALLSERVICE= MyxUtils.createName("SearchCallService");
	public static final IMyxName INTERFACE_NAME_OUT_RESULTSSERVICE = MyxUtils.createName("results");
	
	ISearchCallService searchCallService;
	IMultiwayResults results;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		searchCallService = (ISearchCallService)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_SEARCHCALLSERVICE);
		results = (IMultiwayResults)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_RESULTSSERVICE);
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_IN_GATEWAYSERVICE))
			return this;
		if (name.equals(INTERFACE_NAME_OUT_RESULTSSERVICE))
			return results;
		return null;
		
	}

	@Override
	public QueryResult query(QueryParameter parameter) {
		// TODO Auto-generated method stub		
		
		//For Asynchronous behavior demonstration
		double h = 10000000000.0;
		while (h > 0)
			h--;
		
		searchCallService.Search(parameter);
		
		Object[] answers = results.getReturnValues();
		
		for (int i = 0; i < answers.length; i++)
		{
			if (answers[i] != null)
			{
				QueryResult res = (QueryResult)answers[i];
				return res;
			}
		}
		
		return null;
	}

}
