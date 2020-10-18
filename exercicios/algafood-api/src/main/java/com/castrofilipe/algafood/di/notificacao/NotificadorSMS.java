package com.castrofilipe.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;
import com.castrofilipe.algafood.properties.NotificadorSmsProperties;

@TipoDoNotificador(value = NivelUrgencia.URGENTE)
@Component
public class NotificadorSMS implements Notificador {
	
	@Autowired
	private NotificadorSmsProperties smsProperties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("NotificadorSMS: Notificando %s através de SMS: %s\n", 
				cliente.getNome(), mensagem);
		
		System.out.printf("NotificadorSMS: Operadora de telefonia: %s", smsProperties.getOperadora());
	}
	
}
