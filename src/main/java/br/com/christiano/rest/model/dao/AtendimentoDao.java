package br.com.christiano.rest.model.dao;

import java.util.List;

import br.com.christiano.rest.model.domain.Atendimento;

public interface AtendimentoDao {
	
	public Atendimento salvarOuAtualizar(Atendimento atendimento);
	
	public void remover(Atendimento atendimento);
	
	public List<Atendimento> listar();
	
	public Atendimento buscarPorProtocolo(Integer protocolo);

}
