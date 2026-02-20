package projetoTriagem.principal;


import projetoTriagem.model.Encaminhamento;
import projetoTriagem.model.Pessoa;
import projetoTriagem.model.Triagem;

public class Main {
	public static void main(String[] args) {
		Encaminhamento encaminhamento = new Encaminhamento();
		Triagem sintomas = new Triagem();
		Pessoa paciente = new Pessoa();
		paciente.registro();
		sintomas.regisSintom();
		paciente.confirmacao(sintomas);
		encaminhamento.sintomaS();
		
	}
}
