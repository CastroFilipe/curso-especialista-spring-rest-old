package com.castrofilipe.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.event.ClienteAtivadoEvent;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	/*
	 * Interface que permite a publicação de eventos para que o IOc 
	 * tome conhecimento de que algum evento ocorreu na aplicação.
	 * Com a interface é possível trabalhar com o padrão observer na aplicação.
	 * */
	@Autowired
	private ApplicationEventPublisher eventPublisher;
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		// Padrão observer. Aqui será publicado o evento informando que o cliente está ativo.
		System.out.println("AtivacaoClienteService: Evento de ativação do cliente foi lançado");
		eventPublisher.publishEvent(new ClienteAtivadoEvent(cliente));

	}
}
