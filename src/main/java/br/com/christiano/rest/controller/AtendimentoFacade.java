package br.com.christiano.rest.controller;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

import br.com.christiano.rest.model.domain.Atendimento;
import br.com.christiano.rest.service.AtendimentoService;

@Path("/atendimento")
@Produces({"application/json"})
public class AtendimentoFacade {
	
	@Inject
	private AtendimentoService atendimentoService;
	
	@GET
	@Path("/")
	public List<Atendimento> listarTodos(){
		return atendimentoService.listarTodos();
	}
	
	@POST
	@Path("/")
	public void salvar(Atendimento atendimento){
		atendimentoService.salvar(atendimento);
	}
	
	@DELETE
	@Path("/protocolo")
	public void remover(@PathParam("protocolo") Integer protocolo){
		atendimentoService.remover(protocolo);
	}

}
