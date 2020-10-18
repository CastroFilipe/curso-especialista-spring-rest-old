package com.castrofilipe.algafood.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component
@PropertySource("classpath:sms.properties")
@ConfigurationProperties(prefix = "notificador.sms")
public class NotificadorSmsProperties {

	private String operadora;

	public String getOperadora() {
		return operadora;
	}

	public void setOperadora(String operadora) {
		this.operadora = operadora;
	}

}
