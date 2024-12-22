package com.banco.desf.Banco;

import com.banco.desf.ContasBancarias.ContaAbstract;
import java.util.List;

public class Banco {
    private String nome;
    private List<ContaAbstract> contas;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<ContaAbstract> getContas() {
        return contas;
    }

    public void setContas(List<ContaAbstract> contas) {
        this.contas = contas;
    }
}
