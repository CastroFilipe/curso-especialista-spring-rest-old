package com.castrofilipe.algafood.di.notificacao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;
import com.castrofilipe.algafood.properties.NotificadorProperties;

@Profile("production")
@TipoDoNotificador(value = NivelUrgencia.NORMAL)
@Component
public class NotificadorEmail implements Notificador {

	@Autowired
	private NotificadorProperties notificadorProperties;

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("NotificadorEmail: Notificando %s através do e-mail %s: %s\n", cliente.getNome(),
				cliente.getEmail(), mensagem);

		System.out.printf("\nInfo servidor- Host: %s porta: %s", notificadorProperties.getHostServidor(),
				notificadorProperties.getPortaServidor());
	}

}
