package com.devdojo.collections;

public class Produto implements Comparable<Produto> {

	private String serialNumber;
	private String nome;
	private double preco;

	public Produto(String serialNumber, String nome, double preco) {
		super();
		this.serialNumber = serialNumber;
		this.nome = nome;
		this.preco = preco;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((serialNumber == null) ? 0 : serialNumber.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Produto other = (Produto) obj;
		if (serialNumber == null) {
			if (other.serialNumber != null)
				return false;
		} else if (!serialNumber.equals(other.serialNumber))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Produto [serialNumber=" + serialNumber + ", nome=" + nome + ", preco=" + preco + "]";
	}

	//Não é uma boa ideia mudar, usar o comparator pra isso
	@Override
	public int compareTo(Produto o) {
		// TODO Auto-generated method stub
		//negativo se thisObject < outroObjeto
		//zero se thisObject == outroObjeto
		//positivo se thisObject > outroObjeto
		//tipo primitivo tem que fazer o boxing transformar double em Double por exemplo
		//Double d = preco;
		//d.compareTo(o.getPreco());
		return this.serialNumber.compareTo(o.getSerialNumber());
	}

}
