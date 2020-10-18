package com.castrofilipe.algafood.di.notificacao;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;

@Profile("prod")
@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("NotificadorEmail: Notificando %s através do e-mail %s: %s\n", 
				cliente.getNome(), cliente.getEmail(), mensagem);
	}
	
}
