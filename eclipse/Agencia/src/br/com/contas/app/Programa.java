package br.com.treinaweb.primeiroexercicio;

import br.com.contas.classes.ContaCorrente;
import br.com.contas.classes.Correntista;

public class Programa {

	public static void main(String[] args) {
		Correntista correntista = new Correntista();
		
		correntista.setNome("Carlos");
		correntista.setSobrenome("Silva");
		correntista.setIdade(33);
		correntista.setConta(1234556677);
		correntista.setConta(new ContaCorrenteGold(10000));
		
		
		ContaCorrente conta = correntista.getConta();
		conta.deposito(100);
		
		System.out.println(conta.getSaldo());
	}

}