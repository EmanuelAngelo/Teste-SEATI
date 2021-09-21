package com.example.teste.mapper;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import com.example.teste.model.Lotacao;

@Mapper
@Repository
public interface LotacaoMapper {
	
	List<Lotacao> listagem();
	
	void inserir(@Param("lotacao") Lotacao lotacao);
	
}
