package projetoTriagem.model;

import java.util.Scanner;

public class Pessoa {
	Scanner scanner = new Scanner(System.in);
	private Triagem sintomas;
	private String nome;
	private int idade;
	private String dataNascimento;
	private String cpf;
	private String nSus;
	private Encaminhamento encaminhamento;
	
	Pessoa() {
		
	}
	
	Pessoa(Triagem sintomas, String nome, int idade, String dataNascimento, String cpf, String nSus, Encaminhamento encaminhamento) {
		this.sintomas = sintomas;
		this.nome = nome;
		this.idade = idade;
		this.dataNascimento = dataNascimento;
		this.cpf = cpf;
		this.nSus = nSus;
	}
	
	public Encaminhamento getEncaminhamento() {
		return encaminhamento;
	}
	
	public Triagem getSintoma() {
		return sintomas;
	}
	
	public String getNome() {
		return nome;
	}
	
	public int getIdade() {
		return idade;
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
	
	public void registro() {
		System.out.print("Insira seu nome completo: ");
		this.nome = scanner.nextLine();
		
		System.out.print("Insira a sua idade: ");
		this.idade = scanner.nextInt();
		
		System.out.print("Insira a sua data de Nascimento [DD/MM/AAAA]: ");
		this.dataNascimento = scanner.next();
				
		System.out.print("Insira seu CPF: ");
		this.cpf = scanner.next();
		
		System.out.print("Insira a numeração do seu cartão do SUS: ");
		this.nSus = scanner.next();
		
}
		
	public void confirmacao(Triagem sintomas) {
		System.out.println("\n=== INFORMAÇÕES DO PACIENTE ===");
		System.out.println("Nome do paciente: " + nome + "\n Data de Nascimento: " + dataNascimento + "\nIdade: " + idade +  "\nPeso: " + sintomas.getPeso() + "\nAltura: " + sintomas.getAltura() + "\nPressão Arterial: " + sintomas.getPressao());
		System.out.println("CPF: " + cpf + "\nnúmero do cartão do SUS: \n" + nSus);

	}
}