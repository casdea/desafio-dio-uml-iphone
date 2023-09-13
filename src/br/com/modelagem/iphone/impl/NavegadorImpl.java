package br.com.modelagem.iphone.impl;

import br.com.modelagem.iphone.interfaces.Navegador;

public class NavegadorImpl implements Navegador {

	@Override
	public void exibirPagina(String url) {
		System.out.println("Exibindo a pagina "+url);
		
	}

	@Override
	public void adicionarNovaAba() {
		System.out.println("Adicional nova aba no navegador");
		
	}

	@Override
	public void atualizarPagina() {
		System.out.println("Atualizando aba atual");		
	}


}
