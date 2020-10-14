package com.castrofilipe.algafood.di.service;

import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.NotificadorEmail;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	private NotificadorEmail notificador;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();

		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");
	}
}
