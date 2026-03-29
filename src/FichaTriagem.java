import java.util.ArrayList;
import java.util.List;

public class FichaTriagem {
    private Paciente paciente;
    private Enfermeiro enfermeiro;
    private GrauRisco riscoReal;
    private Medico medico;

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
        } else {
            System.out.println("Pontuacao invalida");
        }

        return this.riscoReal;
    }
}

