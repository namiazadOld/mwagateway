import java.util.ArrayList;
import java.util.List;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class Gateway extends AbstractMyxSimpleBrick implements IGatewayService{

	public static final IMyxName INTERFACE_NAME_IN_GATEWAYSERVICE= MyxUtils.createName("GatewayService");
	
	@Override
	public void begin() {
		// TODO Auto-generated method stub
		System.out.println("Begin");
	}
	
	@Override
	public List<QueryResult> query(QueryParameter parameter) {
		// TODO Auto-generated method stub
		QueryResult result = new QueryResult(1, 4, 2, "NamiDevice");
		List<QueryResult> results = new ArrayList<QueryResult>();
		results.add(result);
		return results;
	}

	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_IN_GATEWAYSERVICE))
			return this;
		return null;
	}
	
	

}
