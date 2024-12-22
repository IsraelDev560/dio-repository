package com.banco.desf.ContasBancarias;

public interface Conta {
    void sacar(double valor);

    void depositar(double valor);

    void transferir(double valor, ContaAbstract contaDestino);

    void imprimirExtrato();
}
