package br.com.contas.classes;

public class Correntista {
	private String nome;
	private String sobrenome;
	private int idade;
	private int cpf;
	private int conta;
	
	public String getNome() {
		return nome;
	}
	public void setNome1(String nome) {
		this.nome = nome;
	}
	public String getSobrenome() {
		return sobrenome;
	}
	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public ContaCorrente getConta() {
		return getConta();
	}
	public void setConta(int i) {
		this.conta = i;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void saque(double valor){
		conta.saque(valor);
	}
	
	public void deposito(double valor){
		conta.deposito(valor);
	}
	
	public double saldo(){
		return conta.getSaldo();
	}
}
	
	
