/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg1.GUIs;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

/**
 *
 * @author Anabella Jaua
 */
public class Ventana1 extends javax.swing.JFrame {

    /**
     * Creates new form Ventana1
     */
    public Ventana1() {
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
        ingresar = new javax.swing.JButton();
        ShowGraph = new javax.swing.JButton();
        ShowIslas = new javax.swing.JButton();
        ShowPuentes = new javax.swing.JButton();
        addUser = new javax.swing.JButton();
        deleteUser = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel1.setFont(new java.awt.Font("Segoe UI Black", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Bienvenido!");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 50, 177, 62));

        ingresar.setText("Ingresar archivo");
        ingresar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                ingresarMouseClicked(evt);
            }
        });
        ingresar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ingresarActionPerformed(evt);
            }
        });
        getContentPane().add(ingresar, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 150, 180, 30));

        ShowGraph.setText("Ver grafo");
        ShowGraph.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowGraphActionPerformed(evt);
            }
        });
        getContentPane().add(ShowGraph, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 200, 180, 30));

        ShowIslas.setText("Ver cantidad de islas");
        getContentPane().add(ShowIslas, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 250, 180, 30));

        ShowPuentes.setText("Identificar puentes");
        ShowPuentes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ShowPuentesActionPerformed(evt);
            }
        });
        getContentPane().add(ShowPuentes, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 300, 180, 30));

        addUser.setText("Agregar usuario");
        addUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addUserActionPerformed(evt);
            }
        });
        getContentPane().add(addUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 350, 180, 30));

        deleteUser.setText("Eliminar usuario");
        deleteUser.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                deleteUserActionPerformed(evt);
            }
        });
        getContentPane().add(deleteUser, new org.netbeans.lib.awtextra.AbsoluteConstraints(240, 400, 180, 30));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/GUIs/Images/Background.jpg"))); // NOI18N
        jLabel2.setText("jLabel2");
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(-140, -100, 820, 610));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ingresarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_ingresarMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_ingresarMouseClicked

    private void ingresarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ingresarActionPerformed
        // TODO add your handling code here:
//        JFileChooser chooser = new JFileChooser();
//        int returnVal = chooser.showOpenDialog(null);
//        if(returnVal == JFileChooser.APPROVE_OPTION) {
//            File file = chooser.getSelectedFile();
//            BufferedReader reader;
//            StringBuilder sb = new StringBuilder();
//            try {
//                reader = new BufferedReader(new FileReader(file));
//                String line = reader.readLine();
//                while (line != null) {
//                    sb.append(line);
//                    sb.append(System.lineSeparator());
//                    line = reader.readLine();
//                }
//                String fileContent = sb.toString();
//            } catch (FileNotFoundException e) {
//                e.printStackTrace();
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//            JOptionPane.showMessageDialog(null, "", "File Chooser", 0);
        AbrirGuardarTxt archivo = new AbrirGuardarTxt();
        archivo.setVisible(true);
        archivo.setLocationRelativeTo(null);

    }//GEN-LAST:event_ingresarActionPerformed

    private void ShowGraphActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowGraphActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowGraphActionPerformed

    private void ShowPuentesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ShowPuentesActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ShowPuentesActionPerformed

    private void addUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addUserActionPerformed
       AgregarUser add = new AgregarUser();
       add.setVisible(true);
       add.setLocationRelativeTo(null);
       
    }//GEN-LAST:event_addUserActionPerformed

    private void deleteUserActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_deleteUserActionPerformed
        EliminarUser delete = new EliminarUser();
        delete.setVisible(true);
        delete.setLocationRelativeTo(null);
    }//GEN-LAST:event_deleteUserActionPerformed

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
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Ventana1.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Ventana1().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ShowGraph;
    private javax.swing.JButton ShowIslas;
    private javax.swing.JButton ShowPuentes;
    private javax.swing.JButton addUser;
    private javax.swing.JButton deleteUser;
    private javax.swing.JButton ingresar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    // End of variables declaration//GEN-END:variables
}
