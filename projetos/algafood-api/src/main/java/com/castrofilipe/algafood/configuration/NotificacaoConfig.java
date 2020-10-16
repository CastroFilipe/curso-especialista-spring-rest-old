package com.castrofilipe.algafood.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.castrofilipe.algafood.di.notificacao.NotificadorEmail;

@Configuration
public class NotificacaoConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.fakemail.com");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail;
	}
	
}
