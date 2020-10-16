package com.castrofilipe.algafood.di.notificacao;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.castrofilipe.algafood.modelo.Cliente;

public class NotificadorEmail implements Notificador {
	public static final Logger LOGGER = LoggerFactory.getLogger(NotificadorEmail.class);

	/*
	 * Representam configurações simples para definir se a notificação exibida
	 * no email será em caixa alta qual o servidor de email.
	 * Exemplos usados para exemplificar o uso de configurações para serem utilizadas
	 * na inicialização da aplicação.
	 * */
	private boolean caixaAlta;
	
	private String hostServidorSmtp;
	
	public NotificadorEmail(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
		
		LOGGER.info("Construtor do Bean NotificadorEmail foi chamado. Objeto criado: " + this);
	}

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		if(caixaAlta) {
			mensagem = mensagem.toUpperCase();
		}
		
		System.out.printf("Notificando %s através do e-mail %s usando SMTP %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), this.hostServidorSmtp, mensagem);
	}

	public void setCaixaAlta(boolean caixaAlta) {
		this.caixaAlta = caixaAlta;
	}
	
	public void setHostServidorSmtp(String hostServidorSmtp) {
		this.hostServidorSmtp = hostServidorSmtp;
	}
	
}
