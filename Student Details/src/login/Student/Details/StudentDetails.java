/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Student.Details;

import ireports.report_viewer;
import java.awt.Color;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import javax.swing.JOptionPane;

/**
 *
 * @author User
 */
public class StudentDetails extends javax.swing.JFrame {

    /**
     * Creates new form StudentDetails
     */
    public StudentDetails() {
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
        txt_search = new javax.swing.JTextField();
        jbtn_search = new javax.swing.JButton();
        jbtn_ok = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jtxt_name = new javax.swing.JTextField();
        jtxt_address = new javax.swing.JTextField();
        jtxt_age = new javax.swing.JTextField();
        jtxt_gender = new javax.swing.JTextField();
        jtxt_faculty = new javax.swing.JTextField();
        jtxt_gpa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        btnattendance = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        txt_faculty = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(197, 197, 197));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                color(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setText("Student Details");

        txt_search.setText("Student ID");
        txt_search.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mousePressed(java.awt.event.MouseEvent evt) {
                add(evt);
            }
        });
        txt_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_searchActionPerformed(evt);
            }
        });

        jbtn_search.setText("Search");
        jbtn_search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_searchActionPerformed(evt);
            }
        });

        jbtn_ok.setText("OK");
        jbtn_ok.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jbtn_okActionPerformed(evt);
            }
        });

        jPanel1.setBackground(new java.awt.Color(197, 197, 197));

        jLabel2.setText("Name");

        jLabel3.setText("Address");

        jLabel4.setText("Age");

        jLabel5.setText("Gender");

        jLabel6.setText("Faculty");

        jLabel7.setText("GPA");

        jtxt_name.setEditable(false);

        jtxt_address.setEditable(false);

        jtxt_age.setEditable(false);
        jtxt_age.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxt_ageActionPerformed(evt);
            }
        });

        jtxt_gender.setEditable(false);

        jtxt_faculty.setEditable(false);

        jtxt_gpa.setEditable(false);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(59, 59, 59)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jtxt_gpa)
                    .addComponent(jtxt_faculty, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jtxt_gender)
                    .addComponent(jtxt_name)
                    .addComponent(jtxt_address)
                    .addComponent(jtxt_age, javax.swing.GroupLayout.PREFERRED_SIZE, 187, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(71, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtxt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(jtxt_address, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jtxt_age, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jtxt_gender, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(9, 9, 9)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jtxt_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jtxt_gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(75, Short.MAX_VALUE))
        );

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Magnifier.jpg"))); // NOI18N

        btnattendance.setText("Attendance");
        btnattendance.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnattendanceActionPerformed(evt);
            }
        });

        jButton1.setText("View Student Details");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Student GPA Report");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        txt_faculty.setText("Enter Faculty Name");
        txt_faculty.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                StudentDetails.this.mouseClicked(evt);
            }
        });

        jButton3.setText("view faculty student details");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_search)
                                .addGap(32, 32, 32)
                                .addComponent(jLabel9))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(182, 182, 182)
                                .addComponent(jLabel1)))
                        .addGap(0, 183, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnattendance)
                                .addGap(18, 18, 18)
                                .addComponent(jbtn_ok))
                            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txt_faculty, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(46, 46, 46)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txt_search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jbtn_search)))
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(15, 15, 15)
                        .addComponent(jButton1)
                        .addGap(18, 18, 18)
                        .addComponent(jButton2)
                        .addGap(51, 51, 51)
                        .addComponent(txt_faculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jButton3)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 38, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jbtn_ok)
                    .addComponent(btnattendance))
                .addGap(21, 21, 21))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtxt_ageActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxt_ageActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jtxt_ageActionPerformed

    private void jbtn_okActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_okActionPerformed
        dispose();
    }//GEN-LAST:event_jbtn_okActionPerformed

    private void jbtn_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jbtn_searchActionPerformed

        if (txt_search.getText().equals("") || txt_search.getText().equals("Student ID")) {

            JOptionPane.showMessageDialog(this, "Please enter Student ID");
        } else {

            try {

                Class.forName("com.mysql.jdbc.Driver");
                String constr = "jdbc:mysql://localhost:3306/student_information";

                Connection dbcon = DriverManager.getConnection(constr, "root", "123");
                Statement stmt = dbcon.createStatement();

                String query = "select *  from student where reg_no='" + txt_search.getText() + "'";
                ResultSet rst = stmt.executeQuery(query);
                //  JOptionPane.showMessageDialog(this, "ok");

                if (rst.next()) {

                    jtxt_name.setText(rst.getString("f_name") + " " + rst.getString("l_name"));
                    jtxt_address.setText(rst.getString("line_1") + " " + rst.getString("line_2"));
                    jtxt_age.setText(rst.getString("age"));
                    jtxt_gender.setText(rst.getString("gender"));
                    jtxt_faculty.setText(rst.getString("faculty_name"));
                    jtxt_gpa.setText(rst.getString("gpa"));

                } else {

                    JOptionPane.showMessageDialog(this, "Invalid ID");
                }
            } catch (Exception e) {

                JOptionPane.showMessageDialog(this, e);
            }
        }

        // TODO add your handling code here:
    }//GEN-LAST:event_jbtn_searchActionPerformed

    private void txt_searchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_searchActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_searchActionPerformed

    private void color(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_color
        getContentPane().setBackground(Color.GRAY);
    }//GEN-LAST:event_color

    private void add(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_add
        txt_search.setText("");
        // TODO add your handling code here:
    }//GEN-LAST:event_add

    private void closing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
        /*
         * MainWindow mw1 = new MainWindow();
        mw1.setVisible(true);
         */
    }//GEN-LAST:event_closing

    private void btnattendanceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnattendanceActionPerformed
        // TODO add your handling code here:

        try {
              ViewAttendence va = new ViewAttendence();
                va.setVisible(true);

            if (txt_search.getText().equals("") || txt_search.getText().equals("Student ID")) {

                JOptionPane.showMessageDialog(this, "Please Insert ID", "Error", WIDTH);
            } else {

              

                va.txtID.setText(txt_search.getText());

            }



            Class.forName("com.mysql.jdbc.Driver");

            String constr = "jdbc:mysql://localhost:3306/student_information";

            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmt = dbcon.createStatement();

            String q = "select student_name from attendence where reg_no='" + va.txtID.getText() +
            "'";
            ResultSet rs = stmt.executeQuery(q);
            
            if (rs.next()) {
                va.Txt_name.setText(rs.getString("student_name"));
            }


        } catch (Exception e) {
        }

    }//GEN-LAST:event_btnattendanceActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        report_viewer sd = new report_viewer();
        sd.student_details(txt_search.getText());
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        report_viewer st = new report_viewer();
        st.studentGpaDetails();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        report_viewer st = new report_viewer();
        st.facultyStudent(txt_faculty.getText());
    }//GEN-LAST:event_jButton3ActionPerformed

    private void mouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_mouseClicked
        // TODO add your handling code here:
        txt_faculty.setText("");
    }//GEN-LAST:event_mouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /*
         * Set the Nimbus look and feel
         */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the
         * default look and feel. For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(StudentDetails.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new StudentDetails().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnattendance;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JButton jbtn_ok;
    private javax.swing.JButton jbtn_search;
    private javax.swing.JTextField jtxt_address;
    private javax.swing.JTextField jtxt_age;
    private javax.swing.JTextField jtxt_faculty;
    private javax.swing.JTextField jtxt_gender;
    private javax.swing.JTextField jtxt_gpa;
    private javax.swing.JTextField jtxt_name;
    private javax.swing.JTextField txt_faculty;
    private javax.swing.JTextField txt_search;
    // End of variables declaration//GEN-END:variables
}