package com.example.teste.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.example.teste.model.Lotacao;
import com.example.teste.service.LotacaoService;

import lombok.RequiredArgsConstructor;

@Controller
@RequestMapping("/lotacao")
@RequiredArgsConstructor
public class LotacaoController {	
	
	private final LotacaoService lotacaoService = new LotacaoService();

	@PostMapping
	public ResponseEntity<String> inserir(@RequestBody()Lotacao lotacao){

		try {
			lotacaoService.inserirLotacao(lotacao);
			return ResponseEntity.ok("Inserida com sucesso.");
		} catch (Exception e) {
			return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("ocorreu um erro");
		}
		
		
	}
	
}
