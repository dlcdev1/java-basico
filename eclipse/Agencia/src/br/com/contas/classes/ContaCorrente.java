package br.com.contas.classes;

public abstract class ContaCorrente {
	private int  agencia;
	private int nConta;
	protected double saldo;
	
	public ContaCorrente(double saldo2) {
		// TODO Auto-generated constructor stub
	}

	public void ContaCorrent(double saldo) {
		this.saldo = saldo;
	}
	
	public int getAgencia() {
		return agencia;
	}
	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}
	public int getnConta() {
		return nConta;
	}
	public void setnConta(int nConta) {
		this.nConta = nConta;
	}
	public double getSaldo() {
		return saldo;
	}
	protected void setSaldo(double saldo) {
		this.saldo = saldo;
	}
	public void saque(double valor) {
		this.saldo = saldo - valor;
	}
	public abstract void deposito (double valor);
}

