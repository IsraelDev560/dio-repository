package com.banco.desf.ContasBancarias;

import com.banco.desf.Cliente.Cliente;

public class ContaPoupanca extends ContaAbstract {

    public ContaPoupanca(Cliente cliente) {
        super(cliente);
    }

    public void imprimirExtrato() {
        System.out.println("----Extrato Conta poupança----");
        super.imprimirInfosComuns();
    }

    @Override
    public String toString() {
        return "Conta Poupança de " + cliente.getNome();
    }

}
