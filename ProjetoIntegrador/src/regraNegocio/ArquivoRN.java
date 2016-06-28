/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package regraNegocio;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import view.RFormRelatorioPedidoPorCliente;
import view.RFormRelatorioPedidoPorPeriodo;

/**
 *
 * @author Giovane
 */
public class ArquivoRN {
    public void gerarRelatorioPorCliente(RFormRelatorioPedidoPorCliente form){
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter filtroExcel = new FileNameExtensionFilter("Documentos Microsoft Excel", "xls");
        fc.addChoosableFileFilter(filtroExcel);
        
        int retorno = fc.showSaveDialog(form);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            String caminho = fc.getSelectedFile().getAbsolutePath() + ".xls";
            
            try{
                File arquivo = new File(caminho);
                if(!arquivo.exists()) {
                    arquivo.createNewFile();
                }else{
                    int resposta = JOptionPane.showConfirmDialog(null, "Verificado que o arquivo já existe. Deseja sobrescrever o arquivo?", "Novo Arquivo", JOptionPane.YES_NO_OPTION);
                    if(resposta != 0)
                        return;
                    else{
                        arquivo.delete();
                        arquivo.createNewFile();
                    }
                }
                try{
                    BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminho),"ISO-8859-1"));
                    bf.write("Cliente" + "\t" + "Descrição" + "\t" + "Data/Hora" + "\t" + "Preço");
                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) form.tbPedidoCliente.getModel();
                    for(int i=0; i<dtm.getRowCount(); i++){
                        bf.newLine();
                        for(int j=0; j<dtm.getColumnCount(); j++){
                            bf.write(dtm.getValueAt(i, j).toString() + "\t");
                        }
                    }
                    bf.close();
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo." + ex);
                }
                JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso.");
            } catch (IOException io){
                JOptionPane.showMessageDialog(null, "Erro ao criar arquivo." + io.getMessage());
            }
        }
    }
    
    public void gerarRelatorioPorPeriodo(RFormRelatorioPedidoPorPeriodo form){
        JFileChooser fc = new JFileChooser();
        fc.setAcceptAllFileFilterUsed(false);
        
        FileNameExtensionFilter filtroExcel = new FileNameExtensionFilter("Documentos Microsoft Excel", "xls");
        fc.addChoosableFileFilter(filtroExcel);
        
        int retorno = fc.showSaveDialog(form);
        
        if(retorno == JFileChooser.APPROVE_OPTION){
            String caminho = fc.getSelectedFile().getAbsolutePath() + ".xls";
            
            try{
                File arquivo = new File(caminho);
                if(!arquivo.exists()) {
                    arquivo.createNewFile();
                }else{
                    int resposta = JOptionPane.showConfirmDialog(null, "Verificado que o arquivo já existe. Deseja sobrescrever o arquivo?", "Novo Arquivo", JOptionPane.YES_NO_OPTION);
                    if(resposta != 0)
                        return;
                    else{
                        arquivo.delete();
                        arquivo.createNewFile();
                    }
                }
                try{
                    BufferedWriter bf = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(caminho),"ISO-8859-1"));
                    bf.write("Cliente" + "\t" + "Descrição" + "\t" + "Data/Hora" + "\t" + "Preço");
                    javax.swing.table.DefaultTableModel dtm = (javax.swing.table.DefaultTableModel) form.tbPedidoPeriodo.getModel();
                    for(int i=0; i<dtm.getRowCount(); i++){
                        bf.newLine();
                        for(int j=0; j<dtm.getColumnCount(); j++){
                            bf.write(dtm.getValueAt(i, j).toString() + "\t");
                        }
                    }
                    bf.close();
                }catch (Exception ex) {
                    JOptionPane.showMessageDialog(null, "Erro ao escrever no arquivo." + ex);
                }
                JOptionPane.showMessageDialog(null, "Arquivo criado com sucesso.");
            } catch (IOException io){
                JOptionPane.showMessageDialog(null, "Erro ao criar arquivo." + io.getMessage());
            }
        }
    }
}