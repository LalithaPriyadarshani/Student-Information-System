/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Student.Details;

import java.awt.Color;
import java.sql.*;
import javax.swing.JDesktopPane;
import javax.swing.JOptionPane;

/**
 *
 * @author lalitha
 */
public class Attendence extends javax.swing.JFrame {

    /**
     * Creates new form Attendence
     */
    public Attendence() {
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

        jButton1 = new javax.swing.JButton();
        Lbl_attend = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Txt_attend = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        Lbl_due = new javax.swing.JLabel();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();
        jPanel8 = new javax.swing.JPanel();
        jButton2 = new javax.swing.JButton();
        Search = new javax.swing.JButton();
        combo_course = new javax.swing.JComboBox();
        lbl_course = new javax.swing.JLabel();
        Lbl_id = new javax.swing.JLabel();
        Txt_name = new javax.swing.JTextField();
        Txt_ID = new javax.swing.JTextField();
        Txt_due = new javax.swing.JTextField();
        Lbl_prcnt = new javax.swing.JLabel();
        Txt_prcnt = new javax.swing.JTextField();
        jButton5 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(255, 102, 0));
        setFont(new java.awt.Font("BatangChe", 1, 24)); // NOI18N
        setPreferredSize(new java.awt.Dimension(500, 500));
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });
        getContentPane().setLayout(null);

        jButton1.setText("ADD");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton1);
        jButton1.setBounds(30, 440, 80, 23);

        Lbl_attend.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_attend.setText("Attendence");
        getContentPane().add(Lbl_attend);
        Lbl_attend.setBounds(30, 320, 80, 20);

        jLabel3.setText("jLabel3");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(327, 387, 34, 0);
        getContentPane().add(Txt_attend);
        Txt_attend.setBounds(161, 323, 180, 20);

        jLabel6.setFont(new java.awt.Font("BatangChe", 1, 36)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(204, 204, 204));
        jLabel6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/attendance_list_icon.jpg"))); // NOI18N
        jLabel6.setText(" Attendence ");
        getContentPane().add(jLabel6);
        jLabel6.setBounds(10, 10, 470, 128);

        Lbl_due.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_due.setText("Semester Duration");
        getContentPane().add(Lbl_due);
        Lbl_due.setBounds(30, 290, 120, 15);

        jButton3.setText("Cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton3);
        jButton3.setBounds(230, 440, 90, 23);

        jButton4.setText("Refresh");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton4);
        jButton4.setBounds(340, 440, 100, 23);

        jPanel8.setBackground(new java.awt.Color(197, 197, 197));

        jButton2.setBackground(new java.awt.Color(204, 204, 204));
        jButton2.setText("Calc");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        Search.setText("Search");
        Search.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SearchActionPerformed(evt);
            }
        });

        combo_course.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                combo_courseActionPerformed(evt);
            }
        });

        lbl_course.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        lbl_course.setText("course ");

        Lbl_id.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_id.setText("Name");

        Txt_ID.setText("student ID");
        Txt_ID.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Txt_IDMouseClicked(evt);
            }
        });
        Txt_ID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_IDActionPerformed(evt);
            }
        });

        Txt_due.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_dueActionPerformed(evt);
            }
        });

        Lbl_prcnt.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        Lbl_prcnt.setText("Precentage");

        Txt_prcnt.setEditable(false);
        Txt_prcnt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Txt_prcntActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel8Layout = new javax.swing.GroupLayout(jPanel8);
        jPanel8.setLayout(jPanel8Layout);
        jPanel8Layout.setHorizontalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel8Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Search)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel8Layout.createSequentialGroup()
                                .addComponent(Lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel8Layout.createSequentialGroup()
                                .addComponent(lbl_course, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(79, 79, 79)
                                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(Txt_due, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, 176, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addContainerGap(91, Short.MAX_VALUE))
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addComponent(Lbl_prcnt, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(51, 51, 51)
                        .addComponent(Txt_prcnt, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jButton2)
                        .addGap(163, 163, 163))))
        );
        jPanel8Layout.setVerticalGroup(
            jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel8Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Search)
                    .addComponent(Txt_ID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Lbl_id, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Txt_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(combo_course, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lbl_course))
                .addGap(18, 18, 18)
                .addComponent(Txt_due, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 52, Short.MAX_VALUE)
                .addComponent(jButton2)
                .addGap(18, 18, 18)
                .addGroup(jPanel8Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Lbl_prcnt)
                    .addGroup(jPanel8Layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addComponent(Txt_prcnt, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        getContentPane().add(jPanel8);
        jPanel8.setBounds(20, 140, 410, 290);

        jButton5.setText("update");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });
        getContentPane().add(jButton5);
        jButton5.setBounds(120, 440, 90, 23);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        dispose();
        ManageStudent ms = new ManageStudent();
        ms.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        try {
            Class.forName("com.mysql.jdbc.Driver");

            String constr = "jdbc:mysql://localhost:3306/student_information";

            java.sql.Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmt = dbcon.createStatement();
            String Que = "insert into attendence(reg_no,student_name,course,precentage) values('" + Txt_ID.getText() + "','" + Txt_name.getText() + "','" + combo_course.getSelectedItem().toString() + "','" + Txt_prcnt.getText() + "')";
            int rs = stmt.executeUpdate(Que);

            if (rs == 1) {
                JOptionPane.showMessageDialog(this, "successful");
            } else {
                JOptionPane.showMessageDialog(this, "sorry ,try again");
            }


        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "invalid");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void Txt_prcntActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_prcntActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_prcntActionPerformed

    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        Txt_attend.setText(" ");

        Txt_due.setText(" ");
        Txt_name.setText(" ");
        Txt_ID.setText(" ");
        Txt_prcnt.setText(" ");
    }//GEN-LAST:event_jButton4ActionPerformed

    private void Txt_IDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_IDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_IDActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed

        try {
            double duration = Double.parseDouble(Txt_due.getText());
            double attendence = Double.parseDouble(Txt_attend.getText());

            if (duration < attendence) {
                JOptionPane.showMessageDialog(this, "Enter correct values");
            } else {


                float precentage = (float) (attendence / duration) * 100;
                Txt_prcnt.setText(String.valueOf(precentage));
            }
        } catch (ArithmeticException e) {
            JOptionPane.showMessageDialog(this, "Enter valid duration");
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(this, "please enter values");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "please enter values");

        }

    }//GEN-LAST:event_jButton2ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.gray);
    }//GEN-LAST:event_formWindowOpened

    private void closing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
        ManageStudent ms = new ManageStudent();
        ms.setVisible(true);
    }//GEN-LAST:event_closing

    private void SearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SearchActionPerformed

        try {

            Class.forName("com.mysql.jdbc.Driver");
            String constr = "jdbc:mysql://localhost:3306/student_information";

            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmt = dbcon.createStatement();// for student

            Statement stmt2 = dbcon.createStatement();

            String id = Txt_ID.getText();

            String Query = "select f_name  from student where reg_no='" + id + "'";
            ResultSet rs = stmt.executeQuery(Query);

            String Q2 = "select course_name from course,student_course where course_id=courseId and reg_no='" + id + "'";
            ResultSet rs2 = stmt2.executeQuery(Q2);

            if (rs.next()) {

                Txt_name.setText(rs.getString("f_name"));
            } else {
                JOptionPane.showMessageDialog(this, "Enter student ID");
            }

            while (rs2.next()) {

                combo_course.addItem(rs2.getString("course_name"));
            }

        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, "Invalid Details");

        }

    }//GEN-LAST:event_SearchActionPerformed

    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String constr = "jdbc:mysql://localhost:3306/student_information";

            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmt = dbcon.createStatement();

            String que = "update attendence set precentage ='" + Txt_prcnt.getText() + "' where reg_no='" + Txt_ID.getText() + "'and course='" + combo_course.getSelectedItem().toString() + "' ";
            int i = stmt.executeUpdate(que);
            if (i == 1) {
                JOptionPane.showMessageDialog(this, "successful");
            } else {
                JOptionPane.showMessageDialog(this, "not success ");
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(this, "Invalid Details ");

        }
    }//GEN-LAST:event_jButton5ActionPerformed

    private void combo_courseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_combo_courseActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_combo_courseActionPerformed

    private void Txt_dueActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Txt_dueActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_Txt_dueActionPerformed

    private void Txt_IDMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Txt_IDMouseClicked
        Txt_ID.setText("");
    }//GEN-LAST:event_Txt_IDMouseClicked

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
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Attendence.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new Attendence().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Lbl_attend;
    private javax.swing.JLabel Lbl_due;
    private javax.swing.JLabel Lbl_id;
    private javax.swing.JLabel Lbl_prcnt;
    private javax.swing.JButton Search;
    private javax.swing.JTextField Txt_ID;
    private javax.swing.JTextField Txt_attend;
    private javax.swing.JTextField Txt_due;
    private javax.swing.JTextField Txt_name;
    private javax.swing.JTextField Txt_prcnt;
    private javax.swing.JComboBox combo_course;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel8;
    private javax.swing.JLabel lbl_course;
    // End of variables declaration//GEN-END:variables
}