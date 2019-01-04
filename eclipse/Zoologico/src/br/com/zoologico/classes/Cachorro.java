//herença

package br.com.zoologico.classes;

public class Cachorro extends Animal {

	public Cachorro(String name) {
		super(name);
	}

	public Cachorro(String name, int age, String especies) {
		super(name, age, especies);
	}

	public Cachorro(String name, int age) {
		super(name, age, "Cachorro");
	}

	@Override
	public void emitirBarulho() {
		if (estaVivo) {
			System.out.println("Latido do cachorro");
		} else {
			System.out.println("O animal morreu");
		}

	}
	
	@Override
	public Boolean heAdulto() {
		if(estaVivo) {
			return age >= 2;
		} else {
			return false;
		}
	}

}