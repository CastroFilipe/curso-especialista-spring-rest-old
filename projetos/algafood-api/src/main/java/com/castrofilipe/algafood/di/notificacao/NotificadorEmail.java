package com.castrofilipe.algafood.di.notificacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class NotificadorEmail implements Notificador {
	public static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

	public NotificadorEmail() {
		LOGGER.info("Construtor do Bean NotificadorEmail foi chamado. Objeto criado: " + this);
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através do e-mail %s: %s\n", cliente.getNome(), cliente.getEmail(), mensagem);
	}
}
