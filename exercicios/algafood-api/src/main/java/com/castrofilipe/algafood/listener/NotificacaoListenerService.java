package com.castrofilipe.algafood.listener;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.NivelUrgencia;
import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.di.notificacao.TipoDoNotificador;
import com.castrofilipe.algafood.event.ClienteAtivadoEvent;

@Component
public class NotificacaoListenerService {

	@TipoDoNotificador(value = NivelUrgencia.NORMAL)
	@Autowired
	private Notificador notificador;
	
	@EventListener
	public void clienteFoiAtivado(ClienteAtivadoEvent evento) {
		System.out.println("NotificacaoListenerService: Evento foi capturado...");
		System.out.printf("NotificacaoListenerService: informações contidas no evento: %s, %s", 
				evento.getCliente().getNome(), evento.getCliente().getEmail());
		System.out.println("\nNotificacaoListenerService: Procedendo com a notificação do cliente...");
	
		notificador.notificar(evento.getCliente(), "Seu cadastro está ativo");
	}
}
