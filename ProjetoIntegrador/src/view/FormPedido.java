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
public class FormPedido extends javax.swing.JFrame {

    /**
     * Creates new form FormPedidos
     */
    public FormPedido() {
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

        pNorte = new javax.swing.JPanel();
        jSeparator1 = new javax.swing.JSeparator();
        lTelefone = new javax.swing.JLabel();
        tfTelefone = new javax.swing.JFormattedTextField();
        bPesquisar = new javax.swing.JButton();
        bCadastrar = new javax.swing.JButton();
        bEditar = new javax.swing.JButton();
        tStatus = new javax.swing.JTextField();
        Status = new javax.swing.JLabel();
        tComplemento = new javax.swing.JTextField();
        lComplemento = new javax.swing.JLabel();
        tNumero = new javax.swing.JTextField();
        lNumero = new javax.swing.JLabel();
        tLogradouro = new javax.swing.JTextField();
        lLogradouro = new javax.swing.JLabel();
        lCodigo = new javax.swing.JLabel();
        tCodigo = new javax.swing.JTextField();
        lNome = new javax.swing.JLabel();
        tNome = new javax.swing.JTextField();
        lCidade = new javax.swing.JLabel();
        tCidade = new javax.swing.JTextField();
        lEstado = new javax.swing.JLabel();
        tEstado = new javax.swing.JTextField();
        lBairro = new javax.swing.JLabel();
        tBairro = new javax.swing.JTextField();
        lCep = new javax.swing.JLabel();
        tfCep = new javax.swing.JFormattedTextField();
        jLabel1 = new javax.swing.JLabel();
        pSul = new javax.swing.JPanel();
        jSeparator2 = new javax.swing.JSeparator();
        bFinalizarPedido = new javax.swing.JButton();
        pCentro = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        lTamanho = new javax.swing.JLabel();
        lSabor = new javax.swing.JLabel();
        lBorda = new javax.swing.JLabel();
        cbTamanho = new javax.swing.JComboBox<>();
        cbBorda = new javax.swing.JComboBox<>();
        cbSabor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        listSabor = new javax.swing.JList<>();
        bAddSabor = new javax.swing.JButton();
        bRemSabor = new javax.swing.JButton();
        jSeparator3 = new javax.swing.JSeparator();
        jLabel3 = new javax.swing.JLabel();
        lMarca = new javax.swing.JLabel();
        lTipo = new javax.swing.JLabel();
        lVolume = new javax.swing.JLabel();
        cbMarca = new javax.swing.JComboBox<>();
        cbTipo = new javax.swing.JComboBox<>();
        cbVolume = new javax.swing.JComboBox<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pedidos");

        lTelefone.setText("Telefone:");

        try {
            tfTelefone.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("(##)####-####")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }

        bPesquisar.setText("Pesquisar");

        bCadastrar.setText("Cadastrar Novo");
        bCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCadastrarActionPerformed(evt);
            }
        });

        bEditar.setText("Editar Cliente");
        bEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bEditarActionPerformed(evt);
            }
        });

        tStatus.setEditable(false);
        tStatus.setEnabled(false);

        Status.setText("Status:");

        tComplemento.setEditable(false);
        tComplemento.setEnabled(false);

        lComplemento.setText("Complemento:");

        tNumero.setEditable(false);
        tNumero.setEnabled(false);

        lNumero.setText("Número:");

        tLogradouro.setEditable(false);
        tLogradouro.setEnabled(false);

        lLogradouro.setText("Logradouro:");

        lCodigo.setText("Código:");

        tCodigo.setEditable(false);
        tCodigo.setEnabled(false);

        lNome.setText("Nome:");

        tNome.setEditable(false);
        tNome.setEnabled(false);

        lCidade.setText("Cidade:");

        tCidade.setEditable(false);
        tCidade.setEnabled(false);

        lEstado.setText("Estado:");

        tEstado.setEditable(false);
        tEstado.setEnabled(false);

        lBairro.setText("Bairro:");

        tBairro.setEditable(false);
        tBairro.setEnabled(false);

        lCep.setText("CEP:");

        tfCep.setEditable(false);
        try {
            tfCep.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("#####-###")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        tfCep.setEnabled(false);

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel1.setText("Dados do Cliente");

        javax.swing.GroupLayout pNorteLayout = new javax.swing.GroupLayout(pNorte);
        pNorte.setLayout(pNorteLayout);
        pNorteLayout.setHorizontalGroup(
            pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(pNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNorteLayout.createSequentialGroup()
                        .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lLogradouro)
                            .addComponent(lCidade)
                            .addComponent(lCodigo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pNorteLayout.createSequentialGroup()
                                .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(lNome)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(41, 41, 41)
                                .addComponent(Status)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tStatus, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(69, 69, 69)
                                .addComponent(lCep)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, 68, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pNorteLayout.createSequentialGroup()
                                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(tCidade, javax.swing.GroupLayout.DEFAULT_SIZE, 130, Short.MAX_VALUE)
                                    .addComponent(tLogradouro))
                                .addGap(241, 241, 241)
                                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(pNorteLayout.createSequentialGroup()
                                        .addComponent(lBairro)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(pNorteLayout.createSequentialGroup()
                                        .addComponent(lComplemento)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addComponent(jLabel1)
                    .addGroup(pNorteLayout.createSequentialGroup()
                        .addComponent(lTelefone)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(bPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bEditar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(bCadastrar))
                    .addGroup(pNorteLayout.createSequentialGroup()
                        .addGap(223, 223, 223)
                        .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lEstado)
                            .addComponent(lNumero))
                        .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pNorteLayout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, 65, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(pNorteLayout.createSequentialGroup()
                                .addGap(4, 4, 4)
                                .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pNorteLayout.setVerticalGroup(
            pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pNorteLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lTelefone)
                    .addComponent(tfTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bPesquisar)
                    .addComponent(bCadastrar)
                    .addComponent(bEditar))
                .addGap(18, 18, 18)
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCep)
                        .addComponent(tfCep, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lCodigo)
                        .addComponent(lNome)
                        .addComponent(tCodigo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(tNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(Status)
                        .addComponent(tStatus, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(18, 18, 18)
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lBairro)
                    .addComponent(lCidade)
                    .addComponent(lEstado)
                    .addComponent(tCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tBairro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(pNorteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lLogradouro)
                    .addComponent(tLogradouro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lNumero)
                    .addComponent(tNumero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lComplemento)
                    .addComponent(tComplemento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 9, Short.MAX_VALUE)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        getContentPane().add(pNorte, java.awt.BorderLayout.NORTH);

        bFinalizarPedido.setText("Finalizar Pedido");
        bFinalizarPedido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bFinalizarPedidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pSulLayout = new javax.swing.GroupLayout(pSul);
        pSul.setLayout(pSulLayout);
        pSulLayout.setHorizontalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator2, javax.swing.GroupLayout.DEFAULT_SIZE, 659, Short.MAX_VALUE)
            .addGroup(pSulLayout.createSequentialGroup()
                .addGap(274, 274, 274)
                .addComponent(bFinalizarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pSulLayout.setVerticalGroup(
            pSulLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pSulLayout.createSequentialGroup()
                .addComponent(jSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bFinalizarPedido)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pSul, java.awt.BorderLayout.SOUTH);

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel2.setText("Dados da Pizza");

        lTamanho.setText("Tamanho:");

        lSabor.setText("Sabores:");

        lBorda.setText("Borda:");

        cbSabor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        jScrollPane1.setViewportView(listSabor);

        bAddSabor.setText("Adicionar");

        bRemSabor.setText("Remover");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel3.setText("Bebida");

        lMarca.setText("Marca:");

        lTipo.setText("Tipo:");

        lVolume.setText("Volume:");

        cbMarca.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        cbVolume.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));

        javax.swing.GroupLayout pCentroLayout = new javax.swing.GroupLayout(pCentro);
        pCentro.setLayout(pCentroLayout);
        pCentroLayout.setHorizontalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator3, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addComponent(lBorda)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbBorda, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pCentroLayout.createSequentialGroup()
                                .addComponent(lTamanho)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(65, 65, 65)
                        .addComponent(lSabor)
                        .addGap(18, 18, 18)
                        .addComponent(cbSabor, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(bAddSabor)
                            .addComponent(bRemSabor))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(22, 22, 22))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addComponent(lMarca)
                        .addGap(18, 18, 18)
                        .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lTipo)
                        .addGap(26, 26, 26)
                        .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addComponent(lVolume)
                        .addGap(18, 18, 18)
                        .addComponent(cbVolume, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(52, 52, 52))))
        );
        pCentroLayout.setVerticalGroup(
            pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCentroLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pCentroLayout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lTamanho)
                                    .addComponent(cbTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(lBorda)
                                    .addComponent(cbBorda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(pCentroLayout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addComponent(bRemSabor))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbSabor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lSabor)
                        .addComponent(bAddSabor)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addGap(18, 18, 18)
                .addGroup(pCentroLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lMarca)
                    .addComponent(lTipo)
                    .addComponent(lVolume)
                    .addComponent(cbMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(cbVolume, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(24, Short.MAX_VALUE))
        );

        getContentPane().add(pCentro, java.awt.BorderLayout.CENTER);

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bFinalizarPedidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bFinalizarPedidoActionPerformed
        FormPedidoItem formPedidoItem = new FormPedidoItem();
        formPedidoItem.setVisible(true);
    }//GEN-LAST:event_bFinalizarPedidoActionPerformed

    private void bEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bEditarActionPerformed
        CFormCliente cFormCliente = new CFormCliente();
        cFormCliente.setVisible(true);
    }//GEN-LAST:event_bEditarActionPerformed

    private void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCadastrarActionPerformed
        CFormCliente cFormCliente = new CFormCliente();
        cFormCliente.setVisible(true);
    }//GEN-LAST:event_bCadastrarActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Status;
    private javax.swing.JButton bAddSabor;
    private javax.swing.JButton bCadastrar;
    private javax.swing.JButton bEditar;
    private javax.swing.JButton bFinalizarPedido;
    private javax.swing.JButton bPesquisar;
    private javax.swing.JButton bRemSabor;
    private javax.swing.JComboBox<String> cbBorda;
    private javax.swing.JComboBox<String> cbMarca;
    private javax.swing.JComboBox<String> cbSabor;
    private javax.swing.JComboBox<String> cbTamanho;
    private javax.swing.JComboBox<String> cbTipo;
    private javax.swing.JComboBox<String> cbVolume;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSeparator jSeparator2;
    private javax.swing.JSeparator jSeparator3;
    private javax.swing.JLabel lBairro;
    private javax.swing.JLabel lBorda;
    private javax.swing.JLabel lCep;
    private javax.swing.JLabel lCidade;
    private javax.swing.JLabel lCodigo;
    private javax.swing.JLabel lComplemento;
    private javax.swing.JLabel lEstado;
    private javax.swing.JLabel lLogradouro;
    private javax.swing.JLabel lMarca;
    private javax.swing.JLabel lNome;
    private javax.swing.JLabel lNumero;
    private javax.swing.JLabel lSabor;
    private javax.swing.JLabel lTamanho;
    private javax.swing.JLabel lTelefone;
    private javax.swing.JLabel lTipo;
    private javax.swing.JLabel lVolume;
    private javax.swing.JList<String> listSabor;
    private javax.swing.JPanel pCentro;
    private javax.swing.JPanel pNorte;
    private javax.swing.JPanel pSul;
    private javax.swing.JTextField tBairro;
    private javax.swing.JTextField tCidade;
    private javax.swing.JTextField tCodigo;
    private javax.swing.JTextField tComplemento;
    private javax.swing.JTextField tEstado;
    private javax.swing.JTextField tLogradouro;
    private javax.swing.JTextField tNome;
    private javax.swing.JTextField tNumero;
    private javax.swing.JTextField tStatus;
    private javax.swing.JFormattedTextField tfCep;
    private javax.swing.JFormattedTextField tfTelefone;
    // End of variables declaration//GEN-END:variables
}
