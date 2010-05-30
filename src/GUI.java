import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class GUI extends AbstractMyxSimpleBrick implements ITemperatureSynchronizer{
	
	public static final IMyxName INTERFACE_NAME_IN_TEMPERATURESYNCHRONIZER= MyxUtils.createName("TemperatureSynchronizer");
	public static final IMyxName INTERFACE_NAME_OUT_CLIENTSERVICE= MyxUtils.createName("ClientService");
	
	
	protected MainForm form;
	private IClientService clientService;
	
	@Override
	public void begin() {

		// TODO Auto-generated method stub
		
		clientService = (IClientService) MyxUtils.getFirstRequiredServiceObject(this, INTERFACE_NAME_OUT_CLIENTSERVICE);
		
	    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form = new MainForm();
                form.setVisible(true);
                form.setClientService(clientService);
            }
        });
	    
	    
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_IN_TEMPERATURESYNCHRONIZER))
			return this;
		else if(name.equals(INTERFACE_NAME_OUT_CLIENTSERVICE))
			return clientService;
		return null;
	}

	@Override
	public void TemperatureUpdated(Temperature temperature) {
		// TODO Auto-generated method stub
		form.UpdateTemperature(temperature.getValue());
	}
}
