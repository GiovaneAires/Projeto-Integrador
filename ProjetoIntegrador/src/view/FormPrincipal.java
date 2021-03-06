/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

/**
 *
 * @author Giovane
 */
public class FormPrincipal extends javax.swing.JFrame {

    /**
     * Creates new form FormPrincipal
     */
    public FormPrincipal() {
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

        pCentro = new javax.swing.JPanel();
        menu = new javax.swing.JMenuBar();
        mCadastro = new javax.swing.JMenu();
        miBebidas = new javax.swing.JMenuItem();
        miBordas = new javax.swing.JMenuItem();
        miClientes = new javax.swing.JMenuItem();
        miPizza = new javax.swing.JMenuItem();
        mPedido = new javax.swing.JMenu();
        miPedido = new javax.swing.JMenuItem();
        mRelatorio = new javax.swing.JMenu();
        miRelatorioCliente = new javax.swing.JMenuItem();
        miRelatorioPeriodo = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 500, Short.MAX_VALUE)
        );
        pCentroLayout.setVerticalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 279, Short.MAX_VALUE)
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        menu.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        mCadastro.setText("Cadastro");

        miBebidas.setText("Bebidas");
        miBebidas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBebidasActionPerformed(evt);
            }
        });
        mCadastro.add(miBebidas);

        miBordas.setText("Bordas");
        miBordas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miBordasActionPerformed(evt);
            }
        });
        mCadastro.add(miBordas);

        miClientes.setText("Clientes");
        miClientes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miClientesActionPerformed(evt);
            }
        });
        mCadastro.add(miClientes);

        miPizza.setText("Pizzas");
        miPizza.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPizzaActionPerformed(evt);
            }
        });
        mCadastro.add(miPizza);

        menu.add(mCadastro);

        mPedido.setText("Pedido");

        miPedido.setText("Novo Pedido");
        miPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miPedidoActionPerformed(evt);
            }
        });
        mPedido.add(miPedido);

        menu.add(mPedido);

        mRelatorio.setText("Relatório");

        miRelatorioCliente.setText("Relatório por Clientes");
        miRelatorioCliente.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioClienteActionPerformed(evt);
            }
        });
        mRelatorio.add(miRelatorioCliente);

        miRelatorioPeriodo.setText("Relatório por Período");
        miRelatorioPeriodo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                miRelatorioPeriodoActionPerformed(evt);
            }
        });
        mRelatorio.add(miRelatorioPeriodo);

        menu.add(mRelatorio);

        setJMenuBar(menu);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void miBordasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBordasActionPerformed
        PFormBorda pFormBorda = new PFormBorda();
        pFormBorda.setVisible(true);
    }//GEN-LAST:event_miBordasActionPerformed

    private void miBebidasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miBebidasActionPerformed
        PFormBebida pFormBebida = new PFormBebida();
        pFormBebida.setVisible(true);
    }//GEN-LAST:event_miBebidasActionPerformed

    private void miClientesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miClientesActionPerformed
        PFormCliente pFormCliente = new PFormCliente();
        pFormCliente.setVisible(true);
    }//GEN-LAST:event_miClientesActionPerformed

    private void miPizzaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPizzaActionPerformed
        PFormPizza pFormPizza = new PFormPizza();
        pFormPizza.setVisible(true);
    }//GEN-LAST:event_miPizzaActionPerformed

    private void miPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miPedidoActionPerformed
        FormPedido pedido = new FormPedido();
        pedido.setVisible(true);
    }//GEN-LAST:event_miPedidoActionPerformed

    private void miRelatorioClienteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioClienteActionPerformed
        RFormRelatorioPedidoPorCliente relatorioCliente = new RFormRelatorioPedidoPorCliente();
        relatorioCliente.setVisible(true);
    }//GEN-LAST:event_miRelatorioClienteActionPerformed

    private void miRelatorioPeriodoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_miRelatorioPeriodoActionPerformed
        RFormRelatorioPedidoPorPeriodo relatorioPeriodo = new RFormRelatorioPedidoPorPeriodo();
        relatorioPeriodo.setVisible(true);
    }//GEN-LAST:event_miRelatorioPeriodoActionPerformed

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
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormPrincipal.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormPrincipal().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu mCadastro;
    private javax.swing.JMenu mPedido;
    private javax.swing.JMenu mRelatorio;
    private javax.swing.JMenuBar menu;
    private javax.swing.JMenuItem miBebidas;
    private javax.swing.JMenuItem miBordas;
    private javax.swing.JMenuItem miClientes;
    private javax.swing.JMenuItem miPedido;
    private javax.swing.JMenuItem miPizza;
    private javax.swing.JMenuItem miRelatorioCliente;
    private javax.swing.JMenuItem miRelatorioPeriodo;
    private javax.swing.JPanel pCentro;
    // End of variables declaration//GEN-END:variables
}
