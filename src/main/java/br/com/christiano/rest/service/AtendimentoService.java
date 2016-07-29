package br.com.christiano.rest.service;

import java.util.List;

import br.com.christiano.rest.model.domain.Atendimento;

public interface AtendimentoService {
	
	public void salvar(Atendimento atendimento);
	
	public void remover(Atendimento atendimento);
	
	public void remover(Integer protocolo);
	
	public List<Atendimento> listarTodos();

}
