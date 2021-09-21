package com.example.teste.model;

import java.time.LocalDateTime;

import lombok.Data;

@Data
public class Servidor 
{
	
	private String nome;
	private String matricula;
	private LocalDateTime data;
	private Lotacao lotacao;
	
	
}
