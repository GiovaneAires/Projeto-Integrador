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
import regraNegocio.ClienteRN;
import vo.ClienteVO;

/**
 *
 * @author Giovane
 */
public class CFormCliente extends TFormCadastro implements ActionListener{

    /**
     * Creates new form CFormPizza
     */
    public CFormCliente() {
        initComponents();
    }
    
    public CFormCliente(ClienteVO clienteVO) {
        initComponents();
        tCodigo.setText(String.valueOf(clienteVO.getCodigo()));
        tNome.setText(clienteVO.getNome());
        tfTelefone.setText(clienteVO.getTelefone());
        tLogradouro.setText(clienteVO.getLogradouro());
        tNumero.setText(String.valueOf(clienteVO.getNumero()));
        tBairro.setText(clienteVO.getBairro());
        tfCep.setText(clienteVO.getCep());
        tCidade.setText(clienteVO.getCidade());
        cbEstado.setSelectedItem(clienteVO.getEstado());
        tComplemento.setText(clienteVO.getComplemento());
        cbStatus.setSelectedItem(clienteVO.getStatus());
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
        lNome = new javax.swing.JLabel();
        lLogradouro = new javax.swing.JLabel();
        lComplemento = new javax.swing.JLabel();
        lCidade = new javax.swing.JLabel();
        lCep = new javax.swing.JLabel();
        lTelefone = new javax.swing.JLabel();
        lNumero = new javax.swing.JLabel();
        lBairro = new javax.swing.JLabel();
        lEstado = new javax.swing.JLabel();
        lStatus = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        tNome = new javax.swing.JTextField();
        tfTelefone = new javax.swing.JFormattedTextField();
        tLogradouro = new javax.swing.JTextField();
        tNumero = new javax.swing.JTextField();
        tBairro = new javax.swing.JTextField();
        tfCep = new javax.swing.JFormattedTextField();
        tCidade = new javax.swing.JTextField();
        cbEstado = new javax.swing.JComboBox<>();
        tComplemento = new javax.swing.JTextField();
        cbStatus = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro Clientes");

        lCodigo.setText("Código:");

        lNome.setText("Nome:");

        lLogradouro.setText("Logradouro:");

        lComplemento.setText("Complemento:");

        lCidade.setText("Cidade:");

        lCep.setText("CEP:");

        lTelefone.setText("Telefone:");

        lNumero.setText("Número:");

        lBairro.setText("Bairro:");

        lEstado.setText("Estado:");

        lStatus.setText("Status:");

        tCodigo.setEnabled(false);

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        cbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Paraná", "Santa Catarina" }));

        cbStatus.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Ativo", "Inativo" }));

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(lCodigo)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(tComplemento, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 259, Short.MAX_VALUE)
                                    .addComponent(tCidade, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tLogradouro, javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tNome)
                                    .addComponent(tBairro))
                                .addGap(69, 69, 69))
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lCidade)
                                    .addComponent(lNome)
                                    .addComponent(lLogradouro)
                                    .addComponent(lBairro)
                                    .addComponent(lComplemento))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pCentroLayout.createSequentialGroup()
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tNumero)
                                    .addComponent(tfCep)
                                    .addComponent(cbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(65, 65, 65))
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lNumero)
                                    .addComponent(lCep)
                                    .addComponent(lStatus)
                                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(lTelefone)
                                    .addComponent(lEstado))
                                .addContainerGap())))))
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
                    .addComponent(lNome)
                    .addComponent(lTelefone))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogradouro)
                    .addComponent(lNumero))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lCep)
                    .addComponent(lBairro))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lEstado)
                    .addComponent(lCidade))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lStatus)
                    .addComponent(lComplemento))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    @Override
    public void bGravarActionPerformed(ActionEvent evt) {
        
        int resposta = JOptionPane.showConfirmDialog(null, "Confirma o cadastro do cliente?", "Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if(resposta == 0){
            try{
                ClienteVO clienteVO = new ClienteVO();
                
                if(!tCodigo.getText().isEmpty())
                    clienteVO.setCodigo(Integer.parseInt(tCodigo.getText()));
                else
                    clienteVO.setCodigo(0);
                clienteVO.setNome(tNome.getText());
                clienteVO.setTelefone(tfTelefone.getText());
                clienteVO.setLogradouro(tLogradouro.getText());
                clienteVO.setNumero(Integer.parseInt(tNumero.getText()));
                clienteVO.setBairro(tBairro.getText());
                clienteVO.setCep(tfCep.getText());
                clienteVO.setCidade(tCidade.getText());
                clienteVO.setEstado((String)cbEstado.getSelectedItem());
                clienteVO.setComplemento(tComplemento.getText());
                clienteVO.setStatus((String)cbStatus.getSelectedItem());

                ClienteRN clienteRN = new ClienteRN();
                clienteRN.gravarCliente(clienteVO);            

                JOptionPane.showMessageDialog(null, "Cliente cadastrado com sucesso!");
            } catch (SQLException sql){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL ao tentar cadastrar o cliente. Erro: " + sql, "Cadastro de cliente", JOptionPane.ERROR_MESSAGE);
            } catch (Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar cadastrar o cliente. Erro: " + e, "Cadastro de cliente", JOptionPane.ERROR_MESSAGE);
            }finally{
                this.dispose();
            }
        }
    }
    @Override
    public void bCancelarActionPerformed(ActionEvent evt) {
        int resposta = JOptionPane.showConfirmDialog(null, "Deseja mesmo cancelar a operação?", "Cadastro de Clientes", JOptionPane.YES_NO_OPTION, JOptionPane.QUESTION_MESSAGE);
        if (resposta == 0)
            this.dispose();
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> cbEstado;
    private javax.swing.JComboBox<String> cbStatus;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lLogradouro;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lStatus;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JPanel pCentro;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tComplemento;
    private javax.swing.JTextField tLogradouro;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNumero;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
