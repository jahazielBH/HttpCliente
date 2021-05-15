/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package httpcliente.gui;

import java.awt.Component;

/**
 *
 * @author jahaziel
 */
public class Main extends javax.swing.JFrame {

    /**
     * Creates new form Main
     */
    public Main() {
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

        panel = new javax.swing.JPanel();
        desktopPanel = new javax.swing.JDesktopPane();
        menu = new javax.swing.JMenuBar();
        opcmenu = new javax.swing.JMenu();
        opcEmpleado = new javax.swing.JMenuItem();
        opcDepartamento = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        panel.setPreferredSize(new java.awt.Dimension(1280, 720));

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 1280, Short.MAX_VALUE)
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(desktopPanel, javax.swing.GroupLayout.DEFAULT_SIZE, 720, Short.MAX_VALUE)
        );

        opcmenu.setText("Menu");

        opcEmpleado.setText("Crud Empleado");
        opcEmpleado.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcEmpleado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcEmpleadoActionPerformed(evt);
            }
        });
        opcmenu.add(opcEmpleado);

        opcDepartamento.setText("Crud Departamento");
        opcDepartamento.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        opcDepartamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                opcDepartamentoActionPerformed(evt);
            }
        });
        opcmenu.add(opcDepartamento);

        menu.add(opcmenu);

        setJMenuBar(menu);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void opcEmpleadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcEmpleadoActionPerformed
        EmpleadoGUI empgui = EmpleadoGUI.getInstance();
        empgui.setVisible(true);
        for(Component com:desktopPanel.getComponents()){
            if(com.equals(empgui))
                return;
        }
        desktopPanel.add(empgui);
    }//GEN-LAST:event_opcEmpleadoActionPerformed

    private void opcDepartamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_opcDepartamentoActionPerformed
        DepartamentoGUI depgui = DepartamentoGUI.getInstance();
        depgui.setVisible(true);
        for(Component com:desktopPanel.getComponents()){
            if(com.equals(depgui))
                return;
        }
        desktopPanel.add(depgui);
    }//GEN-LAST:event_opcDepartamentoActionPerformed

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
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Main.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Main().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JDesktopPane desktopPanel;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem opcDepartamento;
    private javax.swing.JMenuItem opcEmpleado;
    private javax.swing.JMenu opcmenu;
    private javax.swing.JPanel panel;
    // End of variables declaration//GEN-END:variables
}