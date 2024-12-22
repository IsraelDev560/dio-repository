package com.banco.desf;

import com.banco.desf.ContasBancarias.ContaCorrente;
import com.banco.desf.ContasBancarias.ContaPoupanca;
import com.banco.desf.Cliente.Cliente;

public class Main {
    public static void main(String[] args) {
        Cliente israel = new Cliente();
        israel.setNome("Israel");

        ContaCorrente cc = new ContaCorrente(israel);
        ContaPoupanca poupanca = new ContaPoupanca(israel);
        cc.depositar(1200.0);
        cc.imprimirExtrato();
        cc.transferir(1200.0, poupanca);
        poupanca.imprimirExtrato();

    }
}
