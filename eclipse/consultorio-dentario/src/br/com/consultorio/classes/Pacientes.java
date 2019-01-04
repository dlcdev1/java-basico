package br.com.consultorio.classes;

public class Pacientes {
	private String nomePaciente;
	private int idade;
	private int dataConsulta;
	private String indicacao;
	private String disponibilidade;
	

	public String getNomePaciente() {
		return nomePaciente;
	}
	public void setNomePaciente(String nomePaciente) {
		this.nomePaciente = nomePaciente;
	}
	
	public int getIdade() {
		return idade;
	}
	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public int getDataConsulta() {
		return dataConsulta;
	}
	public void setDataConsulta(int dataConsulta) {
		this.dataConsulta = dataConsulta;
	}
	
	public String getIndicacao() {
		return indicacao;
	}
	public void setIndicacao(String indicacao) {
		this.indicacao = indicacao;
	}
	
	public String getDisponibilidade() {
		return disponibilidade;
	}
	
	public void setDisponibilidade(String disponibilidade) {
		this.disponibilidade = disponibilidade;
	}
	
	
	
	
	
}
