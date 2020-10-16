package com.castrofilipe.algafood.di.service;

import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.modelo.Cliente;

public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	/*
	 * Injeção de dependência feita através da chamada do construtor. A injeção através
	 * do construtor é apenas uma das formas de injeção(Autowired é também outro exemplo).
	 * Na inicialização da aplicação o Spring fará a injeção do Bean notificador.
	 * Aqui há um baixo acomplamento pois é utilizado a interface notificador e não
	 * sua implementação.
	 * */
	public AtivacaoClienteService(Notificador notificador) {
		this.notificador = notificador;
		
		System.out.println("AtivacaoClienteService- Bean Injetado via construtor: " 
				+ notificador);
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
