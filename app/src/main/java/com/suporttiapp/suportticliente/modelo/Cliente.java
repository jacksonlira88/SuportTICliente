package com.suporttiapp.suportticliente.modelo;

/**
 * Created by jackson on 09/01/2018.
 */

public class Cliente {
    private String nome;
    private int matricula;
    private Setor setor;
    private String senhaDeAcess;


    public Cliente(String nome, int matricula, Setor setor, String senhaDeAcess) {
        this.nome = nome;
        this.matricula = matricula;
        this.setor = setor;
        this.senhaDeAcess = senhaDeAcess;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public Setor getSetor() {
        return setor;
    }

    public void setSetor(Setor setor) {
        this.setor = setor;
    }

    public String getSenhaDeAcess() {
        return senhaDeAcess;
    }

    public void setSenhaDeAcess(String senhaDeAcess) {
        this.senhaDeAcess = senhaDeAcess;
    }
}
