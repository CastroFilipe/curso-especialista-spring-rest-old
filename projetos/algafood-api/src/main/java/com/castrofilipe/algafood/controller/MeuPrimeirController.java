package com.castrofilipe.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.castrofilipe.algafood.di.service.AtivacaoClienteService;
import com.castrofilipe.algafood.modelo.Cliente;

@Controller
public class MeuPrimeirController {
	
	private AtivacaoClienteService ativacaoClienteService;
	
	/*
	 * Injeção de dependência através do construtor. Nesse caso o 
	 * acomplamento será forte pois não será utilizada interfaces.
	 * */
	public MeuPrimeirController(AtivacaoClienteService ativacaoClienteService) {
		this.ativacaoClienteService = ativacaoClienteService;
		
		System.out.println("MeuPrimeiroController- Bean Injetado via construtor: " 
				+ ativacaoClienteService);
	}
	
	@GetMapping("/hello")
	@ResponseBody
	public String hello() {
		
		Cliente cliente = new Cliente("João", "joão@abcdef.com", "91-99999999");
		
		ativacaoClienteService.ativar(cliente);
		
		return "Hello!";
	}
}
