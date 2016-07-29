package br.com.christiano.rest.service.impl;

import java.util.List;

import javax.inject.Inject;
import javax.transaction.Transactional;

import br.com.christiano.rest.model.dao.AtendimentoDao;
import br.com.christiano.rest.model.domain.Atendimento;
import br.com.christiano.rest.service.AtendimentoService;

public class AtendimentoServiceImpl implements AtendimentoService {
	@Inject
	private AtendimentoDao dao;

	@Override
	@Transactional
	public void salvar(Atendimento atendimento) {
		dao.salvarOuAtualizar(atendimento);
	}

	@Override
	@Transactional
	public void remover(Atendimento atendimento) {
		dao.remover(atendimento);
	}

	@Override
	@Transactional
	public List<Atendimento> listarTodos() {
		return dao.listar();
	}

	@Override
	public void remover(Integer protocolo) {
		Atendimento a = dao.buscarPorProtocolo(protocolo);
		if (a!=null){
			dao.remover(a);
		}
		
	}

}
