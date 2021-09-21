package com.example.teste.service;

import org.springframework.stereotype.Service;

import com.example.teste.mapper.LotacaoMapper;
import com.example.teste.model.Lotacao;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class LotacaoService {
	private final LotacaoMapper mapper = null;
	
	
	public void inserirLotacao(Lotacao lotacao) {
			mapper.inserir(lotacao);
		
	}
	

}
