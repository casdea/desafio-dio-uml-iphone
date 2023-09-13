package br.com.modelagem.iphone.impl;

import java.util.List;

import br.com.modelagem.iphone.interfaces.ReprodutorMusical;

public class ReprodutorMusicalImpl implements ReprodutorMusical {

	private List<String> listaMusicas;
	private int index;

	public ReprodutorMusicalImpl(List<String> listaMusicas) {
		super();
		this.listaMusicas = listaMusicas;
	}

	@Override
	public void tocar() {
		System.out.println("tocando musica " + listaMusicas.get(index));
	}

	@Override
	public void pausar() {
		System.out.println("Pausar musica");

	}

	@Override
	public void selecionarMusica(String musica) {
		index = listaMusicas.indexOf(musica);
		tocar();
	}

}
