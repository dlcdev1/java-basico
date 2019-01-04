package br.com.contas.classes;

public class ContaCorrenteFlex extends ContaCorrente {

	public ContaCorrenteFlex(double saldo) {
		super(saldo);
	}

	@Override
	public void deposito(double valor) {
		this.saldo = saldo + (2 * valor);
	}

}