
public enum GrauRisco {

    VERMELHO(5),
    LARANJA(4),
    AMARELO(3),
    VERDE(2),
    AZUL(1);

    private final int prioridade;

    GrauRisco(int prioridade) {
        this.prioridade = prioridade;
    }

    public void definirPrioridade() {

    }

    public int getPrioridade() {
        return prioridade;
    }
}