package br.com.zoologico.classes;

public abstract class Animal implements Animavel{
	// private visibility attributes
	private String name;
	private String especies;
	protected int age;
	protected boolean estaVivo;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEspecies() {
		return especies;
	}

	public void setEspecies(String especies) {
		this.especies = especies;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public Boolean estaVivo() {
		return estaVivo;
	}

	public Animal(String name, int age, String especies) {
		this.name = name;
		this.age = age;
		this.especies = especies;
		this.estaVivo = true;
	}

	public Animal(String name) {
		this.name = name;
		this.estaVivo = true;
	}

	// behavior
	public abstract void emitirBarulho();

	public Boolean ehAdulto() {
		if (estaVivo) {
			return age >= 1;
		} else {
			return false;
		}

	}

	public final void morrer() {
		this.estaVivo = false;
	}

	public Boolean heAdulto() {
		// TODO Auto-generated method stub
		return null;
	}
}
