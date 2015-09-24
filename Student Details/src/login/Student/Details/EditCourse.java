/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package login.Student.Details;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import java.awt.image.ImageProducer;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.text.Normalizer;
import javax.swing.JOptionPane;

public class EditCourse extends javax.swing.JFrame {
    /**
     * Creates new form EditCourse
     */
    public EditCourse() {
        initComponents();
        fill_combo();        
    }

     private void fill_combo() {

        try {            
            Class.forName("com.mysql.jdbc.Driver");
            String constr = "jdbc:mysql://localhost:3306/student_information";
            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmnt = dbcon.createStatement();

            String query = "select course_name from course ";

            ResultSet result= stmnt.executeQuery(query);
           
            while(result.next()){
               ComboCourse.addItem(result.getString("course_name"));              
            }
 
        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }
    
    @SuppressWarnings("unchecked")  
   
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        ComboCourse = new javax.swing.JComboBox();
        jPanel2 = new javax.swing.JPanel();
        TxtCourseID = new javax.swing.JTextField();
        TxtCourseName = new javax.swing.JTextField();
        TxtCourseLecturer = new javax.swing.JTextField();
        TxtCourseFaculty = new javax.swing.JTextField();
        TxtCourseFee = new javax.swing.JTextField();
        TxtCourseQualifications = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setResizable(false);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closing(evt);
            }
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Eras Bold ITC", 1, 30)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Edit Course");

        jButton1.setText("Save");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("cancel");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        ComboCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCourseItemStateChanged(evt);
            }
        });
        ComboCourse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboCourseActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(192, 192, 192));

        TxtCourseID.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCourseIDActionPerformed(evt);
            }
        });

        TxtCourseName.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCourseNameActionPerformed(evt);
            }
        });

        TxtCourseLecturer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCourseLecturerActionPerformed(evt);
            }
        });

        TxtCourseFee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCourseFeeActionPerformed(evt);
            }
        });

        TxtCourseQualifications.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TxtCourseQualificationsActionPerformed(evt);
            }
        });

        jLabel7.setText("Course ID");

        jLabel2.setText("Course Name");

        jLabel3.setText("Lecturer");

        jLabel4.setText("Faculty");

        jLabel5.setText("Course Fee");

        jLabel6.setText("Qualifications");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(128, 128, 128)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(TxtCourseName, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 240, Short.MAX_VALUE)
                    .addComponent(TxtCourseFee)
                    .addComponent(TxtCourseFaculty)
                    .addComponent(TxtCourseLecturer)
                    .addComponent(TxtCourseID)
                    .addComponent(TxtCourseQualifications))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseLecturer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseFaculty, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseFee, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TxtCourseQualifications, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/EditCourse.JPG"))); // NOI18N
        jLabel8.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 192, 192), 2, true));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addGap(26, 26, 26)
                        .addComponent(ComboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(32, 32, 32))
            .addGroup(layout.createSequentialGroup()
                .addGap(132, 132, 132)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 70, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(107, 107, 107)
                .addComponent(jButton3)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(ComboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addGap(0, 98, Short.MAX_VALUE))
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton3))
                .addGap(19, 19, 19))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        this.dispose();
        ManageCourse mc = new ManageCourse();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton3ActionPerformed

    private void TxtCourseFeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCourseFeeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCourseFeeActionPerformed

    private void TxtCourseNameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCourseNameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCourseNameActionPerformed

    private void ComboCourseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboCourseActionPerformed
             
    }//GEN-LAST:event_ComboCourseActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        String CourseID=TxtCourseID.getText();
        String CourseName=TxtCourseName.getText();
        String Qualifications=TxtCourseQualifications.getText();
        String FacultiName=TxtCourseFaculty.getText();
        String CourseFee=TxtCourseFee.getText();
        String Lecturer=TxtCourseLecturer.getText();
        // String username=TxtUsername.getText();
        
        String Course=ComboCourse.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String constr = "jdbc:mysql://localhost:3306/student_information";
            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmnt = dbcon.createStatement();
            
            String query = " UPDATE Course SET CourseID='"+CourseID+"', course_name='"+CourseName+"', Qualifications='"+Qualifications+"', faculty_name='"+FacultiName+"', course_fee= '"+CourseFee+"', Course_Lecturer='"+Lecturer+"' where  course_name='"+Course+"' ";                         
            int result= stmnt.executeUpdate(query);
            //int result= stmnt.executeUpdate(query);
            
            if(result==1){
                JOptionPane.showMessageDialog(this,"You have Sucsessfully Edited the Course information of '"+CourseName+"' !!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Sorry...You are unable to complete!!");
            }          

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
        
        TxtCourseID.setText(" ");
        TxtCourseName.setText(" ");
        TxtCourseQualifications.setText(" ");
        TxtCourseFaculty.setText(" ");
        TxtCourseFee.setText(" ");
        TxtCourseLecturer.setText(" ");
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void ComboCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCourseItemStateChanged
        
        try {                        
                         
              String Course=ComboCourse.getSelectedItem().toString();

              Class.forName("com.mysql.jdbc.Driver");
              String constr = "jdbc:mysql://localhost:3306/student_information";
              Connection dbcon = DriverManager.getConnection(constr, "root", "123");
              Statement stmnt = dbcon.createStatement();

              String query = "select   courseID, course_name, Qualifications, faculty_name, course_fee, Course_Lecturer  from course where course_name='"+Course+"' " ;
              
              ResultSet result= stmnt.executeQuery(query);
              
              if(result.next()){
              TxtCourseID.setText(result.getString("courseID"));    
              TxtCourseName.setText(result.getString("course_name"));
              TxtCourseQualifications.setText(result.getString("Qualifications"));
              TxtCourseLecturer.setText(result.getString("Course_Lecturer"));
              TxtCourseFaculty.setText(result.getString("faculty_name"));
              TxtCourseFee.setText(result.getString("course_fee"));           
              TxtCourseLecturer.setText(result.getString("Course_Lecturer"));
              }
              
        } catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
    }//GEN-LAST:event_ComboCourseItemStateChanged

    private void TxtCourseIDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCourseIDActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCourseIDActionPerformed

    private void TxtCourseLecturerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCourseLecturerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCourseLecturerActionPerformed

    private void TxtCourseQualificationsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_TxtCourseQualificationsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_TxtCourseQualificationsActionPerformed

    private void closing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
        ManageCourse mc = new ManageCourse();
        mc.setVisible(true);
    }//GEN-LAST:event_closing

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.gray);
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
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(EditCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new EditCourse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCourse;
    private javax.swing.JTextField TxtCourseFaculty;
    private javax.swing.JTextField TxtCourseFee;
    private javax.swing.JTextField TxtCourseID;
    private javax.swing.JTextField TxtCourseLecturer;
    private javax.swing.JTextField TxtCourseName;
    private javax.swing.JTextField TxtCourseQualifications;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel2;
    // End of variables declaration//GEN-END:variables
}
