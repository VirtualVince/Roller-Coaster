/**
 * The purpose of this program is a roller coaster ride program that determines whether or not a potential rider should go on a roller coaster.
 */
package u1a5.roller.coaster;

public class GUIcomponents extends javax.swing.JFrame {

    public GUIcomponents() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        StartBtn = new javax.swing.JButton();
        ExitBtn = new javax.swing.JButton();
        TFHeight = new javax.swing.JTextField();
        TFBack = new javax.swing.JTextField();
        HeightLbl = new javax.swing.JLabel();
        BackTroubleLbl = new javax.swing.JLabel();
        HeartTroubleLbl = new javax.swing.JLabel();
        TFHeart = new javax.swing.JTextField();
        TitleLbl = new javax.swing.JLabel();
        ImageLbl = new javax.swing.JLabel();
        ClearBtn = new javax.swing.JButton();
        OutputLbl = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        StartBtn.setText("Calculate ");
        StartBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                StartBtnActionPerformed(evt);
            }
        });

        ExitBtn.setText("Exit");
        ExitBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitBtnActionPerformed(evt);
            }
        });

        TFHeight.setBorder(null);
        TFHeight.setSelectionColor(new java.awt.Color(0, 0, 0));

        TFBack.setBorder(null);
        TFBack.setSelectionColor(new java.awt.Color(0, 0, 0));

        HeightLbl.setText("Height in cm?");

        BackTroubleLbl.setText("Back Trouble (Y/N)?");

        HeartTroubleLbl.setText("Heart Trouble (Y/N)?");

        TFHeart.setBorder(null);
        TFHeart.setSelectionColor(new java.awt.Color(0, 0, 0));

        TitleLbl.setFont(new java.awt.Font("Courier New", 2, 18)); // NOI18N
        TitleLbl.setText("Roller Coaster Ride");

        ClearBtn.setText("Clear");
        ClearBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ClearBtnActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(HeartTroubleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(BackTroubleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(TFBack, javax.swing.GroupLayout.PREFERRED_SIZE, 227, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(OutputLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(HeightLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(TitleLbl, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFHeight, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 227, Short.MAX_VALUE))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ImageLbl)
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(StartBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ExitBtn, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(ClearBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(17, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(241, Short.MAX_VALUE)
                .addComponent(ImageLbl)
                .addGap(86, 86, 86))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(TitleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(StartBtn)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ClearBtn)
                        .addGap(4, 4, 4)
                        .addComponent(ExitBtn))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFHeight)
                            .addComponent(HeightLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(TFBack)
                            .addComponent(BackTroubleLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(HeartTroubleLbl, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(TFHeart, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(OutputLbl, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitBtnActionPerformed
        System.exit(0); // Exit the application
    }//GEN-LAST:event_ExitBtnActionPerformed

    private void StartBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_StartBtnActionPerformed
        try {
            int height = Integer.parseInt(TFHeight.getText());
            String hasBackTrouble = TFBack.getText();
            String hasHeartTrouble = TFHeart.getText();
            if (height >= 122 && height <= 188) {
                if (!hasBackTrouble.equalsIgnoreCase("Y") && !hasHeartTrouble.equalsIgnoreCase("Y")) {
                    OutputLbl.setText("It is safe for you to ride the roller coaster!");
                } else {
                    OutputLbl.setText("Sorry, you are not allowed to ride the roller coaster.");
                }
            } else {
                OutputLbl.setText("Sorry, you do not meet the height requirements for the roller coaster."); 
            }
        } catch (NumberFormatException e)  {
            OutputLbl.setText("Invalid input. Please enter a number and a y or n in the indicated boxes."); // Catches any invalid inputs and asks the use to retry
        }


    }//GEN-LAST:event_StartBtnActionPerformed

    private void ClearBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ClearBtnActionPerformed
        TFBack.setText(""); // Clears Back Input Text Field
        TFHeart.setText(""); // Clears Heart Input Text Field
        TFHeight.setText(""); // Clears Heignt Input Text Field
        OutputLbl.setText(""); // Clears output label
    }//GEN-LAST:event_ClearBtnActionPerformed

    public static void main(String args[]) {
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GUIcomponents().setVisible(true);
        });
    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel BackTroubleLbl;
    private javax.swing.JButton ClearBtn;
    private javax.swing.JButton ExitBtn;
    private javax.swing.JLabel HeartTroubleLbl;
    private javax.swing.JLabel HeightLbl;
    private javax.swing.JLabel ImageLbl;
    private javax.swing.JLabel OutputLbl;
    private javax.swing.JButton StartBtn;
    private javax.swing.JTextField TFBack;
    private javax.swing.JTextField TFHeart;
    private javax.swing.JTextField TFHeight;
    private javax.swing.JLabel TitleLbl;
    // End of variables declaration//GEN-END:variables
}
