package br.com.modelagem.test;

import br.com.modelagem.iphone.IPhone;

public class UsandoIPhone {
	
	public static void main(String[] args) {
		IPhone iPhone = new IPhone();
		//Reprodutor
		iPhone.tocar();
		iPhone.pausar();
		iPhone.selecionarMusica("AMOR");
		//Telefone
		iPhone.atender();
		iPhone.ligar("559181158091");
		iPhone.iniciarCorreioVoz();
		//Navegador
		iPhone.exibirPagina("www.globo.com");
		iPhone.atualizarPagina();
		iPhone.adicionarNovaAba();
		
	}

}
