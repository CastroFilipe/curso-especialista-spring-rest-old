package com.castrofilipe.algafood.listener;

import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.event.ClienteAtivadoEvent;

@Component
public class EmissaoNotaFiscalListenerService {
	
	@EventListener
	public void EmitirNotaFiscal(ClienteAtivadoEvent evento) {
		System.out.println("EmissaoNotaFiscalListenerService: Evento capturado...");
		System.out.println("EmissaoNotaFiscalListenerService: "
				+ "Nota fiscal Emitida com sucesso para "+ evento.getCliente().getNome());
	}
}
