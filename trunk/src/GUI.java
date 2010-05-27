import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;
import edu.uci.isr.myx.fw.MyxUtils;


public class GUI extends AbstractMyxSimpleBrick implements ITemperatureSynchronizer{
	
	public static final IMyxName INTERFACE_NAME_IN_TEMPERATURESYNCHRONIZER= MyxUtils.createName("TemperatureSynchronizer");
	
	protected MainForm form;
	
	@Override
	public void begin() {

		// TODO Auto-generated method stub		
	    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                form = new MainForm();
                form.setVisible(true);
            }
        });
	}
	
	@Override
	public Object getServiceObject(IMyxName name) {
		// TODO Auto-generated method stub
		if (name.equals(INTERFACE_NAME_IN_TEMPERATURESYNCHRONIZER))
			return this;
		return null;
	}

	@Override
	public void TemperatureUpdated(Temperature temperature) {
		// TODO Auto-generated method stub
		form.UpdateTemperature(temperature.getValue());
	}

}
