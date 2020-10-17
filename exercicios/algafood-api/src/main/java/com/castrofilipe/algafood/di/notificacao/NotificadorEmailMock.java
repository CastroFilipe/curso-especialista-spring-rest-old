package com.castrofilipe.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;

@Profile("dev")
@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class NotificadorEmailMock implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("MOCK - SIMULANDO ENVIO: Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
