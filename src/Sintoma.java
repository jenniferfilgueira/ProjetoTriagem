public class Sintoma {

    private String descricao;
    private int pesoGravidade;

    public Sintoma() {

    }

    public Sintoma(String descricao, int pesoGravidade) {
        this.descricao = descricao;
        this.pesoGravidade = pesoGravidade;
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPesoGravidade() {
        return pesoGravidade;
    }

}

