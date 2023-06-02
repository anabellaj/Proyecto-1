/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyecto.pkg1.GUIs;

import javax.swing.JOptionPane;
import proyecto.pkg1.Functions.FunctionsTXT;
import proyecto.pkg1.Grafo.ListaVertex;
import proyecto.pkg1.Grafo.NodoVertex;
import proyecto.pkg1.Grafo.User;
import static proyecto.pkg1.Main.grafo;

/**
 *
 * @author Anabella Jaua
 */
public class AgregarRelacion extends javax.swing.JFrame {
    ListaVertex listaUsers = grafo.getUserList();

    /**
     * Creates new form Puentes
     */
    public AgregarRelacion() {
        initComponents();
        for (NodoVertex pointer = listaUsers.getHead(); pointer != listaUsers.getTail(); pointer = pointer.getNext()) {
           User usuario = (User) pointer.getElement();
           user1.addItem(usuario.getUsername());
           user2.addItem(usuario.getUsername());
        }
        User last = (User) listaUsers.getTail().getElement();
        user1.addItem(last.getUsername());
        user2.addItem(last.getUsername());
    }
    FunctionsTXT txt = new FunctionsTXT();

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        user1 = new javax.swing.JComboBox<>();
        user2 = new javax.swing.JComboBox<>();
        years = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(204, 204, 255));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/proyecto/pkg1/GUIs/Images/user.png"))); // NOI18N
        jLabel1.setText("Agregar relacion");

        years.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                yearsActionPerformed(evt);
            }
        });

        jLabel2.setText("Años de amistad:");

        jButton1.setText("Agregar");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Salir");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(76, 76, 76)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jButton2))
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(jLabel2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(8, 8, 8))
                                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(85, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(81, 81, 81)
                .addComponent(user1, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(user2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(years, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(53, 53, 53)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addContainerGap(104, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void yearsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_yearsActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_yearsActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_jButton2ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        Object selected1 = user1.getSelectedItem();
        Object selected2 = user2.getSelectedItem();
        String usuario1 = selected1.toString();
        String usuario2 = selected2.toString();
        User first = null;
        User second = null;
        User compare;
        
        NodoVertex pointer = listaUsers.getHead();
        if (usuario1.equals(usuario2)){
            JOptionPane.showMessageDialog(null, "Recuerde seleccionar dos usuarios diferentes!");
        } else{
        while (first == null){
            compare = (User) pointer.getElement();
            if (compare.getUsername().equals(usuario1)){
                first = compare;
            }
            pointer = pointer.getNext();
        } 
        pointer = listaUsers.getHead();
        while (second == null){
            compare = (User) pointer.getElement();
            if (compare.getUsername().equals(usuario2)){
                second = compare;
            }
            pointer = pointer.getNext();
        } 
        if(first == second){
            JOptionPane.showMessageDialog(null, "Recuerde seleccionar dos usuarios diferentes!");
        }else if (grafo.checkAdj(first, second)){
            JOptionPane.showMessageDialog(null, "Los usuarios "+first.getUsername()+" y "+second.getUsername()+" ya estan relacionados");
        } else{
            try{
                int year = Integer.parseInt(years.getText());
                grafo.addEdge(first, second, year);
                JOptionPane.showMessageDialog(null, "Relacion agregada exitosamente!");            
                txt.agregarRelacion(first.getUserID(), second.getUserID(), year);
                years.setText("");
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente numeros enteros en la casilla de años de amistad");            
            }
        }
            
        }
//        try{
//            if(first == second){
//                JOptionPane.showMessageDialog(null, "Recuerde seleccionar dos usuarios diferentes!");
//            } else{
//            int year = Integer.parseInt(years.getText());
//            if (grafo.checkAdj(first, second)){
//                grafo.deleteEdge(first, second);
//                grafo.addEdge(first, second, year);
//            }
//            txt.agregarRelacion(first.getUserID(), second.getUserID(), year);
//            
//            JOptionPane.showMessageDialog(null, "Relacion agregada!");}
//        } catch (Exception e){
//            JOptionPane.showMessageDialog(null, "Por favor ingrese unicamente numeros enteros en la casilla de años de amistad");
//        }
//        }
        
    }//GEN-LAST:event_jButton1ActionPerformed

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
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AgregarRelacion.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new AgregarRelacion().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JComboBox<String> user1;
    private javax.swing.JComboBox<String> user2;
    private javax.swing.JTextField years;
    // End of variables declaration//GEN-END:variables
}
