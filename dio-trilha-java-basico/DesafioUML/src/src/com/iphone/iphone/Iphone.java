package com.iphone.iphone;

import com.iphone.funcionalidades.Funcoes;

public class Iphone extends Funcoes {
    public static void main(String[] args) {
        // Criação de um objeto da classe Iphone
        Iphone meuIphone = new Iphone();

        // Chamando os métodos implementados
        meuIphone.ligar("1234-5678");
        meuIphone.atender("1234-5678");
        meuIphone.iniciarCorreioVoz("1234-5678");

        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.selecionarMusica();

        meuIphone.exibirPagina("http://www.exemplo.com");
        meuIphone.adicionarNovaAba("http://www.novoexemplo.com");
        meuIphone.atualizarPagina();
    }
}
