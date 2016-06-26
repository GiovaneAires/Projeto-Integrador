/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package persistencia;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import vo.ClienteVO;

/**
 *
 * @author Giovane
 */
public class ClientePers {
    Conexao conexao;
    public ClientePers(){
        this.conexao = new Conexao();
    }

    public ArrayList <ClienteVO> buscarCliente(ClienteVO clienteVO) throws SQLException, Exception {

        ArrayList <ClienteVO> cliente = new ArrayList();
        
        try {
            Connection con;
            Statement stm;
            ResultSet consulta;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            sql = "SELECT * FROM cliente ";
            
            if(clienteVO.getCodigo() != 0 || clienteVO.getNome() != null || clienteVO.getTelefone() != null){
                sql = sql + "WHERE TRUE ";
                
                if(clienteVO.getCodigo() != 0)
                    sql = sql + " AND cli_codigo = " + clienteVO.getCodigo();
                
                if(clienteVO.getNome() != null)
                    sql = sql + " AND cli_nome LIKE '%" + clienteVO.getNome() + "%'";
                
                if(clienteVO.getTelefone() != null)
                    sql = sql + " AND cli_telefone LIKE '" + clienteVO.getTelefone() + "'";
            }
            consulta = stm.executeQuery(sql);
            
            while (consulta.next()) {

                ClienteVO cliVO = new ClienteVO();
                
                cliVO.setCodigo(consulta.getInt("cli_codigo"));
                cliVO.setNome(consulta.getString("cli_nome"));
                cliVO.setTelefone(consulta.getString("cli_telefone"));
                cliVO.setLogradouro(consulta.getString("cli_logradouro"));
                cliVO.setNumero(consulta.getInt("cli_numero"));
                cliVO.setComplemento(consulta.getString("cli_complemento"));
                cliVO.setBairro(consulta.getString("cli_bairro"));
                cliVO.setCidade(consulta.getString("cli_cidade"));
                cliVO.setEstado(consulta.getString("cli_estado"));
                cliVO.setCep(consulta.getString("cli_cep"));
                cliVO.setStatus(consulta.getString("cli_status"));
                
                cliente.add(cliVO);
            }
            return cliente;
        } finally {
            conexao.desconectar();   
        }
    }
    
    public void gravarCliente(ClienteVO cliVO) throws SQLException, Exception{
        try {
            Connection con;
            Statement stm;
            String sql;
            
            con = conexao.conectar();
            stm = con.createStatement();
            
            String complemento = cliVO.getStatus() == null ? "" : "cli_complemento = '" + cliVO.getComplemento() + "', ";
            
            if(cliVO.getCodigo() == 0){
                sql = "INSERT INTO cliente (cli_nome, cli_telefone, cli_logradouro, cli_numero, cli_complemento, cli_bairro, "
                        + "cli_cidade, cli_estado, cli_cep, cli_status) VALUES ("
                        + "'" + cliVO.getNome() + "', "
                        + "'" + cliVO.getTelefone() + "', "
                        + "'" + cliVO.getLogradouro() + "', "
                        + cliVO.getNumero()+ ", "
                        + complemento
                        + "'" + cliVO.getBairro()+ "', "
                        + "'" + cliVO.getCidade()+ "', "
                        + "'" + cliVO.getEstado()+ "', "
                        + "'" + cliVO.getCep() + "', "
                        + "'" + cliVO.getStatus()+ "'"
                        + ");";
            }else{
                sql = "UPDATE cliente SET "
                        + "cli_nome = '" + cliVO.getNome() + "', "
                        + "cli_telefone = '" + cliVO.getTelefone() + "', "
                        + "cli_logradouro = '" + cliVO.getLogradouro() + "', "
                        + "cli_numero = " + cliVO.getNumero()+ ", "
                        + complemento
                        + "cli_bairro = '" + cliVO.getBairro() + "', "
                        + "cli_cidade = '" + cliVO.getCidade() + "', "
                        + "cli_estado = '" + cliVO.getEstado() + "', "
                        + "cli_cep = '" + cliVO.getCep() + "', "
                        + "cli_status = '" + cliVO.getStatus() + "'"
                        + "WHERE cli_codigo = " + cliVO.getCodigo();
            }
            System.out.println(sql);
            stm.executeUpdate(sql);
        }finally{
            conexao.desconectar();
        }
    }
}
