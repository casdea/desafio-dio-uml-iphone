package br.com.modelagem.iphone;

import br.com.modelagem.iphone.interfaces.Navegador;
import br.com.modelagem.iphone.interfaces.ReprodutorMusical;
import br.com.modelagem.iphone.interfaces.Telefone;
import br.com.modelagem.so.SistemaOperacional;

public class IPhone implements ReprodutorMusical, Telefone, Navegador {

	private SistemaOperacional sistemaOperacional;

	public IPhone() {
		sistemaOperacional = new SistemaOperacional();
	}

	// Implementação dos métodos da interface reprodutor
	@Override
	public void tocar() {
		sistemaOperacional.getReprodutorMusical().tocar();
	}

	@Override
	public void pausar() {
		sistemaOperacional.getReprodutorMusical().pausar();
	}

	@Override
	public void selecionarMusica(String musica) {
		sistemaOperacional.getReprodutorMusical().selecionarMusica(musica);
	}

	// Implementação dos métodos da interface Telefone
	@Override
	public void ligar(String numero) {
		sistemaOperacional.getTelefone().ligar(numero);
	}

	@Override
	public void atender() {
		sistemaOperacional.getTelefone().atender();
	}

	@Override
	public void iniciarCorreioVoz() {
		sistemaOperacional.getTelefone().iniciarCorreioVoz();
	}

	// Implementação dos métodos da interface Navegador
	@Override
	public void exibirPagina(String url) {
		sistemaOperacional.getNavegador().exibirPagina(url);
	}

	@Override
	public void adicionarNovaAba() {
		sistemaOperacional.getNavegador().adicionarNovaAba();
	}

	@Override
	public void atualizarPagina() {
		sistemaOperacional.getNavegador().atualizarPagina();
	}
}