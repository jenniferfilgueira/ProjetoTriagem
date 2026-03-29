import java.util.Scanner;

public class Sintoma {

    private String descricao;
    private int pesoGravidade;

    Sintoma() {

    }

    Sintoma(String descricao, int pesoGravidade) {
        this.descricao = descricao;
        this.pesoGravidade = pesoGravidade;
    }

    public void preencher(Scanner sc) {
        System.out.println("Nos informe os sintomas que esta sentindo: ");
        descricao = sc.nextLine();
    }

    public String getDescricao() {
        return descricao;
    }

    public int getPesoGravidade() {
        return pesoGravidade;
    }

}
