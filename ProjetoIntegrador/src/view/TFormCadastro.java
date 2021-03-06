/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author Giovane
 */
public abstract class TFormCadastro extends javax.swing.JFrame {

    /**
     * Creates new form TFormCadastro
     */
    public TFormCadastro() {
        initComponents();
        bGravar.addActionListener((ActionListener) this);
        bCancelar.addActionListener((ActionListener) this);
    }
    
    public abstract void bGravarActionPerformed(ActionEvent evt);
    public abstract void bCancelarActionPerformed(ActionEvent evt);

    public void actionPerformed(ActionEvent e) {
        switch (e.getActionCommand()){
            case "Gravar":
                bGravarActionPerformed(e);
                break;
            case "Cancelar":
                bCancelarActionPerformed(e);
                break;
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

        pSul = new javax.swing.JPanel();
        bGravar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Template Cadastro");

        bGravar.setText("Gravar");

        bCancelar.setText("Cancelar");

        javax.swing.GroupLayout pSulLayout = new javax.swing.GroupLayout(pSul);
        pSul.setLayout(pSulLayout);
        pSulLayout.setHorizontalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSulLayout.createSequentialGroup()
                .addContainerGap(181, Short.MAX_VALUE)
                .addComponent(bGravar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar)
                .addGap(173, 173, 173))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pSulLayout.setVerticalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSulLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bGravar)
                    .addComponent(bCancelar))
                .addContainerGap())
        );

        getContentPane().add(pSul, java.awt.BorderLayout.SOUTH);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    protected javax.swing.JButton bCancelar;
    protected javax.swing.JButton bGravar;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JPanel pSul;
    // End of variables declaration//GEN-END:variables
}
