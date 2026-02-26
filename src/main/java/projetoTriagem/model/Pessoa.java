package projetoTriagem.model;


public class Pessoa {
	private String nome;
	private int age;
	private String dataNascimento;
	private String cpf;
	private String nSus;
	
	Pessoa() {
		
	}
	
	Pessoa(String nome, int age, String dataNascimento, String cpf, String nSus) {
		this.nome = nome;
		this.age = age;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.nSus = nSus;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
	
	public String getDataNascimento() {
		return dataNascimento;
	}
	
	public String getCpf() {
		return cpf;
	}
	
	public String getNSus() {
		return nSus;
	}
}