package projetoTriagem.model;

import java.util.Scanner;

public class Triagem {
	Scanner scanner = new Scanner(System.in);
	private Pessoa paciente;
	private float pressao;
	private float altura;
	private float peso;
	private String deficiencia;
	private Encaminhamento encaminhamento;
	
	
	Triagem () {
		
	}
	
	Triagem(Pessoa paciente, float pressao, float altura, float peso, String deficiencia, Encaminhamento encaminhamento) {
		this.paciente = paciente;
		this.pressao = pressao;
		this.altura = altura;
		this.deficiencia = deficiencia;
		this.encaminhamento = encaminhamento;
	}
	
	public void regisSintom() {
		System.out.print("Insira a sua pressão arterial: ");
		this.pressao = scanner.nextFloat();
		
		System.out.print("Insira a sua altura: ");
		this.altura = scanner.nextFloat();
		
		System.out.print("Insira o seu peso atual: ");
		this.peso = scanner.nextFloat();
		
	}
	public float getPressao() {
		return pressao;
	}
	
	public float getAltura() {
		return altura;
	}
	
	public float getPeso() {
		return peso;
	}
	
	public Pessoa getPaciente() {
		return paciente;
	}
	public String deficiencia() {
		return deficiencia;
	}
	
	public Encaminhamento getEncaminhamento() {
		return encaminhamento;
	}
}

