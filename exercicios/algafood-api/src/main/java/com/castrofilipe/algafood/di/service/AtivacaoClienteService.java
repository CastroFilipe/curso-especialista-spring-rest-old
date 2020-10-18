package com.castrofilipe.algafood.di.service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.castrofilipe.algafood.di.notificacao.NivelUrgencia;
import com.castrofilipe.algafood.di.notificacao.Notificador;
import com.castrofilipe.algafood.di.notificacao.TipoDoNotificador;
import com.castrofilipe.algafood.modelo.Cliente;

@Component
public class AtivacaoClienteService {

	private Notificador notificador;

	@Autowired
	public AtivacaoClienteService(@TipoDoNotificador(value = NivelUrgencia.NORMAL) Notificador notificador) {
		this.notificador = notificador;
	}
	
	@PostConstruct
	private void init() {
		System.out.println("Método chamado logo após a fase de INICIALIZAÇÃO do bean "
				+ "(Somente após chamar o construtor)");
	}
	
	@PreDestroy
	private void preDestroy() {
		System.out.println("Método chamado ANTES de iniciar a fase de DESTRUIÇÃO do bean");		
	}

	public void ativar(Cliente cliente) {
		cliente.ativar();
		notificador.notificar(cliente, "Seu cadastro no sistema está ativo!");

	}
}
