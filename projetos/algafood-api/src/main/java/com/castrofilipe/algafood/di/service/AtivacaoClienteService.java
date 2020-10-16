package com.castrofilipe.algafood.di.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {
	
	private List<Notificador> notificadores;
	
	//Ponto de injeção 1: Construtor
	public AtivacaoClienteService(@Autowired(required = false) List<Notificador> notificadores) {		
		this.notificadores = notificadores;
	}
	
	public void ativar(Cliente cliente) {
		cliente.ativar();
		
		if(!notificadores.isEmpty()) {
			for (Notificador notificador : notificadores) {
				notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");							
			}
		} else {
			System.out.println("Não existe notificado, porém o cadastro foi ativado");
		}

	}
}
