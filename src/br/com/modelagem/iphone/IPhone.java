package br.com.modelagem.iphone;

import br.com.modelagem.iphone.interfaces.Navegador;
import br.com.modelagem.iphone.interfaces.ReprodutorMusical;
import br.com.modelagem.iphone.interfaces.Telefone;

//Classe que representa o iPhone com as funcionalidades
class iPhone implements ReprodutorMusical, Telefone, Navegador {
	
	// Implementação dos métodos da interface ReprodutorMusical
	@Override
	public void tocar() {
		// Implementação da funcionalidade de tocar música
	}

	@Override
	public void pausar() {
		// Implementação da funcionalidade de pausar música
	}

	@Override
	public void selecionarMusica(String musica) {
		// Implementação da funcionalidade de selecionar música
	}

	// Implementação dos métodos da interface Telefone
	@Override
	public void ligar(String numero) {
		// Implementação da funcionalidade de fazer uma ligação
	}

	@Override
	public void atender() {
		// Implementação da funcionalidade de atender uma chamada
	}

	@Override
	public void iniciarCorreioVoz() {
		// Implementação da funcionalidade de iniciar o correio de voz
	}

	// Implementação dos métodos da interface Navegador
	@Override
	public void exibirPagina(String url) {
		// Implementação da funcionalidade de exibir uma página web
	}

	@Override
	public void adicionarNovaAba() {
		// Implementação da funcionalidade de adicionar uma nova aba
	}

	@Override
	public void atualizarPagina() {
		// Implementação da funcionalidade de atualizar uma página web
	}
}