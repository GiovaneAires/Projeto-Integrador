/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vo;

import java.util.Date;

/**
 *
 * @author Giovane
 */
public class RelatorioVO {
    private String cliente;
    private String descricao;
    private Date dataI;
    private Date dataF;
    private Double preco;

    /**
     * @return the cliente
     */
    public String getCliente() {
        return cliente;
    }

    /**
     * @param cliente the cliente to set
     */
    public void setCliente(String cliente) {
        this.cliente = cliente;
    }

    /**
     * @return the descricao
     */
    public String getDescricao() {
        return descricao;
    }

    /**
     * @param descricao the descricao to set
     */
    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    /**
     * @return the dataI
     */
    public Date getDataI() {
        return dataI;
    }

    /**
     * @param dataI the dataI to set
     */
    public void setDataI(Date dataI) {
        this.dataI = dataI;
    }
    
    /**
     * @return the dataF
     */
    public Date getDataF() {
        return dataF;
    }

    /**
     * @param dataF the dataF to set
     */
    public void setDataF(Date dataF) {
        this.dataF = dataF;
    }

    /**
     * @return the preco
     */
    public Double getPreco() {
        return preco;
    }

    /**
     * @param preco the preco to set
     */
    public void setPreco(Double preco) {
        this.preco = preco;
    }
    
}
