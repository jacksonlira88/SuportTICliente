package com.suporttiapp.suportticliente.modelo;

import java.util.Date;

/**
 * Created by jackson on 09/01/2018.
 */

public class Chamado {
    private String nomeProblema;
    private String descricao;
    private Cliente cliente;
    private Boolean status;
    private int posicao;
    private Date data;
    private int avalicao;


    public Chamado(String nomeProblema, String descricao, Cliente cliente, Boolean status, Date data) {
        this.nomeProblema = nomeProblema;
        this.descricao = descricao;
        this.cliente = cliente;
        this.status = status;
        this.data = data;
    }

    public String getNomeProblema() {
        return nomeProblema;
    }

    public void setNomeProblema(String nomeProblema) {
        this.nomeProblema = nomeProblema;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public int getPosicao() {
        return posicao;
    }

    public void setPosicao(int posicao) {
        this.posicao = posicao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public int getAvalicao() {
        return avalicao;
    }

    public void setAvalicao(int avalicao) {
        this.avalicao = avalicao;
    }
}
