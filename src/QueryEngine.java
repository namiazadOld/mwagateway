import java.util.List;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class QueryEngine extends AbstractMyxSimpleBrick implements IQueryHandler{

	public static final IMyxName INTERFACE_NAME_OUT_GATEWAYSERVICE = MyxUtils.createName("GatewayService");
	public static final IMyxName INTERFACE_NAME_OUT_QUERYHANDLER = MyxUtils.createName("QueryHandler");
	public static final IMyxName INTERFACE_NAME_OUT_QUERYPROCESSED= MyxUtils.createName("QueryProcessed");
	
	private IGatewayService gatewayService;
	private IQueryProcessed queryProcessed;
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		gatewayService = (IGatewayService)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_GATEWAYSERVICE);
		queryProcessed = (IQueryProcessed)MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_QUERYPROCESSED);
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_OUT_GATEWAYSERVICE))
			return gatewayService;
		if (name.equals(INTERFACE_NAME_OUT_QUERYHANDLER))
			return this;
		if (name.equals(INTERFACE_NAME_OUT_QUERYPROCESSED))
			return queryProcessed;
		
		return null;
	}

	@Override
	public void querySent(QueryParameter parameter) {
		// TODO Auto-generated method stub
		
		List<QueryResult> result = gatewayService.query(parameter);
		queryProcessed.queryProcessed(result);
	}

}
