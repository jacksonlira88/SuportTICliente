package com.suporttiapp.suportticliente.modelo;

/**
 * Created by jackson on 09/01/2018.
 */

public class Setor {
    private String nome;
    private int prioridade;

    public Setor(String nome, int prioridade) {
        this.nome = nome;
        this.prioridade = prioridade;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getPrioridade() {
        return prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }
}
