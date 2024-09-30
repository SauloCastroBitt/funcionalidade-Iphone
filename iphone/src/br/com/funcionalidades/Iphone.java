package br.com.funcionalidades;

import br.com.interfaces.AparelhoTelefonico;
import br.com.interfaces.NavegadorInternet;
import br.com.interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, AparelhoTelefonico, NavegadorInternet{

	// Implementação do Reprodutor Musical
	 @Override
	    public void tocar() {
	        System.out.println("Reproduzindo música...");
	    }

	    @Override
	    public void pausar() {
	        System.out.println("Música pausada.");
	    }

	    @Override
	    public void parar() {
	        System.out.println("Música parada.");
	    }

	    // Implementação do Aparelho Telefônico
	    @Override
	    public void ligar(String numero) {
	        System.out.println("Ligando para " + numero + "...");
	    }

	    @Override
	    public void receberChamada(String numero) {
	        System.out.println("Recebendo chamada de " + numero + "...");
	    }

	    // Implementação do Navegador na Internet
	    @Override
	    public void abrirPagina(String url) {
	        System.out.println("Abrindo a página: " + url);
	    }

	    @Override
	    public void fecharPagina() {
	        System.out.println("Página fechada.");
	    }
	}
