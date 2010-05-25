import javax.swing.ImageIcon;

public class MainForm extends javax.swing.JFrame {

    /** Creates new form MainForm */
    public MainForm() {
        initComponents();
        MainPanel.setVisible(true);
        QueryPanel.setVisible(true);
        ChangeButtonPanel.setVisible(false);
        ChanegedPanel.setVisible(false);
        
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
        VariableTextField = new javax.swing.JTextField();
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
        jLabel11 = new javax.swing.JLabel();
        WeatherLabel = new javax.swing.JLabel();
        QueryPanel = new javax.swing.JPanel();
        jLabel4 = new javax.swing.JLabel();
        QueryLocationTextField = new javax.swing.JTextField();
        QueryTimeTextField = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        ResultPanel = new javax.swing.JPanel();
        SearchButton = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        ImageIcon myIcon = new ImageIcon("MWA.png");
        PhotoLabel = new javax.swing.JLabel(myIcon);

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

        VariableTextField.setText("location");

        TimeIntervalTextField.setText("time");

        javax.swing.GroupLayout ChanegedPanelLayout = new javax.swing.GroupLayout(ChanegedPanel);
        ChanegedPanel.setLayout(ChanegedPanelLayout);
        ChanegedPanelLayout.setHorizontalGroup(
            ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanegedPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(DeviceNameTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(VariableTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE)
                    .addComponent(TimeIntervalTextField, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 127, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        ChanegedPanelLayout.setVerticalGroup(
            ChanegedPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ChanegedPanelLayout.createSequentialGroup()
                .addComponent(DeviceNameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(VariableTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
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

        DeviceLabel.setText("device");

        LocationLabel.setText("location");

        TimeLabel.setText("time");

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

        jLabel11.setText("Weather:");

        WeatherLabel.setText("Weather");

        javax.swing.GroupLayout ConfigurationPanelLayout = new javax.swing.GroupLayout(ConfigurationPanel);
        ConfigurationPanel.setLayout(ConfigurationPanelLayout);
        ConfigurationPanelLayout.setHorizontalGroup(
            ConfigurationPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ConfigurationPanelLayout.createSequentialGroup()
                .addGap(240, 240, 240)
                .addComponent(jLabel8)
                .addContainerGap(221, Short.MAX_VALUE))
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

        QueryLocationTextField.setText("location");
        QueryLocationTextField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QueryLocationTextFieldActionPerformed(evt);
            }
        });

        QueryTimeTextField.setText("time");

        jLabel5.setText("Time:");

        jLabel6.setText("hours");

        ResultPanel.setBackground(new java.awt.Color(255, 255, 255));
        ResultPanel.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        javax.swing.GroupLayout ResultPanelLayout = new javax.swing.GroupLayout(ResultPanel);
        ResultPanel.setLayout(ResultPanelLayout);
        ResultPanelLayout.setHorizontalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 561, Short.MAX_VALUE)
        );
        ResultPanelLayout.setVerticalGroup(
            ResultPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 133, Short.MAX_VALUE)
        );

        SearchButton.setText("Serach");
        SearchButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchButtonActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel9.setText("Query");

        javax.swing.GroupLayout QueryPanelLayout = new javax.swing.GroupLayout(QueryPanel);
        QueryPanel.setLayout(QueryPanelLayout);
        QueryPanelLayout.setHorizontalGroup(
            QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(QueryPanelLayout.createSequentialGroup()
                .addGap(21, 21, 21)
                .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(QueryLocationTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE)
                    .addComponent(QueryTimeTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 60, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addGap(93, 93, 93)
                .addComponent(SearchButton, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(180, 180, 180))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, QueryPanelLayout.createSequentialGroup()
                .addContainerGap(247, Short.MAX_VALUE)
                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(258, 258, 258))
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
                        .addGap(53, 53, 53)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QueryLocationTextField)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(QueryPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QueryTimeTextField)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)))
                    .addGroup(QueryPanelLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel9)
                        .addGap(33, 33, 33)
                        .addComponent(SearchButton)
                        .addGap(16, 16, 16)))
                .addGap(5, 5, 5)
                .addComponent(ResultPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(12, 12, 12))
        );

        jLabel10.setFont(new java.awt.Font("Tahoma", 1, 18));
        jLabel10.setText("Mobile Weather Application");

        javax.swing.GroupLayout MainPanelLayout = new javax.swing.GroupLayout(MainPanel);
        MainPanel.setLayout(MainPanelLayout);
        MainPanelLayout.setHorizontalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, MainPanelLayout.createSequentialGroup()
                .addGap(193, 193, 193)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 251, Short.MAX_VALUE)
                .addGap(163, 163, 163))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addGap(283, 283, 283)
                .addComponent(PhotoLabel)
                .addContainerGap(324, Short.MAX_VALUE))
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(ConfigurationPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(QueryPanel, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        MainPanelLayout.setVerticalGroup(
            MainPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(MainPanelLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(PhotoLabel, javax.swing.GroupLayout.DEFAULT_SIZE, 85, Short.MAX_VALUE)
                .addGap(3, 3, 3)
                .addComponent(jLabel10, javax.swing.GroupLayout.DEFAULT_SIZE, 57, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ConfigurationPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(QueryPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(MainPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
    }

    private void ChangeConfigurationButtonActionPerformed(java.awt.event.ActionEvent evt) {
        ChangeButton.setVisible(true);
        ChangeButtonPanel.setVisible(false);
        ChanegedPanel.setVisible(false);
        MainConfigurationPanel.setVisible(true);
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
        // TODO add your handling code here:
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
    private javax.swing.JPanel MainConfigurationPanel;
    private javax.swing.JPanel MainPanel;
    private javax.swing.JLabel PhotoLabel;
    private javax.swing.JTextField QueryLocationTextField;
    private javax.swing.JPanel QueryPanel;
    private javax.swing.JTextField QueryTimeTextField;
    private javax.swing.JPanel ResultPanel;
    private javax.swing.JButton SearchButton;
    private javax.swing.JTextField TimeIntervalTextField;
    private javax.swing.JLabel TimeLabel;
    private javax.swing.JTextField VariableTextField;
    private javax.swing.JLabel WeatherLabel;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    // End of variables declaration

}