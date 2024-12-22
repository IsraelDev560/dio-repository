package com.banco.desf.ContasBancarias;

import com.banco.desf.Cliente.Cliente;

public class ContaCorrente extends ContaAbstract {

    public ContaCorrente(Cliente cliente) {
        super(cliente);
    }

    @Override
    public void imprimirExtrato() {
        System.out.println("----Extrato Conta corrente----");
        super.imprimirInfosComuns();
    }
    @Override
    public String toString() {
        return "Conta Corrente de " + cliente.getNome();
    }

}

