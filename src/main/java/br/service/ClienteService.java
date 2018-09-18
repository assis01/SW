package br.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.model.Cliente;
import br.repository.ClienteRepository;

@Service
public class ClienteService {

	@Autowired
	private ClienteRepository repository;

	public List<Cliente> todos() {

		List<Cliente> equipamento = repository.findAll();

		return equipamento;

	}
	
	public void salvar(Cliente cliente){
		repository.save(cliente);
	}
}
