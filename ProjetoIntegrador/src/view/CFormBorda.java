/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

/**
 *
 * @author Giovane
 */
public class CFormBorda extends TFormCadastro implements ActionListener{

    /**
     * Creates new form CFormBoda
     */
    public CFormBorda() {
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
        lCodigo = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        lSabor = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        lPreco = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        tSabor = new javax.swing.JTextField();
        tPreco = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Borda");

        lCodigo.setText("Código:");

        lTipo.setText("Tipo:");

        lSabor.setText("Sabor:");

        lStatus.setText("Status:");

        lPreco.setText("Preço:");

        tCodigo.setEditable(false);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Salgado", "Doce" }));

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(lCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroLayout.createSequentialGroup()
                        .addComponent(lTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 58, Short.MAX_VALUE)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lSabor)
                    .addComponent(lPreco))
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addGap(3, 3, 3)
                        .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(65, 65, 65)
                        .addComponent(lStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 254, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(33, 33, 33))
        );
        pCentroLayout.setVerticalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCodigo)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lSabor)
                        .addComponent(tSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lPreco)
                        .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lStatus)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lTipo)))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void bGravarActionPerformed(ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma o cadastro da borda?","Cadastro de Bordas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resposta == 0){
            JOptionPane.showMessageDialog(null, "Borda cadastrada com sucesso!");
            this.dispose();
        }
    }

    @Override
    public void bCancelarActionPerformed(ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo cancelar a operação?","Cadastro de Bordas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lPreco;
    private javax.swing.JLabel lSabor;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lTipo;
    private javax.swing.JPanel pCentro;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tPreco;
    private javax.swing.JTextField tSabor;
    // End of variables declaration//GEN-END:variables
}
