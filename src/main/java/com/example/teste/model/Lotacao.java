package com.example.teste.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Lotacao {
	private String descricao;
	private LocalDateTime dataCadastro;
}
