package com.castrofilipe.algafood.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.castrofilipe.algafood.di.notificacao.NotificadorEmail;
import com.castrofilipe.algafood.di.service.AtivacaoClienteService;

@Configuration
public class BeanConfig {
	
	@Bean
	public NotificadorEmail notificadorEmail() {
		NotificadorEmail notificadorEmail = new NotificadorEmail("smtp.fakemail.com");
		notificadorEmail.setCaixaAlta(true);
		return notificadorEmail;
	}
	
	@Bean
	public AtivacaoClienteService ativacaoClienteService() {
		return new AtivacaoClienteService(notificadorEmail());
	}
	
}
