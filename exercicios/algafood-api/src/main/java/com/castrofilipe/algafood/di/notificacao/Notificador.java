package com.castrofilipe.algafood.di.notificacao;

import com.castrofilipe.algafood.modelo.Cliente;

public interface Notificador {

	void notificar(Cliente cliente, String mensagem);

}