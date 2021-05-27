package com.thiago.tglog.api.controller;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.thiago.tglog.domain.model.Cliente;
import com.thiago.tglog.domain.repository.ClienteRepository;

import lombok.AllArgsConstructor;

@AllArgsConstructor
@RestController
public class ClienteController {
	
	private ClienteRepository clienteRepository;

	@GetMapping("/clientes")
	public List<Cliente> listar() {
		return clienteRepository.findAll();
	}
	
}
