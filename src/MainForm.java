
import java.util.List;

import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;



public class MainForm extends javax.swing.JFrame {

	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private IClientService clientService;
	
	public void setClientService(IClientService clientService) {
		this.clientService = clientService;
	}
	
    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
        MainPanel.setVisible(true);
        QueryPanel.setVisible(true);
        ChangeButtonPanel.setVisible(false);
        ChanegedPanel.setVisible(false);
           QueryLocationTextField.setText(null);
        QueryTimeTextField.setText(null);
        QueryRadiusTextField.setText(null);
        SearchLabel.setVisible(false);
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">
    private void initComponents() {

        MainPanel = new javax.swing.JPanel();
        ConfigurationPanel = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        ChanegedPanel = new javax.swing.JPanel();
        DeviceNameTextField = new javax.swing.JTextField();
        LocationTextField = new javax.swing.JTextField();
        TimeIntervalTextField = new javax.swing.JTextField();
        ChangeButton = new javax.swing.JButton();
        ChangeButtonPanel = new javax.swing.JPanel();
        ChangeConfigurationButton = new javax.swing.JButton();
        BackButton = new javax.swing.JButton();
        MainConfigurationPanel = new javax.swing.JPanel();
        DeviceLabel = new javax.swing.JLabel();
        LocationLabel = new javax.swing.JLabel();
        TimeLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        ImageIcon WeatherIcon = new ImageIcon("waiting.gif");
        jLabel11 = new javax.swing.JLabel();
        WeatherLabel = new javax.swing.JLabel(WeatherIcon);
        QueryPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        QueryLocationTextField = new javax.swing.JTextField();
        QueryTimeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ResultPanel = new JTextArea();
        SearchButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        QueryRadiusTextField = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        ImageIcon myIcon = new ImageIcon("MWA.png");
        PhotoLabel = new javax.swing.JLabel(myIcon);
        jScrollPane1 = new javax.swing.JScrollPane();
        SearchLabel = new javax.swing.JLabel(WeatherIcon);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        MainPanel.setBackground(new java.awt.Color(0, 102, 204));
        MainPanel.setBorder(new javax.swing.border.MatteBorder(null));

        ConfigurationPanel.setBackground(new java.awt.Color(153, 153, 255));
        ConfigurationPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel1.setText("Device Name:");

        jLabel2.setText("Location:");

        jLabel3.setText("Time Intervals:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel8.setText("Configuration");

        ChanegedPanel.setBackground(new java.awt.Color(153, 153, 255));

        DeviceNameTextField.setText("device");

        LocationTextField.setText("location");

        TimeIntervalTextField.setText("time");

        javax.swing.GroupLayout ChanegedPanelLayout = new javax.swing.GroupLayout(ChanegedPanel);
        ChanegedPanel.setLayout(ChanegedPanelLayout);
        ChanegedPanelLayout.setHorizontalGroup(
            ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanegedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeviceNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(LocationTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(TimeIntervalTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChanegedPanelLayout.setVerticalGroup(
            ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanegedPanelLayout.createSequentialGroup()
                .addComponent(DeviceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(LocationTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(TimeIntervalTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        ChangeButton.setText("Change");
        ChangeButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeButtonActionPerformed(evt);
            }
        });

        ChangeButtonPanel.setBackground(new java.awt.Color(153, 153, 255));

        ChangeConfigurationButton.setText("Change Configuration");
        ChangeConfigurationButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ChangeConfigurationButtonActionPerformed(evt);
            }
        });

        BackButton.setText("Back");
        BackButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BackButtonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout ChangeButtonPanelLayout = new javax.swing.GroupLayout(ChangeButtonPanel);
        ChangeButtonPanel.setLayout(ChangeButtonPanelLayout);
        ChangeButtonPanelLayout.setHorizontalGroup(
            ChangeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeButtonPanelLayout.createSequentialGroup()
                .addComponent(BackButton)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ChangeConfigurationButton, javax.swing.GroupLayout.DEFAULT_SIZE, 156, Short.MAX_VALUE)
                .addContainerGap())
        );
        ChangeButtonPanelLayout.setVerticalGroup(
            ChangeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChangeButtonPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.CENTER)
                .addComponent(BackButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ChangeConfigurationButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        
        

        MainConfigurationPanel.setBackground(new java.awt.Color(153, 153, 255));

        DeviceLabel.setText(null);

        LocationLabel.setText(null);

        TimeLabel.setText(null);

        javax.swing.GroupLayout MainConfigurationPanelLayout = new javax.swing.GroupLayout(MainConfigurationPanel);
        MainConfigurationPanel.setLayout(MainConfigurationPanelLayout);
        MainConfigurationPanelLayout.setHorizontalGroup(
            MainConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainConfigurationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeviceLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(TimeLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(LocationLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainConfigurationPanelLayout.setVerticalGroup(
            MainConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainConfigurationPanelLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(DeviceLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(LocationLabel)
                .addGap(13, 13, 13)
                .addComponent(TimeLabel))
        );

        jLabel7.setText("secs");

       jLabel11.setText("Current Weather:");

        WeatherLabel.setText("");
        
        ResultPanel.setColumns(20);
        ResultPanel.setEditable(false);
        ResultPanel.setRows(5);
        jScrollPane1.setViewportView(ResultPanel);

        javax.swing.GroupLayout ConfigurationPanelLayout = new javax.swing.GroupLayout(ConfigurationPanel);
        ConfigurationPanel.setLayout(ConfigurationPanelLayout);
        ConfigurationPanelLayout.setHorizontalGroup(
            ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel8))
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel1)
                    .addComponent(jLabel11))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(WeatherLabel))
                    .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                        .addComponent(MainConfigurationPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(4, 4, 4)
                        .addComponent(ChanegedPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(ChangeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                                .addGap(79, 79, 79)
                                .addComponent(ChangeButton, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))))
        );
        ConfigurationPanelLayout.setVerticalGroup(
            ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(MainConfigurationPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationPanelLayout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel2)
                        .addGap(13, 13, 13)
                        .addComponent(jLabel3)
                        .addGap(5, 5, 5))
                    .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ConfigurationPanelLayout.createSequentialGroup()
                        .addComponent(ChangeButton)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ChangeButtonPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(ChanegedPanel, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(WeatherLabel))
                .addContainerGap())
        );

        QueryPanel.setBackground(new java.awt.Color(153, 153, 255));
        QueryPanel.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        jLabel4.setText("Location:");

        QueryLocationTextField.setText(null);
        QueryLocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryLocationTextFieldActionPerformed(evt);
            }
        });

        QueryTimeTextField.setText(null);

        jLabel5.setText("Time:");

        jLabel6.setText("hours");
        

        ResultPanel.setBackground(new java.awt.Color(255, 255, 255));
        ResultPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 575, Short.MAX_VALUE)
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 169, Short.MAX_VALUE)
        );

        SearchButton.setText("Search");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel9.setText("Query");

        jLabel12.setText("Radius:");

        QueryRadiusTextField.setText(null);

        javax.swing.GroupLayout QueryPanelLayout = new javax.swing.GroupLayout(QueryPanel);
        QueryPanel.setLayout(QueryPanelLayout);
        QueryPanelLayout.setHorizontalGroup(
            QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueryPanelLayout.createSequentialGroup()
                .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QueryPanelLayout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE)
                            .addGroup(QueryPanelLayout.createSequentialGroup()
                                .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 34, Short.MAX_VALUE)
                                .addGap(10, 10, 10))
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 44, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(QueryLocationTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QueryRadiusTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(QueryTimeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(QueryPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addGap(59, 59, 59))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueryPanelLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 179, Short.MAX_VALUE)
                                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(SearchLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(114, 114, 114))))
                    .addGroup(QueryPanelLayout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(19, 19, 19))
            .addGroup(QueryPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        QueryPanelLayout.setVerticalGroup(
            QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueryPanelLayout.createSequentialGroup()
                .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(QueryPanelLayout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(QueryLocationTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 20, Short.MAX_VALUE)
                            .addComponent(QueryRadiusTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(QueryTimeTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 22, Short.MAX_VALUE)))
                    .addGroup(QueryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(18, 18, 18)
                        .addComponent(SearchButton)
                        .addComponent(SearchLabel)))
                .addGap(11, 11, 11)
                .addComponent(ResultPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel10.setText("Mobile Weather Application");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(PhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(338, 338, 338))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(165, 165, 165)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 264, Short.MAX_VALUE)
                .addGap(192, 192, 192))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(QueryPanel, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(ConfigurationPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 63, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 58, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfigurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 168, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QueryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>

    private void ChangeButtonActionPerformed(java.awt.event.ActionEvent evt) {                                             
     ChangeButton.setVisible(false);
        ChanegedPanel.setVisible(true);
        MainConfigurationPanel.setVisible(false);
        ChangeButtonPanel.setVisible(true);
        DeviceNameTextField.setText(DeviceLabel.getText());
        LocationTextField.setText(LocationLabel.getText());
        TimeIntervalTextField.setText(TimeLabel.getText());
    }                                            

    private void ChangeConfigurationButtonActionPerformed(java.awt.event.ActionEvent evt) {                                                          
      
        if(LocationTextField.getText().isEmpty() ||DeviceNameTextField.getText().isEmpty()|| TimeIntervalTextField.getText().isEmpty()){
        ResultPanel.setText("Please fill the required information in your configuration!");	
        
        }
        
        else if (!DoubleCheckValidity(TimeIntervalTextField.getText())){
        	ResultPanel.setText("Please fill the Time interval textfield with numbers!");
        }

        else {
        	ChangeButton.setVisible(true);
            ChangeButtonPanel.setVisible(false);
            ChanegedPanel.setVisible(false);
            MainConfigurationPanel.setVisible(true);
        DeviceLabel.setText(DeviceNameTextField.getText());
        LocationLabel.setText(LocationTextField.getText());
        TimeLabel.setText(TimeIntervalTextField.getText());
        
        clientService.configurationSent(new Configuration(DeviceLabel.getText(), LocationLabel.getText(),Integer.parseInt(TimeLabel.getText())));
        ResultPanel.setText(null);
        }
    }                                                         

    private void BackButtonActionPerformed(java.awt.event.ActionEvent evt) {                                           
        ChangeButton.setVisible(true);
        ChangeButtonPanel.setVisible(false);
        ChanegedPanel.setVisible(false);
        MainConfigurationPanel.setVisible(true);
    }                                          

    private void QueryLocationTextFieldActionPerformed(java.awt.event.ActionEvent evt) {                                                       
        // TODO add your handling code here:
    }                                                      

    private void SearchButtonActionPerformed(java.awt.event.ActionEvent evt) {   
    	
    	counter++;
    	if (
    			QueryLocationTextField.getText().isEmpty()||
    			QueryRadiusTextField.getText().isEmpty() ||
    			QueryTimeTextField.getText().isEmpty()){
    		
    		 ResultPanel.setText("Please fill the required information in your query!");	
    		 counter--;
    		
    	}
    	else if(!CheckValidity( QueryRadiusTextField.getText())){
    		
    		ResultPanel.setText("Please fill the Radius textfield with numbers!");
    		counter--;
    	}	
    	
    	else if(!CheckValidity(QueryTimeTextField.getText())){
    		
    		ResultPanel.setText("Please fill the Time textfield with numbers!");
    		counter--;
    	}
    	else { 
    	
    	
    	SearchLabel.setVisible(true);
    	ResultPanel.setText("Loading data...");
    	//SearchLabel.setIcon(WeatherIcon);
        // TODO add your handling code here:
    	clientService.query(new QueryParameter(DeviceLabel.getText(),QueryLocationTextField.getText(),
    			Double.parseDouble(QueryRadiusTextField.getText()),
    			Double.parseDouble(QueryTimeTextField.getText())));
    }
    }
    
    public void UpdateTemperature(double value)
    {
    	WeatherLabel.setIcon(null);
    	WeatherLabel.setText(Double.toString(value));
    	repaint();
    }
    
    public void UpdateConfiguration(Configuration configuration)
    {
	  	LocationLabel.setText(configuration.getLocation());
	  	DeviceLabel.setText(configuration.getDeviceName());
	  	TimeLabel.setText(new Integer(configuration.getTimeInterval()).toString());
	  	repaint();
    }
    
    public void UpdateResult(List<QueryResult> resultList)
    {
    	counter--;
    	if(counter==0)
    		SearchLabel.setVisible(false);
    	//SearchLabel.setVisible(false);
    	
		//System.out.println("Result : " + result.getMin());
		ResultPanel.removeAll();
		
		if (resultList == null){
			ResultPanel.setText("Location is unavailable!");
		}
		else {
			
			ResultPanel.setText("");
			for (QueryResult result : resultList)
			{
				ResultPanel.append("Device Name: " + result.getDeviceName()+ "--" );
				ResultPanel.append("Minimum: " + result.getMin()+ "--");
				ResultPanel.append("Maximum: " + result.getMax()+ "--");
				ResultPanel.append("Average: " + result.getAverage()+ "\r\n" );
			}
			
		}
    }
 public boolean CheckValidity(String validation){
	 int num;
	 try { 
		 num = Integer.parseInt (validation); 
		 } catch (NumberFormatException E) { 
			return false; 
		 }
	return true; 
 }
 
 public boolean DoubleCheckValidity(String validation){
	 double num;
	 try { 
		 num = Double.parseDouble(validation); 
		 } catch (NumberFormatException E) { 
			return false; 
		 }
	return true; 
	
 }
 
 
    /**
    * @param args the command line arguments
    */


    // Variables declaration - do not modify
    private javax.swing.JButton BackButton;
    private javax.swing.JPanel ChanegedPanel;
    private javax.swing.JButton ChangeButton;
    private javax.swing.JPanel ChangeButtonPanel;
    private javax.swing.JButton ChangeConfigurationButton;
    private javax.swing.JPanel ConfigurationPanel;
    private javax.swing.JLabel DeviceLabel;
    private javax.swing.JTextField DeviceNameTextField;
    private javax.swing.JLabel LocationLabel;
    private javax.swing.JTextField LocationTextField;
    private javax.swing.JPanel MainConfigurationPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JTextField QueryLocationTextField;
    private javax.swing.JPanel QueryPanel;
    private javax.swing.JTextField QueryRadiusTextField;
    private javax.swing.JTextField QueryTimeTextField;
    private javax.swing.JTextArea ResultPanel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TimeIntervalTextField;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JLabel WeatherLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel SearchLabel;
    private javax.swing.ImageIcon WeatherIcon;
    private int counter = 0;
    // End of variables declaration

}
