/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import java.awt.event.ActionListener;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import regraNegocio.PizzaRN;
import vo.PizzaVO;

/**
 *
 * @author Giovane
 */
public class PFormPizza extends TFormPesquisa implements ActionListener{

    /**
     * Creates new form PFormPizza
     */
    public PFormPizza() {
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

        pCenter = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbPizza = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Pesquisa Pizza");

        tbPizza.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Código", "Sabor", "Tipo", "Preço", "Status"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jScrollPane1.setViewportView(tbPizza);

        javax.swing.GroupLayout pCenterLayout = new javax.swing.GroupLayout(pCenter);
        pCenter.setLayout(pCenterLayout);
        pCenterLayout.setHorizontalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 480, Short.MAX_VALUE)
                .addContainerGap())
        );
        pCenterLayout.setVerticalGroup(
            pCenterLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pCenterLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 375, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        getContentPane().add(pCenter, java.awt.BorderLayout.CENTER);

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    /**
     * @param evt the command line arguments
     */
    
    @Override
    public void bPesquisarActionPerformed(java.awt.event.ActionEvent evt) {
        try{
            PizzaVO pizzaVO = new PizzaVO();
            
            if(!tCodigo.getText().isEmpty())
                pizzaVO.setCodigo(Integer.parseInt(tCodigo.getText()));
            else pizzaVO.setCodigo(0);
            
            if(!tDescricao.getText().isEmpty())
                pizzaVO.setSabor((tDescricao.getText()));
            else pizzaVO.setSabor(null);
            
            PizzaRN pizzaRN = new PizzaRN();
            ArrayList<PizzaVO> pizza = pizzaRN.buscarPizza(pizzaVO);
            
            if(!pizza.isEmpty()){
                javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) tbPizza.getModel();
                dtm.fireTableDataChanged();
                dtm.setRowCount(0);

                for(PizzaVO pizVO : pizza){
                    String[] linha = {"" + pizVO.getCodigo(), "" 
                                         + pizVO.getSabor(), "" 
                                         + pizVO.getTipo(), "" 
                                         + pizVO.getPreco(), "" + ""
                                         + pizVO.getStatus(), ""};
                    dtm.addRow(linha);
                }
            }else
                JOptionPane.showMessageDialog(null, "Nenhum registro encontrado.", "Pesquisa de Pizza", JOptionPane.INFORMATION_MESSAGE);
        }catch (SQLException sql){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro de SQL na pesquisa de pizzas. Erro: " + sql, "Pesquisar Pizza", JOptionPane.ERROR_MESSAGE);
        }catch (Exception e){
            JOptionPane.showMessageDialog(null, "Ocorreu um erro na pesquisa de pizzas. Erro: " + e, "Pesquisar Pizza", JOptionPane.ERROR_MESSAGE);
        }
    }
    
    @Override
    public void bCadastrarActionPerformed(java.awt.event.ActionEvent evt) {                                           
        CFormPizza cFormPizza = new CFormPizza();
        cFormPizza.setVisible(true);
    }
    
    @Override
    public void bEditarActionPerformed(java.awt.event.ActionEvent evt) {
        if(tbPizza.getSelectedRowCount() == 1){
            
            PizzaVO pizzaVO = new PizzaVO();
            pizzaVO.setCodigo(Integer.parseInt((String) tbPizza.getValueAt(tbPizza.getSelectedRow(), 0)));
            
            try{
                PizzaRN pizzaRN = new PizzaRN();
                ArrayList<PizzaVO> pizza = pizzaRN.buscarPizza(pizzaVO);
                
                for(PizzaVO pizVO : pizza){
                    pizzaVO.setSabor(pizVO.getSabor());
                    pizzaVO.setIngredientes(pizVO.getIngredientes());
                    pizzaVO.setTipo(pizVO.getTipo());
                    pizzaVO.setPreco(pizVO.getPreco());
                    pizzaVO.setStatus(pizVO.getStatus());
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null, "Ocorreu um erro ao tentar editar a pizza. Erro:" + e, "Edição de Pizza", JOptionPane.ERROR_MESSAGE);
            }
            
            CFormPizza cFormPizza = new CFormPizza(pizzaVO);
            cFormPizza.setVisible(true);
        }else
            JOptionPane.showMessageDialog(null, "Selecione uma pizza para editar.", "Edição de Pizza", JOptionPane.INFORMATION_MESSAGE);
        
    }    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JPanel pCenter;
    private javax.swing.JTable tbPizza;
    // End of variables declaration//GEN-END:variables
}
