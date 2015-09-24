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
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class RemoveCourse extends javax.swing.JFrame {

    /**
     * Creates new form RemoveCourse
     */
    public RemoveCourse() {
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

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        ComboCourse = new javax.swing.JComboBox();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        table_rmv = new javax.swing.JTable();

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
        jLabel1.setText("Remove Course");

        jButton1.setText("Remove");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Cancel");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        ComboCourse.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                ComboCourseItemStateChanged(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/RemoveCourse.jpg"))); // NOI18N
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(192, 192, 192), 2, true));

        table_rmv.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Qualification", "fee ", "Faculty", "Lecturer"
            }
        ));
        jScrollPane1.setViewportView(table_rmv);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(29, 29, 29)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(ComboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 460, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(44, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(102, 102, 102)
                .addComponent(jButton2)
                .addGap(149, 149, 149))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(21, 21, 21)
                        .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(55, 55, 55)
                        .addComponent(jLabel1)))
                .addGap(19, 19, 19)
                .addComponent(ComboCourse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 72, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton2)
                    .addComponent(jButton1))
                .addContainerGap(38, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        ManageCourse mc = new ManageCourse();
        mc.setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
      fill_combo(); 

      DefaultTableModel md1 = (DefaultTableModel)table_rmv.getModel();
        md1.setRowCount(0);
        String Course=ComboCourse.getSelectedItem().toString();
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
            String constr = "jdbc:mysql://localhost:3306/student_information";
            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmnt = dbcon.createStatement();
            
            String query = " DELETE FROM Course WHERE course_name='"+Course+"' " ;                    
            int result= stmnt.executeUpdate(query);
                        
            if(result==1){
                JOptionPane.showMessageDialog(this,"You have Sucsessfully Deleted the Course '"+Course+"'!!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Sorry...Removing Course '"+Course+"' Failed!!");
               
            }          

        }catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }     
        
    }//GEN-LAST:event_jButton1ActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        getContentPane().setBackground(Color.gray);
    }//GEN-LAST:event_formWindowOpened

    private void ComboCourseItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_ComboCourseItemStateChanged
     
        try {     
            
              String Course=ComboCourse.getSelectedItem().toString();
           
                Class.forName("com.mysql.jdbc.Driver");
            
              String constr = "jdbc:mysql://localhost:3306/student_information";
              Connection dbcon = DriverManager.getConnection(constr, "root", "123");
              Statement stmnt = dbcon.createStatement();

              String query = "select   courseID, course_name, Qualifications, faculty_name, course_fee, Course_Lecturer  from course where course_name='"+Course+"' " ;
              
              ResultSet result= stmnt.executeQuery(query);
              
            
             
              
                DefaultTableModel md=(DefaultTableModel)table_rmv.getModel();
                md.setRowCount(0);

               while(result.next()){
                      String id=String.valueOf( result.getInt("courseId"));
               String name = result.getString("course_name");
               String qualification = result.getString("Qualifications");
               String faculty = result.getString("faculty_name");
               String Lecturer=result.getString("course_Lecturer");
               String  course_fee=String.valueOf(result.getDouble("course_fee"));
               
              String data[] = {id,name,qualification,course_fee,faculty,Lecturer};
               
                  md.addRow(data);
               }
              
                       }

       
    
              
         catch (Exception e) {
            JOptionPane.showMessageDialog(this, e);
        }
     
        
      
    }//GEN-LAST:event_ComboCourseItemStateChanged

    private void closing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
        ManageCourse mc = new ManageCourse();
        mc.setVisible(true);
    }//GEN-LAST:event_closing

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
            java.util.logging.Logger.getLogger(RemoveCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RemoveCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RemoveCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RemoveCourse.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RemoveCourse().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox ComboCourse;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable table_rmv;
    // End of variables declaration//GEN-END:variables
}
