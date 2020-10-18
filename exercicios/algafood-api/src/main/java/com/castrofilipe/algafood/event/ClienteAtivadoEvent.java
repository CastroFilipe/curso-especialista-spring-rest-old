package com.castrofilipe.algafood.event;

/**
 * Classe que representa um evento a ser publicado.
 * O Padrão observer permite que a aplicação funcione com eventos e consumidores(listener),
 * os eventos serão lançados e os consumidores podem executar algum código quando isso
 * ocorrer.
 * 
 * @author Filipe
 * @see NotificadorListenerService
 */
import com.castrofilipe.algafood.modelo.Cliente;

public class ClienteAtivadoEvent {
	
	private Cliente cliente;
	
	public ClienteAtivadoEvent(Cliente cliente) {
		this.cliente = cliente;
	}
	
	public Cliente getCliente() {
		return cliente;
	}
}
