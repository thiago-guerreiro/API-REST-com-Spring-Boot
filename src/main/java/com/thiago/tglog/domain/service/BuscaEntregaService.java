package com.thiago.tglog.domain.service;

import org.springframework.stereotype.Service;

import com.thiago.tglog.domain.exception.EntidadeNaoEncontradaException;
import com.thiago.tglog.domain.model.Entrega;
import com.thiago.tglog.domain.repository.EntregaRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@Service
public class BuscaEntregaService {
	
	private EntregaRepository entregaRepository;
	
	public Entrega buscar(Long entregaId) {
		return entregaRepository.findById(entregaId)
				.orElseThrow(() -> new EntidadeNaoEncontradaException("Entrega não encontrada."));
	}

}
