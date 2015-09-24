/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package student.details;

import login.Student.Details.Login;

/**
 *
 * @author User
 */
public class StudentDetails {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                new Login().setVisible(true);
            }
        });
    }
}
