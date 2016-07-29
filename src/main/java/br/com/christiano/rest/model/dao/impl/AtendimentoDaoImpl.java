package br.com.christiano.rest.model.dao.impl;

import java.util.ArrayList;
import java.util.List;

import br.com.christiano.rest.model.dao.AtendimentoDao;
import br.com.christiano.rest.model.domain.Atendimento;
import br.com.christiano.rest.model.domain.NotaAtendimentoEnum;

public class AtendimentoDaoImpl implements AtendimentoDao {
	
	private List<Atendimento> lista;

	@Override
	public Atendimento salvarOuAtualizar(Atendimento atendimento) {
		lista.add(atendimento);
		return atendimento;
	}

	@Override
	public void remover(Atendimento atendimento) {
		lista.remove(atendimento);

	}

	@Override
	public List<Atendimento> listar() {
		if (lista==null){
			lista = new ArrayList<Atendimento>();
			Atendimento a;
			for (int i =0 ; i <3 ; i++){
				a = new Atendimento();
				a.setAtendimentoEnum(NotaAtendimentoEnum.Bom);
				a.setDetalhamento("lalalalal " + i);
				a.setNomeCliente("Cliente "+i);
				a.setProtocolo(i);
				
				lista.add(a);
			}
		}
		return lista;
	}

	@Override
	public Atendimento buscarPorProtocolo(Integer protocolo) {
		// TODO Auto-generated method stub
		return null;
	}

}
