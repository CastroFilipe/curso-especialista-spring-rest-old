package com.castrofilipe.algafood.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class MeuPrimeirController {
	
//	@GetMapping("/ola")
//	@ResponseBody
//	public String hello() {
//		return "Hello World!";
//	}
	
	@RequestMapping(method = RequestMethod.GET, path = "/ola")
	@ResponseBody
	public String hello() {
		return "Hello World!!!!!";
	}
}
