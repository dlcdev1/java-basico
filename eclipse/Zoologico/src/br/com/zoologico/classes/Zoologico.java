package br.com.zoologico.classes;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
	private String name;
	private List<Animal> animais;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Zoologico() {
		animais = new ArrayList<Animal>();
	}
	public void adicionarAnimal(Animal animalASerAdicionado) {
		animais.add(animalASerAdicionado);
	}
	public void removerAnimal(int indiceDoAnimal) {
		animais.remove(indiceDoAnimal);
	}
	public void listarAnimais() {
		System.out.println("Animais do zoológico; ");
		for (var i = 0; i < animais.size(); i++) {
			System.out.println("    -" + animais.get(i).getName());			
		}
	}

}
