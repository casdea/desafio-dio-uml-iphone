package br.com.modelagem.so;

import br.com.modelagem.iphone.impl.NavegadorImpl;
import br.com.modelagem.iphone.impl.ReprodutorMusicalImpl;
import br.com.modelagem.iphone.impl.TelefoneImpl;
import br.com.modelagem.iphone.interfaces.Navegador;
import br.com.modelagem.iphone.interfaces.ReprodutorMusical;
import br.com.modelagem.iphone.interfaces.Telefone;

public class SistemaOperacional {

	private ReprodutorMusical reprodutorMusical;
    private Telefone telefone;
    private Navegador navegador;

    public SistemaOperacional() {
        // Inicialize as referências para as funcionalidades
        reprodutorMusical = new ReprodutorMusicalImpl(Memoria.getBibliotecaMusicas());
        telefone = new TelefoneImpl(Memoria.getListaContatos());
        navegador = new NavegadorImpl();
    }

    // Métodos para acessar as funcionalidades
    public ReprodutorMusical getReprodutorMusical() {
        return reprodutorMusical;
    }

    public Telefone getTelefone() {
        return telefone;
    }

    public Navegador getNavegador() {
        return navegador;
    }
}