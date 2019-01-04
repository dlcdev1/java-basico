package br.com.zoologicoo.app;

import br.com.zoologico.classes.Animal;
import br.com.zoologico.classes.Cachorro;
import br.com.zoologico.classes.Gato;
import br.com.zoologico.classes.Veterinario;
import br.com.zoologico.classes.Zoologico;

public class Programa {

	public static void main(String[] args) {
		Animal animal = new Cachorro("Totô", 2);
		

		System.out.println("Olá, seu animal é " + animal.getEspecies() + ", o nome é:" + animal.getName()
				+ ", a idade é: " + animal.getAge() + "Anos");
		

		if (animal.ehAdulto()) {
			System.out.println("Animal adulto");
		} else {
			System.out.println("Animal não é adulto");
		}
		

		System.out.println("=================");
		System.out.println("Barulho do cachorro: ");
		animal.emitirBarulho();
		
		Zoologico zoo = new Zoologico();
		
		zoo.setName("Zoo treinarWeb");
		zoo.adicionarAnimal(animal);
		
		Animal animal2 = new Gato ("zé", 3);
		zoo.adicionarAnimal(animal2);
		
		System.out.println("Animais do zoologico " + zoo.getName());
		zoo.listarAnimais();
		
		Veterinario vet = new Veterinario();
		vet.setNome("TreinaWeb");
		vet.atenderAnimal(animal);
		vet.listarAnimaisAtendidos();
		
	}

}
