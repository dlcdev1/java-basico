package br.com.consultorio.classes;

public class Dentista {
	private String nome;
	private String especialidade;
	private int registro;
	private boolean ativo;
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getEspecialidade() {
		return especialidade;
	}
	public void setEspecialidade(String especialidade) {
		this.especialidade = especialidade;
	}
	
	public int getRegistro() {
		return registro;
	}
	public void setRegistro(int registro) {
		this.registro = registro;
	}
	
	public boolean getAtivo() {
		return ativo;
	}
	public void setAtivo(boolean ativo) {
		this.ativo = ativo;
	}
	
	public Dentista(String nome, String especialidade, int registro, boolean ativo) {
		this.nome = nome;
		this.especialidade = especialidade;
		this.registro = registro;
		this.ativo = ativo;
	}
	
	
	public Dentista (String nome) {
		this.nome = nome;
	}
	
	
	
}
