/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pantallita;

import Excepciones.Utilitario;
import excepcionesPersonalizadas.MiExcepcionDividePor0;
import excepcionesPersonalizadas.MiExcepcionFueraDeRango;
import excepcionesPersonalizadas.MiExcepcionGenerica;
import excepcionesPersonalizadas.MiExcepcionNula;
import excepcionesPersonalizadas.MiExcepcionNumerica;
import javax.swing.JOptionPane;

/**
 *
 * @author Fabricio
 */
public class JFramePantallaPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form PantallaPrincipal
     */
    public JFramePantallaPrincipal() {
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

        btnExcepcionNumerica = new javax.swing.JButton();
        btnExcepcionNula = new javax.swing.JButton();
        btnExcepcionFueraDeRango = new javax.swing.JButton();
        btnExcepcionDividePor0 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnExcepcionNumerica.setText("Excepción Númerica");
        btnExcepcionNumerica.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcepcionNumericaActionPerformed(evt);
            }
        });

        btnExcepcionNula.setText("Excepción Nula");
        btnExcepcionNula.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcepcionNulaActionPerformed(evt);
            }
        });

        btnExcepcionFueraDeRango.setText("Excepcion Fuera de Rango ");
        btnExcepcionFueraDeRango.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcepcionFueraDeRangoActionPerformed(evt);
            }
        });

        btnExcepcionDividePor0.setText("Excepción Divide por 0");
        btnExcepcionDividePor0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcepcionDividePor0ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnExcepcionDividePor0)
                    .addComponent(btnExcepcionFueraDeRango)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(btnExcepcionNumerica, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnExcepcionNula, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(28, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(btnExcepcionNumerica)
                .addGap(18, 18, 18)
                .addComponent(btnExcepcionNula)
                .addGap(18, 18, 18)
                .addComponent(btnExcepcionFueraDeRango)
                .addGap(18, 18, 18)
                .addComponent(btnExcepcionDividePor0)
                .addContainerGap(63, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnExcepcionNumericaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcepcionNumericaActionPerformed
        try {
            String valorNumerico = "16ñ";
            int numero = Utilitario.convertir(valorNumerico);
            System.out.println("El número es: " + numero);

        } catch (MiExcepcionNumerica e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //System.out.println(e.getMessage());

        } catch (MiExcepcionGenerica ex) {

            JOptionPane.showMessageDialog(this, ex.getMessage());
            //System.out.println(ex.getMessage());
        }
    }//GEN-LAST:event_btnExcepcionNumericaActionPerformed

    private void btnExcepcionNulaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcepcionNulaActionPerformed
        try {
            String texto = null;
            int cantidad = Utilitario.obtenerCantidadCaracteres(texto);
            System.out.println("El cantidad de caracteres es de: " + cantidad);

        } catch (MiExcepcionNula e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //System.out.println(e.getMessage());
        }

    }//GEN-LAST:event_btnExcepcionNulaActionPerformed

    private void btnExcepcionFueraDeRangoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcepcionFueraDeRangoActionPerformed
        try {
            int[] numeros = {1,2,3};
            int numeroObtenido = Utilitario.accedeAIndiceEnArreglo(numeros,5);
            System.out.println("El valor hallado en el indice 5 es: "
                    + numeroObtenido);

        } catch (MiExcepcionFueraDeRango e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnExcepcionFueraDeRangoActionPerformed

    private void btnExcepcionDividePor0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcepcionDividePor0ActionPerformed
        try {
            int numero1=15;
            int numero2=0;
            int resultado = Utilitario.divideDosNumeros(numero1,numero2);
            System.out.println("El resultado de la división es: "
                    + resultado);

        } catch (MiExcepcionDividePor0 e) {
            JOptionPane.showMessageDialog(this, e.getMessage());
            //System.out.println(e.getMessage());
        }
    }//GEN-LAST:event_btnExcepcionDividePor0ActionPerformed

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
            java.util.logging.Logger.getLogger(JFramePantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(JFramePantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(JFramePantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(JFramePantallaPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new JFramePantallaPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnExcepcionDividePor0;
    private javax.swing.JButton btnExcepcionFueraDeRango;
    private javax.swing.JButton btnExcepcionNula;
    private javax.swing.JButton btnExcepcionNumerica;
    // End of variables declaration//GEN-END:variables
}
