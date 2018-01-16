package com.suporttiapp.suportticliente.servico;

import com.suporttiapp.suportticliente.modelo.Chamado;

import java.util.List;

/**
 * Created by jackson on 09/01/2018.
 */

public class GerenciadorChamados {
    private Chamado chamado;
    private static List<Chamado> chamados = null;

    private GerenciadorChamados(){

    }

    public static void cadastraNovoChamdo(Chamado cm){
            //adicionar a lista, setar no adpter e enviar para o tecnico.
        chamados.add(cm);

    }

    private static void atualizar() {
    }

    public static List chamadosAtivos(){
        List<Chamado> cAtivos = chamados;
        return cAtivos;
    }




}
