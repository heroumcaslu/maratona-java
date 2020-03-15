package com.devdojo.interfaces;

public class Produto implements Tributavel, Transportavel {
	
	private String nome;
	private double peso;
	private double preco;
	private double precoFinal;
	private double valorFrete;

	//não pode ser mais restritivo que o método sobrescrito.
	@Override
	public void calcularImposto() {
		// TODO Auto-generated method stub
		this.precoFinal= this.preco + (this.preco * IMPOSTO);
		
	}

	@Override
	public void calcularFrete() {
		// TODO Auto-generated method stub
		this.valorFrete = this.preco/this.peso*0.1;
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public String toString() {
		return "Produto [nome=" + nome + ", peso=" + peso + ", preco=" + preco + ", precoFinal=" + precoFinal
				+ ", valorFrete=" + valorFrete + "]";
	}

	public Produto(String nome, double peso, double preco) {
		super();
		this.nome = nome;
		this.peso = peso;
		this.preco = preco;
	}

	public double getPrecoFinal() {
		return precoFinal;
	}

	public double getValorFrete() {
		return valorFrete;
	}
	
	
	

}
