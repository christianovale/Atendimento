package br.com.christiano.rest.model.domain;

import java.io.Serializable;

public class Atendimento implements Serializable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Integer protocolo;
	private String nomeCliente;
	private String detalhamento;
	private NotaAtendimentoEnum atendimentoEnum;
	public Integer getProtocolo() {
		return protocolo;
	}
	public void setProtocolo(Integer protocolo) {
		this.protocolo = protocolo;
	}
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getDetalhamento() {
		return detalhamento;
	}
	public void setDetalhamento(String detalhamento) {
		this.detalhamento = detalhamento;
	}
	public NotaAtendimentoEnum getAtendimentoEnum() {
		return atendimentoEnum;
	}
	public void setAtendimentoEnum(NotaAtendimentoEnum atendimentoEnum) {
		this.atendimentoEnum = atendimentoEnum;
	}

	
}
