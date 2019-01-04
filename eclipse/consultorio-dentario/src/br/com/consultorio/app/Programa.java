package br.com.consultorio.app;

import br.com.consultorio.classes.Dentista;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Dentista dentista = new Dentista("Paulo", "Cirurgião", 2101, true);
		dentista.getNome();
		dentista.getEspecialidade();
		dentista.getRegistro();
		dentista.getAtivo();
		
		/*this.nome = nome;
		this.especialidade = especialidade;
		this.registro = registro;
		this.ativo = ativo;
		*/

	}

}
