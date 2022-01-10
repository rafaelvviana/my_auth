package br.com.rvv.auth.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/dados")
public class DadosController {

	/**
	 * API com retorno qualquer para simples teste da autenticacão 
	 */
	@GetMapping
	public List<String> getAllDados() {		
		return Arrays.asList("Dado 1", "Dado 2");
	}
}
