/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ireports;

import java.util.HashMap;

/**
 *
 * @author lalitha
 */
public class report_viewer extends javax.swing.JFrame {

    /**
     * Creates new form report_viewer
     */
    public report_viewer() {
        initComponents();
    }
    
    public void attendenceDetails(String name){
    
    
    
    if (name != null) {
       
            this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                parameters.put("input", name);
                 report_frame Viewer = new report_frame("./src/ireports/Attendence_details.jasper", parameters);
                Viewer.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                Viewer.setVisible(true);
                jDesktopPane1.add(Viewer);
                Viewer.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
            }
        }
    }
    
     public void viewCourseDetails(){
                    this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                report_frame jif = new report_frame("./src/ireports/Course Details.jasper", parameters);
                jif.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                jif.setVisible(true);
                jDesktopPane1.add(jif);
                jif.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
            }

        

    }
     
     public void student_details(String reg_no){
        
        if (reg_no != null) {
            this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                parameters.put("input", reg_no);
                report_frame myiReportViewer = new report_frame("./src/ireports/stu_details.jasper", parameters);
                myiReportViewer.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                myiReportViewer.setVisible(true);
                jDesktopPane1.add(myiReportViewer);
                myiReportViewer.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
            }
        }
     }
     public void facultyStudent(String stuId){
    
            if ( stuId!= null) {
            this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                parameters.put("input", stuId);
                report_frame st= new report_frame("./src/ireports/faculty_student_1.jasper", parameters);
                st.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                st.setVisible(true);
                jDesktopPane1.add(st);
               st.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
            }
        }

    }
     
     
      public void FacultyCourse(String FName){
    if (FName != null) {
            this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                parameters.put("input", FName);
                report_frame fn = new report_frame("./src/ireports/Faculty course details.jasper" ,parameters);
                fn.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                fn.setVisible(true);
                jDesktopPane1.add(fn);
                fn.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
            }
        }

    }
      public void studentGpaDetails(){
                    this.setVisible(true);
            try {
                HashMap parameters = new HashMap();
                report_frame jif = new report_frame("./src/ireports/Student_GPA_Report.jasper", parameters);
                jif.setBounds(0, 0, jDesktopPane1.getWidth(), jDesktopPane1.getHeight());
                jif.setVisible(true);
                jDesktopPane1.add(jif);
                jif.setSelected(true);
            } catch (Exception pve) {
                pve.printStackTrace();
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

        jDesktopPane1 = new javax.swing.JDesktopPane();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowClosing(java.awt.event.WindowEvent evt) {
                closing(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 1182, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jDesktopPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 758, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closing(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closing

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
            java.util.logging.Logger.getLogger(report_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(report_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(report_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(report_viewer.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /*
         * Create and display the form
         */
        java.awt.EventQueue.invokeLater(new Runnable() {

            public void run() {
                new report_viewer().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane jDesktopPane1;
    // End of variables declaration//GEN-END:variables
}
