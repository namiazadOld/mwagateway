import java.util.List;

import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class Gateway extends AbstractMyxSimpleBrick implements IGatewayService{

	public static final IMyxName INTERFACE_NAME_IN_GATEWAYSERVICE= MyxUtils.createName("GatewayService");
	
	@Override
	public List<QueryResult> query(QueryParameter parameter) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_IN_GATEWAYSERVICE))
			return this;
		return null;
	}
	
	

}
