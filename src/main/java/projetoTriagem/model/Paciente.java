package projetoTriagem.model;


public class Paciente {
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nSus;
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return this.idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	
	public String getNSus() {
		return this.nSus;
	}

	public void setNSus(String nSus) {
		this.nSus = nSus;
	}
}