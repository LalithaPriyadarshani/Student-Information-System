/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Student.Details;

import java.awt.Color;

/**
 *
 * @author User
 */
public class MainWindow extends javax.swing.JFrame {

    /**
     * Creates new form MainWindow
     */
    public MainWindow() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblState = new javax.swing.JLabel();
        btnCDetails = new javax.swing.JButton();
        btnSDetails = new javax.swing.JButton();
        btnCoursem = new javax.swing.JButton();
        btnLecturerm = new javax.swing.JButton();
        btnAdmin = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lbluser = new javax.swing.JLabel();
        lblstd = new javax.swing.JLabel();
        lblcourse = new javax.swing.JLabel();
        lbladmin = new javax.swing.JLabel();
        lbllec = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        btnStudentm = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuChngPassword = new javax.swing.JMenuItem();
        menuLogout = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.DO_NOTHING_ON_CLOSE);
        setName("MainWindow"); // NOI18N
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowActivated(java.awt.event.WindowEvent evt) {
                Winactive(evt);
            }
            public void windowClosing(java.awt.event.WindowEvent evt) {
                close(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
                opened(evt);
            }
        });

        btnCDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnCDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c12.png"))); // NOI18N
        btnCDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCDetailsActionPerformed(evt);
            }
        });

        btnSDetails.setBackground(new java.awt.Color(255, 255, 255));
        btnSDetails.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/std0.jpg"))); // NOI18N
        btnSDetails.setText(" ");
        btnSDetails.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSDetailsActionPerformed(evt);
            }
        });

        btnCoursem.setBackground(new java.awt.Color(255, 255, 255));
        btnCoursem.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/c2_1.jpg"))); // NOI18N
        btnCoursem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCoursemActionPerformed(evt);
            }
        });

        btnLecturerm.setBackground(new java.awt.Color(255, 255, 255));
        btnLecturerm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/lec3.jpg"))); // NOI18N
        btnLecturerm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLecturermActionPerformed(evt);
            }
        });

        btnAdmin.setBackground(new java.awt.Color(255, 255, 255));
        btnAdmin.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/ad2.jpg"))); // NOI18N
        btnAdmin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAdminActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/image/student.gif"))); // NOI18N
        jLabel1.setText("jLabel1");

        lbluser.setFont(new java.awt.Font("Tempus Sans ITC", 1, 24)); // NOI18N

        lblstd.setText("Student");

        lblcourse.setText("Course");

        lbladmin.setText("Admin");

        lbllec.setText("Lecturer");

        jLabel3.setText("Course Details");

        jLabel4.setText("Student Details");

        btnStudentm.setBackground(new java.awt.Color(255, 255, 255));
        btnStudentm.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/s12.jpg"))); // NOI18N
        btnStudentm.setText(" ");
        btnStudentm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnStudentmActionPerformed(evt);
            }
        });

        jMenu1.setText("User");

        menuChngPassword.setText("Change Password");
        menuChngPassword.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuChngPasswordActionPerformed(evt);
            }
        });
        jMenu1.add(menuChngPassword);

        menuLogout.setText("Logout");
        menuLogout.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                menuLogoutActionPerformed(evt);
            }
        });
        jMenu1.add(menuLogout);

        jMenuBar1.add(jMenu1);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSDetails, javax.swing.GroupLayout.DEFAULT_SIZE, 131, Short.MAX_VALUE)
                            .addComponent(btnStudentm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(btnCDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(btnCoursem, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(0, 0, Short.MAX_VALUE)
                                        .addComponent(btnLecturerm, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(4, 4, 4))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(lblState)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(64, 64, 64)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(81, 81, 81)
                        .addComponent(lbladmin)
                        .addGap(62, 62, 62))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(lblstd)
                        .addGap(106, 106, 106)
                        .addComponent(lblcourse)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lbllec)
                        .addGap(53, 53, 53)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 259, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(lbluser, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addComponent(lblState)))
                .addGap(37, 37, 37)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 343, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnLecturerm, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCoursem, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(btnStudentm, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lblstd)
                            .addComponent(lblcourse)
                            .addComponent(lbllec))
                        .addGap(22, 22, 22)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnAdmin, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                .addComponent(btnSDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(btnCDetails, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(lbladmin)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addContainerGap())))
        );

        getAccessibleContext().setAccessibleName("MainWindow");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void close(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_close
        // TODO add your handling code here:
        
        this.dispose();
        Login lg = new Login();
        lg.setVisible(true);
    }//GEN-LAST:event_close

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
     getContentPane().setBackground(Color.gray);
    }//GEN-LAST:event_formWindowOpened

    private void menuChngPasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuChngPasswordActionPerformed
        // TODO add your handling code here:
        
        ChangePassword cp = new ChangePassword();
        cp.txtchguser.setText(this.lbluser.getText());
        cp.setVisible(true);
        
    }//GEN-LAST:event_menuChngPasswordActionPerformed

    private void btnCoursemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCoursemActionPerformed
        // TODO add your handling code here:
       ManageCourse frame4 = new ManageCourse();
       frame4.setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_btnCoursemActionPerformed

    private void btnLecturermActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLecturermActionPerformed
        // TODO add your handling code here:
        ManageLecturer frame5 = new ManageLecturer();
        frame5.setVisible(true);
        //this.setVisible(false);
    }//GEN-LAST:event_btnLecturermActionPerformed

    private void btnSDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSDetailsActionPerformed
        // TODO add your handling code here:
       StudentDetails fram6 = new StudentDetails();
       fram6.setVisible(true);
       //this.setVisible(false);
    }//GEN-LAST:event_btnSDetailsActionPerformed

    private void btnCDetailsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCDetailsActionPerformed
        // TODO add your handling code here:
      CourseDetails frame6 = new CourseDetails();
      frame6.setVisible(true);
      //this.setVisible(false);
    }//GEN-LAST:event_btnCDetailsActionPerformed

    private void btnAdminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAdminActionPerformed
        // TODO add your handling code here:
        Admin ad = new Admin();
        ad.setVisible(true);
    }//GEN-LAST:event_btnAdminActionPerformed

    private void menuLogoutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_menuLogoutActionPerformed
        // TODO add your handling code here:
        this.dispose();
        Login lg1 = new Login();
        lg1.setVisible(true);
    }//GEN-LAST:event_menuLogoutActionPerformed

    private void opened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_opened
        // TODO add your handling code here:
        
        
    }//GEN-LAST:event_opened

    private void Winactive(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_Winactive
        // TODO add your handling code here:
       if(lblState.getText().equals("Lecturer")) {
             this.btnStudentm.setVisible(false);
             this.btnCoursem.setVisible(false);
             this.btnLecturerm.setVisible(false);
             this.btnAdmin.setVisible(false);
             this.lblstd.setVisible(false);
             this.lblcourse.setVisible(false);
             this.lbladmin.setVisible(false);
             this.lbllec.setVisible(false);
             
       }
    }//GEN-LAST:event_Winactive

    private void btnStudentmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnStudentmActionPerformed
        // TODO add your handling code here:
        ManageStudent frame = new ManageStudent();
        frame.setVisible(true);
    }//GEN-LAST:event_btnStudentmActionPerformed

   
    
    
    
    
    
    
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
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MainWindow.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainWindow().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdmin;
    private javax.swing.JButton btnCDetails;
    public javax.swing.JButton btnCoursem;
    public javax.swing.JButton btnLecturerm;
    private javax.swing.JButton btnSDetails;
    public javax.swing.JButton btnStudentm;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    public javax.swing.JLabel lblState;
    private javax.swing.JLabel lbladmin;
    private javax.swing.JLabel lblcourse;
    public javax.swing.JLabel lbllec;
    private javax.swing.JLabel lblstd;
    public javax.swing.JLabel lbluser;
    private javax.swing.JMenuItem menuChngPassword;
    private javax.swing.JMenuItem menuLogout;
    // End of variables declaration//GEN-END:variables
}