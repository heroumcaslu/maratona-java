package com.devdojo.collections;

public class Celular {

	private String nome;
	private String IMEI;

	public Celular(String nome, String iMEI) {
		super();
		this.nome = nome;
		IMEI = iMEI;
	}
	
	//O método equals tem que ser:
	//Reflexivo = x.equals(x) tem que ser true para tudo que for diferente de null
	//Simétrico para  x e y diferentes de null, se x.equals(y) == true logo y.equals(x) tem que ser true
	//Transitividade para x, y, z diferentes de null, se x.equals(y) == true, x.equals(z) == true log y.equals(z) == true
	//Consistente x.equals(y) deve sempre retornar o mesmo valor
	//para x diferente de null x.equals(null) tem que retornar false
	//Para hashcode
	//se x.equals(y) == true y.hashCode() == x.hashCode() == true;
	//se y.hashCode() == x.hashCode() == true, y.equals(x) pode ser false;
	//se x.equals(y) == false não verifica hashcode
	//se y.hashCode() != x.hashCode(), x.equals(y) deverá ser false
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getIMEI() {
		return IMEI;
	}

	public void setIMEI(String iMEI) {
		IMEI = iMEI;
	}

	//mesmo modificador de acesso mesmo nome mesmo parametro
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		if(obj == null) return false;
		//mesmo endereço de memória
		if(this == obj) return true;
		if(this.getClass() != obj.getClass()) return false;
		
		Celular outroCelular = (Celular) obj;
		//return IMEI != null ? IMEI.equals(outroCelular.getIMEI()) : false;
	
		return IMEI != null && IMEI.equals(outroCelular.getIMEI());
		
	}
	
	@Override
	public int hashCode() {
		
		//é um código válido mas põe todo mundodentro da mesma caixa.
		return IMEI != null ? IMEI.hashCode() : 1;
		
	}

	@Override
	public String toString() {
		return "Celular [nome=" + nome + ", IMEI=" + IMEI + "]";
	}
	
	

}
