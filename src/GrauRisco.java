
public enum GrauRisco {

    VERMELHO(1),
    LARANJA(2),
    AMARELO(3),
    VERDE(4),
    AZUL(5);

    private final int prioridade;

    GrauRisco(int prioridade) {
        this.prioridade = prioridade;
    }


    public int getPrioridade() {
        return prioridade;
    }
}