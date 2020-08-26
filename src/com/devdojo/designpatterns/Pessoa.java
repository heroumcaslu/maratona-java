package com.devdojo.designpatterns;

public class Pessoa {

	private String name;
	private String lastName;
	private String middleName;
	private String nick;
	private String father;

	private Pessoa(String name, String lastName, String middleName, String nick, String father) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.middleName = middleName;
		this.nick = nick;
		this.father = father;
	}

	public Pessoa() {
		// TODO Auto-generated constructor stub

	}

	public static class PessoaBuilder {

		private String name;
		private String lastName;
		private String middleName;
		private String nick;
		private String father;

		//parametros obrigatorios colocar no construtor
		public PessoaBuilder(String name) {
			// TODO Auto-generated constructor stub
			this.name = name;
		}

		public PessoaBuilder name(String name) {

			this.name = name;
			return this;

		}

		public PessoaBuilder lastName(String lastName) {

			this.lastName = lastName;
			return this;

		}

		public PessoaBuilder middleName(String middleName) {

			this.middleName = middleName;
			return this;

		}

		public PessoaBuilder nick(String nickname) {

			this.nick =nickname;
			return this;

		}

		public PessoaBuilder father(String fathersName) {

			this.father = fathersName;
			return this;

		}
		
		public Pessoa build() {
			
			return new Pessoa(this.name, this.lastName, this.middleName, this.nick, this.father);
			
		}

	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getNick() {
		return nick;
	}

	public void setNick(String nick) {
		this.nick = nick;
	}

	public String getFather() {
		return father;
	}

	public void setFather(String father) {
		this.father = father;
	}

}
