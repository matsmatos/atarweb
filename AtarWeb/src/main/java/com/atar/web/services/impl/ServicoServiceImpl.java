package com.atar.web.services.impl;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.atar.web.entities.Clientes;
import com.atar.web.entities.Equipamentos;
import com.atar.web.entities.Servicos;
import com.atar.web.repositories.ServicoRepository;
import com.atar.web.services.ServicoService;

@Service
public class ServicoServiceImpl implements ServicoService{

	private static final Logger log = LoggerFactory.getLogger(ServicoServiceImpl.class);
	
	
	
	@Autowired
	private ServicoRepository servicoRepository;
	
	public Servicos persistir(Servicos servico) {
		log.info("[EquipamentoServiceImpl : persistir] - Persistindo um serviço {}", servico);
		return this.servicoRepository.save(servico);
	}

	public Optional<Servicos> buscarPorDescricao(String descricao) {
		log.info("[EquipamentoServiceImpl : buscarPorMarca] - Buscando um equipamento por marca {}", descricao);
		return Optional.ofNullable(servicoRepository.findByDescricao(descricao));
	}
	
	public List<Servicos> listarServicos(){
		return this.servicoRepository.findAll();
		
	}

	@Override
	public void deletar(Servicos servico) {
		// TODO Auto-generated method stub
		this.servicoRepository.delete(servico);
		
		
		
	}

	@Override
	public Optional<List<Servicos>> buscarPorCliente(Clientes cliente) {
		return  this.servicoRepository.findByCliente(cliente);
		
	}

	@Override
	public Optional<List<Servicos>> buscarPorEquipamento(Equipamentos equipamento) {
		return  this.servicoRepository.findByEquipamento(equipamento);
		
	}

	
	
}
