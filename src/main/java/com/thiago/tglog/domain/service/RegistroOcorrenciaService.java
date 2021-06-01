package com.thiago.tglog.domain.service;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.thiago.tglog.domain.model.Entrega;
import com.thiago.tglog.domain.model.Ocorrencia;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class RegistroOcorrenciaService {
	
	private BuscaEntregaService buscaEntregaService;
	
	@Transactional
	public Ocorrencia registrar(Long entregaId, String descricao) {
		Entrega entrega = buscaEntregaService.buscar(entregaId);
		
		return entrega.adicionarOcorrencia(descricao);
	}

}
