import java.util.ArrayList;
import java.util.List;

public class FichaTriagem {
    private Paciente paciente;
    private Enfermeiro enfermeiro;
    private GrauRisco riscoReal;

    private List<Sintoma> sintomas;

    public FichaTriagem(Paciente paciente, Enfermeiro enfermeiro) {
        this.paciente = paciente;
        this.enfermeiro = enfermeiro;

        this.sintomas = new ArrayList<>();
    }

    public void adicionarSintomas(Sintoma sintoma) {
        this.sintomas.add(sintoma);
    }

    public GrauRisco processarTriagem() {
        int pontuacaoFinal = 0;

        for(Sintoma sintoma : sintomas) {
            pontuacaoFinal += sintoma.getPesoGravidade();
        }

        pontuacaoFinal +=paciente.calcularAgravanteRisco();

        if (pontuacaoFinal >= 10) {
            this.riscoReal = GrauRisco.VERMELHO;
        } else if (pontuacaoFinal >= 7 && pontuacaoFinal < 10) {
            this.riscoReal = GrauRisco.LARANJA;
        } else if (pontuacaoFinal >= 5  && pontuacaoFinal < 7) {
            this.riscoReal = GrauRisco.AMARELO;
        } else if (pontuacaoFinal >= 3 && pontuacaoFinal < 5) {
            this.riscoReal = GrauRisco.VERDE;
        } else if (pontuacaoFinal >= 1 && pontuacaoFinal < 3) {
            this.riscoReal = GrauRisco.AZUL;
        }
        
        return this.riscoReal;
    }

    public void gerarRelatorio(){

        System.out.println("--------- FICHA TRIAGEM ---------");
        System.out.println("---------------------------------");
        System.out.println("DADOS DO PACIENTE");
        System.out.println("NOME: " + paciente.getNome());
        System.out.println("CPF: " + paciente.getCpf());
        System.out.println("QUANTIDADE DE SINTOMAS: " + sintomas.size());
        System.out.println("ÁREA: " + (this.riscoReal != null ? this.riscoReal : "ERRO NO SISTEMA"));

        System.out.println("SINTOMAS RELATADOS: ");
        for (Sintoma s : sintomas) {
            System.out.println("- " + s.getDescricao() + " (Gravidade: " + s.getPesoGravidade() + ")");
        }

        System.out.print("----------------------------------");

        if (this.enfermeiro != null) {
            this.enfermeiro.assinarFicha();
        } else {
            System.out.print("Erro: nao ha nenhum enfermeiro responsavel associado a esta ficha");
        }
    }

    public Paciente getPaciente() {
        return paciente;
    }

    public Enfermeiro getEnfermeiro() {
        return enfermeiro;
    }

    public GrauRisco getRiscoReal() {
        return riscoReal;
    }

    public List<Sintoma> getSintomas() {
        return sintomas;
    }
}

