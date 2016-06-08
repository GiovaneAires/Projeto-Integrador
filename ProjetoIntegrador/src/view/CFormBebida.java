/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import regraNegocio.BebidaRN;
import vo.BebidaVO;

/**
 *
 * @author Giovane
 */
public class CFormBebida extends TFormCadastro implements ActionListener{

    /**
     * Creates new form CFormBebida
     */
    public CFormBebida() {
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
        lMarca = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        lVolume = new javax.swing.JLabel();
        lPreco = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        tMarca = new javax.swing.JTextField();
        tPreco = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        tVolume = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Bebida");

        lCodigo.setText("Código:");

        lMarca.setText("Marca:");

        lTipo.setText("Tipo:");

        lVolume.setText("Volume:");

        lPreco.setText("Preço:");

        lStatus.setText("Status:");

        tCodigo.setEnabled(false);

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Água", "Refrigerante", "Suco" }));

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tMarca)
                        .addGap(28, 28, 28)
                        .addComponent(lTipo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(lVolume)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 69, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(lCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroLayout.createSequentialGroup()
                        .addComponent(lPreco)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 123, Short.MAX_VALUE)
                        .addComponent(lStatus)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(174, 174, 174))))
        );
        pCentroLayout.setVerticalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipo)
                    .addComponent(lMarca)
                    .addComponent(lVolume)
                    .addComponent(tMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lPreco)
                    .addComponent(lStatus)
                    .addComponent(tPreco, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(14, Short.MAX_VALUE))
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void bGravarActionPerformed(ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma o cadastro da bebida?","Cadastro de Bebidas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resposta == 0){
            try{
                BebidaVO bebidaVO = new BebidaVO();
                
                if(tCodigo.getText() != null)
                    bebidaVO.setCodigo(Integer.parseInt(tCodigo.getText()));
                else
                    bebidaVO.setCodigo(0);
                bebidaVO.setMarca(tMarca.getText());
                bebidaVO.setTipo((String)cbTipo.getSelectedItem());
                bebidaVO.setVolume(Double.parseDouble(tVolume.getText()));
                bebidaVO.setPreco(Double.parseDouble(tPreco.getText()));
                bebidaVO.setStatus((String)cbStatus.getSelectedItem());
                
                BebidaRN bebidaRN = new BebidaRN();
                bebidaRN.gravarBebida(bebidaVO);
                
                JOptionPane.showMessageDialog(null, "Bebida cadastrada por sucesso.");
            } catch (SQLException sql){
                
            } catch (Exception e){
                
            }finally{
                this.dispose();
            }
        }
    }

    @Override
    public void bCancelarActionPerformed(ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo cancelar a operação?","Cadastro de Bebidas", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0){
            JOptionPane.showMessageDialog(null, "Operação cancelada!");
            this.dispose();
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lPreco;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lVolume;
    private javax.swing.JPanel pCentro;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tMarca;
    private javax.swing.JTextField tPreco;
    private javax.swing.JTextField tVolume;
    // End of variables declaration//GEN-END:variables
}
