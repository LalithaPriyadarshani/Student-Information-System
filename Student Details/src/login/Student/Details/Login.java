/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Student.Details;

import java.awt.Color;
import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.basic.BasicInternalFrameTitlePane;
/**
 *
 * @author User
 */
public class Login extends javax.swing.JFrame {

   
    public Login() {
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtuser = new javax.swing.JTextField();
        ok = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtpassword = new javax.swing.JPasswordField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setName("LoginFram"); // NOI18N
        setPreferredSize(new java.awt.Dimension(600, 434));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel1.setText("User Name");
        getContentPane().add(jLabel1);
        jLabel1.setBounds(60, 300, 110, 14);

        jLabel2.setFont(new java.awt.Font("Tahoma", 1, 11)); // NOI18N
        jLabel2.setText("Password");
        getContentPane().add(jLabel2);
        jLabel2.setBounds(60, 340, 100, 14);

        txtuser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtuserActionPerformed(evt);
            }
        });
        getContentPane().add(txtuser);
        txtuser.setBounds(180, 300, 134, 20);

        ok.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/log22.jpg"))); // NOI18N
        ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okActionPerformed(evt);
            }
        });
        getContentPane().add(ok);
        ok.setBounds(370, 310, 129, 33);

        jLabel3.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel3.setText("Student Information System");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(140, 20, 420, 29);

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/4.jpg"))); // NOI18N
        getContentPane().add(jLabel5);
        jLabel5.setBounds(20, -20, 640, 430);

        jLabel4.setText("jLabel4");
        getContentPane().add(jLabel4);
        jLabel4.setBounds(20, 40, 120, 150);
        getContentPane().add(txtpassword);
        txtpassword.setBounds(180, 340, 130, 20);

        pack();
    }// </editor-fold>//GEN-END:initComponents

     
    private void okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okActionPerformed
 
        
        try{
            
                    
            if(txtuser.getText().equals("") || txtpassword.getText().equals("")){
                
                JOptionPane.showMessageDialog(this, "Please Enter Username & Password", "Message", WIDTH);
            }
            else{// connect
                Class.forName("com.mysql.jdbc.Driver");
                Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/student_information","root","123");
                Statement stm = conn.createStatement();
                String qry = "select password from login where username = '"+txtuser.getText()+"' ;";
                ResultSet rst = stm.executeQuery(qry);
            
                Statement stm2 = conn.createStatement();
                String qry2 = "select state from login where username = '"+txtuser.getText()+"'; "; 
                ResultSet rst2 = stm2.executeQuery(qry2);
            
                if(!rst.next()){// validate username
            
                    JOptionPane.showMessageDialog(this, "Invalid Username", "Error", WIDTH);          
                }
                else if(rst.getString("password").equals(txtpassword.getText())){ // check password
            
                    MainWindow m = new MainWindow();// open main
                    m.setVisible(true);
                
                    m.lbluser.setText(txtuser.getText());
                    
                    if(rst2.next() && rst2.getInt("State") == 1){// block lecturer
                
                        m.lblState.setText("Admin");
                    }
                    else{
                
                        m.lblState.setText("Lecturer");
                       /* MainWindow mw1 = new MainWindow();
                        mw1.btnStudentm.setVisible(false);
                        mw1.btnCoursem.setVisible(false);
                        mw1.btnLecturerm.setVisible(false);
                        mw1.btnAdmin.setVisible(false);
                        mw1.lbllec.setVisible(false);*/
                    }
                    
                
                    this.setVisible(false);
                    txtuser.setText("");
                    txtpassword.setText("");
                
                }
                else{
                
                    JOptionPane.showMessageDialog(this, "Invalid Password", "Error", WIDTH);
                }
            }
        
        
        }catch (Exception e){
        
            JOptionPane.showMessageDialog(this, "Error in Excecution "+e, "Error", WIDTH);
        }
        
       
        
        
        
        
    }//GEN-LAST:event_okActionPerformed

    private void txtuserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtuserActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtuserActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.white);
    }//GEN-LAST:event_formWindowOpened

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
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Login.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JButton ok;
    private javax.swing.JPasswordField txtpassword;
    public javax.swing.JTextField txtuser;
    // End of variables declaration//GEN-END:variables
}
