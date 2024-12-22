package com.iphone.funcionalidades;

public class Funcoes implements AparelhoTelefonico, ReprodutorMusical, NavegadorInternet {
    // Implementação dos métodos da interface AparelhoTelefonico
    @Override
    public void ligar(String numero) {
        System.out.println("Ligando para " + numero);
        // Implementação do método
    }

    @Override
    public void atender(String numero) {
        System.out.println("Atendendo a chamada de " + numero);
        // Implementação do método
    }

    @Override
    public void iniciarCorreioVoz(String numero) {
        System.out.println("Iniciando correio de voz para " + numero);
        // Implementação do método
    }

    // Implementação dos métodos da interface ReprodutorMusical
    @Override
    public void tocar() {
        System.out.println("Tocando música");
        // Implementação do método
    }

    @Override
    public void pausar() {
        System.out.println("Música pausada");
        // Implementação do método
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecionando música");
        // Implementação do método
    }

    // Implementação dos métodos da interface NavegadorInternet
    @Override
    public void exibirPagina(String url) {
        System.out.println("Exibindo página: " + url);
        // Implementação do método
    }

    @Override
    public void adicionarNovaAba(String url) {
        System.out.println("Adicionando nova aba: " + url);
        // Implementação do método
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página");
        // Implementação do método
    }
}