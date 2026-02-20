package projetoTriagem.model;

import java.util.Map;
import java.util.List;
import java.util.Scanner;

public class Encaminhamento {
	private Pessoa paciente;
	private Triagem sintomas;
	
	public Pessoa getPaciente() {
		return paciente;
	}
	
	public Triagem getSintoma() {
		return sintomas;
	}
	
	Scanner scanner = new Scanner(System.in);
	public static final Map<String, List<String>>SINTOMAS_POR_ESPECIALISTA = Map.of("Ginecologista", List.of("Corrimento", "menstruação irregular", "Cólica"),
			"Clínico Geral", List.of("Febre", "Dor de cabeça", "Fadiga", "Tosse cheia", "entupimento nasal"),
			"Cardiologista", List.of("Queimação no peito", "Dor na região esquerda do corpo", "Náuseas", "cansaço", "coração acelerado"),
			"Urologista", List.of("Pedra nos rins", "Infecção urinária"),
			"Ortopedista", List.of("Torção", "Fratura óssea"),
			"Dermatologista", List.of("Manchas na pele", "verrugas", "espinhas em excesso", "queda de cabelo"),
			"Traumatologista", List.of("Trauma", "acidente"),
			"Obstetra", List.of("Gravidez"),
			"Psicólogo", List.of("Ansiedade", "Depressão"),
			"Neurologista", List.of("AVC", "Convulsão"));
	
	public static final Map<String, Integer>AREA_URGENCIA = Map.of(
			"Clínico Geral", 1,
			"Cardiologista", 4,
			"Urologista", 3,
			"Ortopedista", 4,
			"Dermatologista", 2,
			"Traumatologista", 4,
			"Obstetra", 3,
			"Psicólogo",3,
			"Neurologista",4	
		);
	
	public void sintomaS() {
		System.out.print("\n");
		System.out.print("Insira os sintomas: ");
		String sintomaDigitado = scanner.nextLine();
		
	    String[] listaSintomas = sintomaDigitado.split("[,;]+");
	    
	    for(String sintoma: listaSintomas) {
	    	sintoma = sintoma.trim();
			boolean encontrado = false;

		
			for(Map.Entry<String, List<String>>entry:
				Encaminhamento.SINTOMAS_POR_ESPECIALISTA.entrySet()) {
				String especialidade = entry.getKey();
				List<String> sintomas = entry.getValue();
			
			
				if(sintomas.stream().anyMatch(s -> s.equalsIgnoreCase(sintomaDigitado))) {
					int area = Encaminhamento.AREA_URGENCIA.get(especialidade);
						System.out.println("-> Especialista para a área determinada: "+ especialidade);
						System.out.println("Área de urgência: " + area);
						encontrado = true;
						break;
			}
		}
		
		if(!encontrado) {
			System.out.println("Sintoma escrito não se encontra em nosso banco.");
		}
	   }
		scanner.close();
		
	}
}


