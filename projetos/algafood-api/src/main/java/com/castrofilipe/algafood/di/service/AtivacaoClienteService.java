package com.castrofilipe.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;
	
	@Autowired
	public AtivacaoClienteService(@Qualifier("email") Notificador notificador) {
		this.notificador = notificador;
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
		
	}
}
