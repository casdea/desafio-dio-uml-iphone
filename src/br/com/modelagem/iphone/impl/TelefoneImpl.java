package br.com.modelagem.iphone.impl;

import java.util.List;

import br.com.modelagem.iphone.interfaces.Telefone;

public class TelefoneImpl implements Telefone {

	private List<String> listaContatos;
	private int index;	 


	public TelefoneImpl(List<String> listaContatos) {
		super();
		this.listaContatos = listaContatos;
	}	
	
	@Override
	public void ligar(String numero) {
		System.out.println("ligando para o numero " + listaContatos.get(index));
		
	}

	@Override
	public void atender() {
		System.out.println("Atender ligacao");
		
	}

	@Override
	public void iniciarCorreioVoz() {
		System.out.println("Iniciar Correio de Voz");
		
	}



}
