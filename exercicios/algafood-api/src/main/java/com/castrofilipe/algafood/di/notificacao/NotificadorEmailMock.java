package com.castrofilipe.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;

@Profile("development")
@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("NotificadorEmailMock: SIMULANDO ENVIO EM AMBIENTE DEV: "
				+ "Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
