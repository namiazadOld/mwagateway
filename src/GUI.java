import edu.uci.isr.myx.fw.AbstractMyxSimpleBrick;
import edu.uci.isr.myx.fw.IMyxName;


public class GUI extends AbstractMyxSimpleBrick{
	
	
	protected MainForm form;
	
	@Override
	public void begin() {

		// TODO Auto-generated method stub		
	    java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainForm().setVisible(true);
            }
        });
//		form.setVisible(true);

	}
	
	@Override
	public Object getServiceObject(IMyxName arg0) {
		// TODO Auto-generated method stub
		return null;
	}

}
