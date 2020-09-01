package com.devdojo.optional.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

import com.devdojo.optional.classes.Carro;
import com.devdojo.optional.classes.Pessoa;
import com.devdojo.optional.classes.Seguradora;

public class OptionalTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Seguradora s = new Seguradora("Alo vc");
		System.out.println(obterNomeSeguradoraOptional(s));

		//
		Carro carro = new Carro(s, "Audi");
		Pessoa p = new Pessoa(carro, "Carlos");

		getNomeSeguradora(Optional.ofNullable(p));

		obterNomeSeguradoraComIdade(p, 18);

		Map<String, String> map = new HashMap<String, String>();

		System.out.println(Optional.ofNullable(map.get("alow")));

	}

	/***
	 * Javadoc / + tres asteristicos
	 * @param numero
	 * @return
	 */
	private static Optional<Integer> stringToInt(String numero) {

		try {

			return Optional.of(Integer.parseInt(numero));

		} catch (NumberFormatException e) {
			// TODO: handle exception
			return Optional.empty();
		}

	}

	private static void checarNomeSeguradora(Seguradora seguradora) {

		if (seguradora != null && seguradora.getNome().equals("DevDojo Seguros")) {

			System.out.println("é o devdojo");

		}

	}

	private static void checarNomeSeguradoraOptional(Seguradora seguradora) {

		// Optional<Seguradora> seguradoraOptional = Optional.ofNullable(seguradora);
		Optional.ofNullable(seguradora).filter(s -> s.getNome().equals("DevDojo Seguros")).ifPresent(x -> {
			System.out.println("é o devdojo");
		});

	}

	public static String getNomeSeguradora(Optional<Pessoa> pessoa) {

		return pessoa.flatMap(Pessoa::getCarro).flatMap(Carro::getSeguradora).map(Seguradora::getNome)
				.orElse("Não existe");

	}

	public static String obterNomeSeguradoraOptional(Seguradora seguradora) {

		System.out.println(Optional.ofNullable(seguradora).map(Seguradora::getNome));
		// System.out.println(Optional.ofNullable(seguradora).flatMap(Seguradora::getNome).orElse("vazio"));

		return "";

	}

	private static String obterNomeSeguradoraComIdade(Pessoa p, int idade) {

		return Optional.ofNullable(p).filter(pessoa -> pessoa.getIdade() >= idade).flatMap(Pessoa::getCarro)
				.flatMap(Carro::getSeguradora).map(Seguradora::getNome)
				.orElse("Não existe seguradora ou a idade minima não foi atingida");

	}

	private static String obterNomeSeguradora(Seguradora seguradora) {

		String nome = null;
		if (seguradora.getNome() != null) {

			// nome = seguradora.getNome();

		}

		return nome;

	}

}
