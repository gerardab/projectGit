package PKalex2;


import java.awt.Color;


public class JFrameMenu extends javax.swing.JFrame {

    public JFrameMenu() {
        initComponents();
        initConfig();
    }
private void initConfig(){
        this.getContentPane().setBackground(new Color(60, 63, 65));
        this.setLocationRelativeTo(null);
        //this.setSize(new Dimension(1080, 780));
        setResizable(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jBStudent = new javax.swing.JButton();
        jBQuery = new javax.swing.JButton();
        jBEmployee = new javax.swing.JButton();
        jBTeacher = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel1.setBackground(new java.awt.Color(255, 102, 102));
        jPanel1.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jBStudent.setBackground(new java.awt.Color(153, 0, 102));
        jBStudent.setForeground(new java.awt.Color(255, 255, 255));
        jBStudent.setText("Insert Student");
        jBStudent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBStudentActionPerformed(evt);
            }
        });
        jPanel1.add(jBStudent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 190, 170, 60));

        jBQuery.setBackground(new java.awt.Color(153, 0, 102));
        jBQuery.setForeground(new java.awt.Color(255, 255, 255));
        jBQuery.setText("Querys");
        jBQuery.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBQueryActionPerformed(evt);
            }
        });
        jPanel1.add(jBQuery, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 100, 170, 60));

        jBEmployee.setBackground(new java.awt.Color(153, 0, 102));
        jBEmployee.setForeground(new java.awt.Color(255, 255, 255));
        jBEmployee.setText("Insert Employee");
        jBEmployee.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBEmployeeActionPerformed(evt);
            }
        });
        jPanel1.add(jBEmployee, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 190, 170, 60));

        jBTeacher.setBackground(new java.awt.Color(153, 0, 102));
        jBTeacher.setForeground(new java.awt.Color(255, 255, 255));
        jBTeacher.setText("Instert Teacher");
        jBTeacher.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jBTeacherActionPerformed(evt);
            }
        });
        jPanel1.add(jBTeacher, new org.netbeans.lib.awtextra.AbsoluteConstraints(70, 100, 170, 60));

        jLabel2.setFont(new java.awt.Font("Dialog", 1, 48)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("MENU");
        jPanel1.add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 20, -1, -1));

        getContentPane().add(jPanel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 150, 600, 310));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Fotos/FondoMenu.jpg"))); // NOI18N
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(-210, 0, 1430, 720));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jBTeacherActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBTeacherActionPerformed
        
        JframeTeacher teach = new JframeTeacher();
        this.hide();
        teach.show();
    }//GEN-LAST:event_jBTeacherActionPerformed

    private void jBEmployeeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBEmployeeActionPerformed
        JFrameEmployee emp = new JFrameEmployee();
        this.hide();
        emp.show();
    }//GEN-LAST:event_jBEmployeeActionPerformed

    private void jBQueryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBQueryActionPerformed
        JFrameQuery query = new JFrameQuery();
        this.hide();
        query.show();
    }//GEN-LAST:event_jBQueryActionPerformed

    private void jBStudentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jBStudentActionPerformed
        JFrameStudent stu = new JFrameStudent();
        this.hide();
        stu.show();
    }//GEN-LAST:event_jBStudentActionPerformed

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
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFrameMenu.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFrameMenu().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jBEmployee;
    private javax.swing.JButton jBQuery;
    private javax.swing.JButton jBStudent;
    private javax.swing.JButton jBTeacher;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
