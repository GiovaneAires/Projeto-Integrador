/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import regraNegocio.ArquivoRN;
import regraNegocio.ClienteRN;
import regraNegocio.PedidoRN;
import vo.ClienteVO;
import vo.RelatorioVO;

/**
 *
 * @author Giovane
 */
public class RFormRelatorioPedidoPorCliente extends javax.swing.JFrame {

    /**
     * Creates new form Relatorio
     */
    public RFormRelatorioPedidoPorCliente() {
        initComponents();
        preencherCombo();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pNorte = new javax.swing.JPanel();
        bPesquisar = new javax.swing.JButton();
        cbClientes = new javax.swing.JComboBox<>();
        lCliente = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        lCodigo = new javax.swing.JLabel();
        pCentro = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPedidoCliente = new javax.swing.JTable();
        jSeparator1 = new javax.swing.JSeparator();
        pSul = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        bGerar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Relatório de Pedidos por Cliente");

        bPesquisar.setText("Pesquisar");
        bPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bPesquisarActionPerformed(evt);
            }
        });

        lCliente.setText("Cliente:");

        lCodigo.setText("Código:");

        javax.swing.GroupLayout pNorteLayout = new javax.swing.GroupLayout(pNorte);
        pNorte.setLayout(pNorteLayout);
        pNorteLayout.setHorizontalGroup(
            pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lCodigo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lCliente)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(bPesquisar)
                .addContainerGap(19, Short.MAX_VALUE))
        );
        pNorteLayout.setVerticalGroup(
            pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNorteLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCodigo)
                    .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lCliente)
                    .addComponent(cbClientes, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar))
                .addContainerGap())
        );

        getContentPane().add(pNorte, java.awt.BorderLayout.NORTH);

        tbPedidoCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cliente", "Descrição do Pedido", "Data", "Preço"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPedidoCliente);

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 486, Short.MAX_VALUE)
                .addContainerGap())
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        pCentroLayout.setVerticalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroLayout.createSequentialGroup()
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        bGerar.setText("Gerar Relatório");
        bGerar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bGerarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSulLayout = new javax.swing.GroupLayout(pSul);
        pSul.setLayout(pSulLayout);
        pSulLayout.setHorizontalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 506, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pSulLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(bGerar)
                .addGap(195, 195, 195))
        );
        pSulLayout.setVerticalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSulLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bGerar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pSul, java.awt.BorderLayout.PAGE_END);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bPesquisarActionPerformed
        ClienteVO clienteVO = new ClienteVO();
        try{
            if(!tCodigo.getText().isEmpty() || !cbClientes.getSelectedItem().equals("Selecione")){
                if(!tCodigo.getText().isEmpty())
                    clienteVO.setCodigo(Integer.parseInt(tCodigo.getText()));
                else clienteVO.setCodigo(0);
                
                if(!cbClientes.getSelectedItem().equals("Selecione"))
                    clienteVO.setNome((String)cbClientes.getSelectedItem());

                PedidoRN pedidoRN = new PedidoRN();
                ArrayList<RelatorioVO> dadosRelatorio = pedidoRN.gerarRelatorioCliente(clienteVO);
                
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tbPedidoCliente.getModel();
                dtm.fireTableDataChanged();
                dtm.setRowCount(0);
                
                for(RelatorioVO relVO : dadosRelatorio){
                    String[] linha = {"" + relVO.getCliente(), "" 
                                         + relVO.getDescricao(), "" 
                                         + relVO.getDataI(), "" + ""
                                         + relVO.getPreco(), ""};
                    dtm.addRow(linha);
                }

            }else JOptionPane.showMessageDialog(null, "É necessário informar um cliente para gerar o relatório.");
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL ao buscar os dados do relatório. Erro: " + sql, "Gerar relatório por cliente", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao buscar os dados do relatório. Erro: " + e, "Gerar relatório por cliente", JOptionPane.ERROR_MESSAGE);
        }
    }//GEN-LAST:event_bPesquisarActionPerformed

    private void bGerarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bGerarActionPerformed
        ArquivoRN arquivo = new ArquivoRN();
        arquivo.gerarRelatorioPorCliente(this);
        
        javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tbPedidoCliente.getModel();
        dtm.fireTableDataChanged();
        dtm.setRowCount(0);
    }//GEN-LAST:event_bGerarActionPerformed

    private void preencherCombo(){
        try{    
            ClienteVO clienteVO = new ClienteVO();
            clienteVO.setCodigo(0);

            ClienteRN clienteRN = new ClienteRN();
            ArrayList<ClienteVO> cliente = clienteRN.buscarCliente(clienteVO);
            cbClientes.addItem("Selecione");
            for(ClienteVO cliVO: cliente)
                cbClientes.addItem(cliVO.getNome());
        }catch(SQLException sql){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL ao tentar preencher o combobox. Erro: " + sql, "Gerar relatório por cliente", JOptionPane.ERROR_MESSAGE);
        }catch(Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar preencher o combobox. Erro: " + e, "Gerar relatório por cliente", JOptionPane.ERROR_MESSAGE);
        }
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bGerar;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JComboBox<String> cbClientes;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JLabel lCliente;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pSul;
    private javax.swing.JTextField tCodigo;
    public javax.swing.JTable tbPedidoCliente;
    // End of variables declaration//GEN-END:variables
}
