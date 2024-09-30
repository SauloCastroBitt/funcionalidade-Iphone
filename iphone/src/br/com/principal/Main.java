package br.com.principal;

import br.com.funcionalidades.Iphone;

public class Main {
    public static void main(String[] args) {
        Iphone meuIphone = new Iphone();

        // Testando as funcionalidades do iPhone
        meuIphone.tocar();
        meuIphone.pausar();
        meuIphone.parar();
        
        meuIphone.ligar("123456789");
        meuIphone.receberChamada("987654321");
        
        meuIphone.abrirPagina("www.exemplo.com");
        meuIphone.fecharPagina();
    }
}