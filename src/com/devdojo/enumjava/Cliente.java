package com.devdojo.enumjava;

public class Cliente {

	
	 public enum TipoPagamento {
	  
	  // Todos os atributos aqui são considerados constantes. 
		 AVISTA, APRAZO;
	  
	 }
	 

	private String nome;
	private TipoCliente tipoCliente;
	private TipoPagamento tipoPagamento;

	public Cliente(String nome, TipoCliente tipo, TipoPagamento tipoPagamento) {
		super();
		this.nome = nome;
		this.tipoCliente = tipo;
		this.tipoPagamento = tipoPagamento;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public TipoCliente getTipo() {
		return tipoCliente;
	}

	public void setTipo(TipoCliente tipo) {
		this.tipoCliente = tipo;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", tipo=" + tipoCliente + ", tipoPagamento=" + tipoPagamento + ", numero="+tipoCliente.getTipo()+"]";
	}

	public TipoPagamento getTipoPagamento() {
		return tipoPagamento;
	}

	public void setTipoPagamento(TipoPagamento tipoPagamento) {
		this.tipoPagamento = tipoPagamento;
	}

}
