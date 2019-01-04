package br.com.zoologico.classes;

public class Gato extends Animal {

	public Gato(String name) {
		super(name);

	}

	public Gato(String name, int age, String especies) {
		super(name, age, especies);
	}

	public Gato(String name, int age) {
		super(name, age, "Gato");
	}

	@Override
	public void emitirBarulho() {

		if (estaVivo) {
			System.out.println("Miado do gato");
		} else {
			System.out.println("O animal morreu");
		}

	}

}
