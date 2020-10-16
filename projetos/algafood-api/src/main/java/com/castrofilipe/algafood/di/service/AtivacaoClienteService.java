package com.castrofilipe.algafood.di.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	private Notificador notificador;
	
	//Ponto de injeção 1: Construtor
	public AtivacaoClienteService(@Autowired(required = false) Notificador notificador) {		
		this.notificador = notificador;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(notificador != null) {
			notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");			
		} else {
			System.out.println("Não existe notificado, porém o cadastro foi ativado");
		}

	}
}
