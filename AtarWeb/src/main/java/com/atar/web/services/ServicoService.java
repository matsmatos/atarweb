package com.atar.web.services;

import java.util.List;
import java.util.Optional;

import com.atar.web.entities.Clientes;
import com.atar.web.entities.Equipamentos;
import com.atar.web.entities.Servicos;

public interface ServicoService {

	/**
	 * Persiste um servico na base de dados.
	 * 
	 * @param servico
	 * @return Servicos
	 * @author @Caio Fernandes
	 * 
	 */
	Servicos persistir(Servicos servico);
	
	/**
	 * Retorna uma lista paginada de serviços de um determinado cliente.
	 * 
	 * @param clienteId
	 * @param pageRequest
	 * @return Page<Servicos>
	 * @author @Caio Fernandes
	 */
	//Page<Servicos> buscarPorFuncionarioId(Long clienteId, PageRequest pageRequest);
	
	/**
	 * Retorna uma descricao.
	 * 
	 * @param descricao
	 * @return Optional<Servicos>
	 * @author @Caio Fernandes
	 */
	Optional<Servicos> buscarPorDescricao(String descricao);
	
	List<Servicos> listarServicos();
 

	void deletar(Servicos servico);
	
	Optional<List<Servicos>> buscarPorCliente(Clientes cliente);
	
	Optional<List<Servicos>> buscarPorEquipamento(Equipamentos equipamento);
	
	
	
	
}
