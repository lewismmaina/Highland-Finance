
import static java.lang.Thread.sleep;
import java.util.Calendar;
import java.util.GregorianCalendar;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author user
 */
public class Confirm extends javax.swing.JFrame {

    /**
     * Creates new form Confirm
     */
    public Confirm() {
        initComponents();
        currentTimeDate();
    }
public Confirm(String para){
        initComponents();
        
        jTextField_User.setText(para);}
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jBtn_SalaryDetails = new javax.swing.JButton();
        jBtn_SalaryDetails1 = new javax.swing.JButton();
        jBtn_Add = new javax.swing.JButton();
        jBtn_Exit = new javax.swing.JButton();
        jBtn_SalaryDetails2 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jTextField_User = new javax.swing.JLabel();
        jBtn_Add4 = new javax.swing.JButton();
        jBtn_SalaryDetails3 = new javax.swing.JButton();
        jLabel_Date = new javax.swing.JLabel();
        jLabel_Time = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 5));
        jPanel1.setPreferredSize(new java.awt.Dimension(800, 500));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("BARAKA ROSES");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Click on the Required Service:");

        jBtn_SalaryDetails.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails.setText("2.Add Record");
        jBtn_SalaryDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetailsActionPerformed(evt);
            }
        });

        jBtn_SalaryDetails1.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails1.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails1.setText("3.Modify/Delete Record");
        jBtn_SalaryDetails1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetails1ActionPerformed(evt);
            }
        });

        jBtn_Add.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_Add.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Add.setText("5.Modify/Delete User");
        jBtn_Add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_AddActionPerformed(evt);
            }
        });

        jBtn_Exit.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_Exit.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Exit.setText("7.Quit");
        jBtn_Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_ExitActionPerformed(evt);
            }
        });

        jBtn_SalaryDetails2.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails2.setText("4.Add User");
        jBtn_SalaryDetails2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetails2ActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        jLabel5.setText("Logged in as");

        jTextField_User.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jBtn_Add4.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_Add4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_Add4.setText("6.Main Menu");
        jBtn_Add4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_Add4ActionPerformed(evt);
            }
        });

        jBtn_SalaryDetails3.setBackground(new java.awt.Color(255, 51, 51));
        jBtn_SalaryDetails3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jBtn_SalaryDetails3.setText("1.Complaints");
        jBtn_SalaryDetails3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBtn_SalaryDetails3ActionPerformed(evt);
            }
        });

        jLabel_Date.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel_Time.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jBtn_SalaryDetails, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_SalaryDetails1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_SalaryDetails2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Add, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Add4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jBtn_SalaryDetails3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(23, 23, 23))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 291, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 129, Short.MAX_VALUE)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(57, 57, 57))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel_Time, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel_Date, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jTextField_User, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                .addComponent(jBtn_SalaryDetails3)
                .addGap(26, 26, 26)
                .addComponent(jBtn_SalaryDetails)
                .addGap(27, 27, 27)
                .addComponent(jBtn_SalaryDetails1)
                .addGap(18, 18, 18)
                .addComponent(jBtn_SalaryDetails2)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Add)
                .addGap(30, 30, 30)
                .addComponent(jBtn_Add4)
                .addGap(18, 18, 18)
                .addComponent(jBtn_Exit)
                .addGap(30, 30, 30))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 800, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(0, 0, Short.MAX_VALUE)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    public void currentTimeDate(){
        Thread clock=new Thread(){
        public void run(){
            for(;;){
                Calendar cal=new GregorianCalendar();
    int second=cal.get(Calendar.SECOND);
    int minute=cal.get(Calendar.MINUTE);
    int hour=cal.get(Calendar.HOUR); 
    jLabel_Time.setText("Current Time  "+hour+":"+minute+":"+second);
    
    
    int day=cal.get(Calendar.DAY_OF_MONTH);
    int month=cal.get(Calendar.MONTH);
    int year=cal.get(Calendar.YEAR); 
    jLabel_Date.setText("Current Date  "+day+"/"+(month+1)+"/"+year);
     try{
         sleep (1000);  
    }catch (InterruptedException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
        }
        };
        clock.start();
    }
    private void jBtn_SalaryDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetailsActionPerformed

        new NewRecord().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_jBtn_SalaryDetailsActionPerformed

    private void jBtn_SalaryDetails1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetails1ActionPerformed

        new Modify_DeleteRecord().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_jBtn_SalaryDetails1ActionPerformed

    private void jBtn_AddActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_AddActionPerformed
        new UserModification().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_jBtn_AddActionPerformed

    private void jBtn_ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_ExitActionPerformed
        System.exit(0);        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_ExitActionPerformed

    private void jBtn_SalaryDetails2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetails2ActionPerformed
      new NewUsers().setVisible(true);
        this.setVisible(false);;
    }//GEN-LAST:event_jBtn_SalaryDetails2ActionPerformed

    private void jBtn_Add4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_Add4ActionPerformed
        new welcome().setVisible(true);
        this.setVisible(false);;        // TODO add your handling code here:
    }//GEN-LAST:event_jBtn_Add4ActionPerformed

    private void jBtn_SalaryDetails3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBtn_SalaryDetails3ActionPerformed
       new mycomplaints().setVisible(true);
        this.setVisible(false);; 
    }//GEN-LAST:event_jBtn_SalaryDetails3ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Confirm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Confirm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBtn_Add;
    private javax.swing.JButton jBtn_Add4;
    private javax.swing.JButton jBtn_Exit;
    private javax.swing.JButton jBtn_SalaryDetails;
    private javax.swing.JButton jBtn_SalaryDetails1;
    private javax.swing.JButton jBtn_SalaryDetails2;
    private javax.swing.JButton jBtn_SalaryDetails3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel_Date;
    private javax.swing.JLabel jLabel_Time;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel jTextField_User;
    // End of variables declaration//GEN-END:variables
}