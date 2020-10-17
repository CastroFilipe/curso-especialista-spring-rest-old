package com.castrofilipe.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.castrofilipe.algafood.di.service.AtivacaoClienteService;
import com.castrofilipe.algafood.modelo.Cliente;

@Controller
public class MeuPrimeirController {
	
	private AtivacaoClienteService ativacaoClienteService;

	public MeuPrimeirController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente cliente = new Cliente("João", "joão@abcdef.com", "91-99999999");
		
		ativacaoClienteService.ativar(cliente);
		
		return "Hello!";
	}
}
