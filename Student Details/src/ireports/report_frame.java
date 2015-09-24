/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package ireports;

import java.awt.BorderLayout;
import java.awt.Container;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.HashMap;
import login.Student.Details.MainWindow;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JRViewer;

/**
 *
 * @author lalitha
 */
public class report_frame extends javax.swing.JInternalFrame {

    /**
     * Creates new form report_frame
     */
    public report_frame() {
        initComponents();
    }
    
     public report_frame(String fileName, HashMap parameter) {
        this();
        try {

            Class.forName("com.mysql.jdbc.Driver");
            String constr = new String("jdbc:mysql://localhost:3306/student_information");
            Connection dbcon = DriverManager.getConnection(constr, "root", "123");
            Statement stmt = dbcon.createStatement();


           
            JasperPrint print = JasperFillManager.fillReport(fileName, parameter, dbcon);
            JRViewer viewer = new JRViewer(print);
            Container c = getContentPane();
            c.setLayout(new BorderLayout());
            c.add(viewer);
        } catch (Exception jre) {
            jre.printStackTrace();
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

        addInternalFrameListener(new javax.swing.event.InternalFrameListener() {
            public void internalFrameActivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameClosed(javax.swing.event.InternalFrameEvent evt) {
                closed(evt);
            }
            public void internalFrameClosing(javax.swing.event.InternalFrameEvent evt) {
                closing(evt);
            }
            public void internalFrameDeactivated(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameDeiconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameIconified(javax.swing.event.InternalFrameEvent evt) {
            }
            public void internalFrameOpened(javax.swing.event.InternalFrameEvent evt) {
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 394, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 282, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void closing(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_closing
        // TODO add your handling code here:
        this.dispose();
        
        
    }//GEN-LAST:event_closing

    private void closed(javax.swing.event.InternalFrameEvent evt) {//GEN-FIRST:event_closed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_closed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}