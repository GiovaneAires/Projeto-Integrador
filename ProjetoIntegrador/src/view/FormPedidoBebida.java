/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import regraNegocio.BebidaRN;
import vo.BebidaVO;

/**
 *
 * @author Giovane
 */
public class FormPedidoBebida extends javax.swing.JFrame {

    /**
     * Creates new form FormPedidoBebida
     */
    FormPedido form;
    public FormPedidoBebida(FormPedido form) {
        initComponents();
        preencherCombo();
        this.form = form;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pPedidoBebida = new javax.swing.JPanel();
        lMarca = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        lVolume = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        cbVolume = new javax.swing.JComboBox<>();
        bAdicionar = new javax.swing.JButton();
        bCancelar = new javax.swing.JButton();
        lVolume1 = new javax.swing.JLabel();
        tQuantidade = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Adicionar Bebida");

        lMarca.setText("Marca:");

        lTipo.setText("Tipo:");

        lVolume.setText("Volume:");

        bAdicionar.setText("Adicionar");
        bAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAdicionarActionPerformed(evt);
            }
        });

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        lVolume1.setText("Quantidade:");

        javax.swing.GroupLayout pPedidoBebidaLayout = new javax.swing.GroupLayout(pPedidoBebida);
        pPedidoBebida.setLayout(pPedidoBebidaLayout);
        pPedidoBebidaLayout.setHorizontalGroup(
            pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPedidoBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(pPedidoBebidaLayout.createSequentialGroup()
                        .addComponent(lTipo)
                        .addGap(14, 14, 14)
                        .addComponent(cbTipo, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pPedidoBebidaLayout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lVolume, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lVolume1, javax.swing.GroupLayout.Alignment.TRAILING))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(tQuantidade)
                    .addComponent(cbVolume, 0, 50, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pPedidoBebidaLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bAdicionar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bCancelar)
                .addGap(77, 77, 77))
        );
        pPedidoBebidaLayout.setVerticalGroup(
            pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pPedidoBebidaLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarca)
                    .addComponent(lVolume)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTipo)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lVolume1)
                    .addComponent(tQuantidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pPedidoBebidaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(bAdicionar)
                    .addComponent(bCancelar))
                .addContainerGap(12, Short.MAX_VALUE))
        );

        getContentPane().add(pPedidoBebida, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAdicionarActionPerformed
        if(!tQuantidade.getText().isEmpty()){
            javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) this.form.tbItens.getModel();
            dtm.fireTableDataChanged();

            BebidaVO bebidaVO = new BebidaVO();
            bebidaVO.setMarca((String)cbMarca.getSelectedItem());

            BebidaRN bebidaRN = new BebidaRN();
            try{
                ArrayList<BebidaVO> bebida = bebidaRN.buscarBebida(bebidaVO);
                for(BebidaVO bebVO: bebida){
                    String[] linha = {"" + bebVO.getCodigo(), ""
                                 + bebVO.getMarca(), ""
                                 + tQuantidade.getText(), ""
                                 + bebVO.getPreco() + ""};
                    dtm.addRow(linha);

                    Double valorTotal = tQuantidade.getText().equals("0.0") ? bebVO.getPreco() : bebVO.getPreco() * Double.parseDouble(tQuantidade.getText());
                    this.form.tValorTotal.setText(String.valueOf(Double.parseDouble(this.form.tValorTotal.getText()) + valorTotal));
                }
            }catch(SQLException sql){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL ao tentar buscar a bebida. Erro: " + sql, "Cadastro de pedido", JOptionPane.ERROR_MESSAGE);
            }catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar buscar a bebida. Erro: " + e, "Cadastro de pedido", JOptionPane.ERROR_MESSAGE);
            }finally{
                this.dispose();
            }
        }else JOptionPane.showMessageDialog(null, "É necessário informar a quantidade para adicionar a bebida.");
    }//GEN-LAST:event_bAdicionarActionPerformed

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void preencherCombo(){
        try{
            BebidaVO bebidaVO = new BebidaVO();
            BebidaRN bebidaRN = new BebidaRN();
            
            bebidaVO.setCodigo(0);
            bebidaVO.setStatus("Ativo");
            ArrayList<BebidaVO> bebida = bebidaRN.buscarBebida(bebidaVO);
            for(BebidaVO bebVO: bebida){
                cbMarca.addItem(bebVO.getMarca());
                cbTipo.addItem(bebVO.getTipo());
                cbVolume.addItem(bebVO.getVolume().toString());
            }
        }catch (SQLException sql){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL ao tentar preencher os combobox. Erro: " + sql, "Cadastro de pedido", JOptionPane.ERROR_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar preencher os combobox. Erro: " + e, "Cadastro de pedido", JOptionPane.ERROR_MESSAGE);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAdicionar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbVolume;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lVolume;
    private javax.swing.JLabel lVolume1;
    private javax.swing.JPanel pPedidoBebida;
    private javax.swing.JTextField tQuantidade;
    // End of variables declaration//GEN-END:variables
}
