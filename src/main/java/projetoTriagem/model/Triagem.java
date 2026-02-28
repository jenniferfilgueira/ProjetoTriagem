package projetoTriagem.model;

import java.time.LocalDateTime;
import java.util.List;

public class Triagem {
    private LocalDateTime dataHora;
    private boolean sinaisVitais;
    private int prioridade;
    private List<String> sintoma;
    private double temperatura;
    private int nivelDeDor;
    private Long id;

    private static Long contador = 0L;

    private Pessoa pessoa;

    public Triagem(Pessoa pessoa, LocalDateTime dataHora, boolean sinaisVitais, int prioridade, List<String> sintoma,
            double temperatua, int nivelDeDor) {
        this.id = ++contador;
        this.pessoa = pessoa;
        this.dataHora = dataHora;
        this.sinaisVitais = sinaisVitais;
        this.prioridade = prioridade;
        this.sintoma = sintoma;
        this.nivelDeDor = nivelDeDor;
        this.temperatura = temperatura;
    }

    public Long getId() {
        return id;
    }

    public LocalDateTime getDataHora() {
        return this.dataHora;
    }

    public boolean isSinaisVitais() {
        return this.sisVitais;
    }

    public void setSinaisVitais(boolean sinaisVitais) {
        this.sinaisVitais = sinaisVitais;
    }

    public int getPrioridade() {
        return this.prioridade;
    }

    public void setPrioridade(int prioridade) {
        this.prioridade = prioridade;
    }

    public List<String> getSintomas() {
        return this.sintomas;
    }

    public void setSintomas(List<String> sintomas) {
        this.sintomas = sintomas;
    }

    public double getTemperatura() {
        return this.temperatura;
    }

    public void setTemperatura(double temperatura) {
        this.temperatura = temperatura;
    }

    public int getNivelDeDor() {
        return this.nivelDeDor;
    }

    public void setNivelDeDor(int nivelDeDor) {
        this.nivelDeDor = nivelDeDor;
    }

    public Pessoa getPessoa() {
        return this.pessoa;
    }

    @Override
    public String toString() {
        return """
                ===== TRIAGEM =====
                ID: %d
                Data/Hora: %s
                Sinais Vitais: %d
                Prioridade: %d
                Temperatura: %.1f°C
                Nível de Dor: %d
                Sintomas: %s
                Pessoa: %s
                ====================
                """.formatted(id, dataHora, sinaisVitais, prioridade, temperatura, nivelDeDor, sintomas, pessoa);
    }

}
