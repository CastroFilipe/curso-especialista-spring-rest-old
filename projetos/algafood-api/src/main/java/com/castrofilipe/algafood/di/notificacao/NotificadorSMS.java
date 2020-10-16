package com.castrofilipe.algafood.di.notificacao;

import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class NotificadorSMS implements Notificador {

	@Override
	public void notificar(Cliente cliente, String mensagem) {
		System.out.printf("Notificando %s através de SMS: %s\n", 
				cliente.getNome(), mensagem);
	}
	
}
