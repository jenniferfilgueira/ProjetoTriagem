package projetoTriagem.service;

import java.util.List;
import java.util.Set;

import projetoTriagem.model.Triagem;

public class TriagemService {
    private Triagem triagem;

//construtor:
    public TriagemService(Triagem triagem){
        this.triagem = triagem;
    }

//lista de tratamentos de sintomas:
    private final Set<String> sintomasValidos = Set.of(
        "febre","dor de cabeça",
        "dor de barriga",
        "dor de garganta",
        "vomito",
        "dor no peito",
        "falta de ar",
        "desmaio",
        "convulsão",
        "hemorragia",
        "dor nas articulações",
        "hematomas",
        "dificuldade de locomocao",
        "dor desviado",
        "manchas vermelhas",
        "alergia",
        "picada",
        "fratura",
        "amputação"
    );
//lista de prioridade de sintomas VERMELHO:
    private final Set<String> vermelho = Set.of(
        "convulsão",
        "hemorragia",
        "amputação",
        "desmaio",
        "falta de ar",
        "dor no peito"
    );
//lista de prioridade de sintomas LARANJA:
    private final Set<String> laranja = Set.of(
        "fratura",
        "vomito",
        "dificuldade de locomocao",
        "alergia"
    );
//lista de prioridade de sintomas AMARELO:
    private final Set<String> amarelo = Set.of(
        "febre",
        "dor de barriga",
        "dor de garganta",
        "manchas vermelhas",
        "hematomas"
    );
//lista de prioridade de sintomas VERDE:
    private final Set<String> verde = Set.of(
        "dor de cabeça",
        "dor nas articulações",
        "picada",
        "dor desviado"
    );

//metodo com instancias de todos os metodos de validação instanciados:
    public void validarDadosTriagem(projetoTriagem.model.Triagem triagem){
        validarNivelDeDor(triagem.getNivelDeDor());
        validarTemperatura(triagem.getTemperatura());
        validarSintoma(triagem.getSintomas());
    }

//metofos de validação de dados:
    public boolean validarTemperatura(double temperatura){
        if (temperatura < 32 || temperatura > 43){
            System.out.println("Temperatura invalida");
            return false;
        }
        return true;
    }
    public boolean validarNivelDeDor(int nivelDeDor){
        if (nivelDeDor < 0 || nivelDeDor > 10){
            System.out.println("Nivel de Dor invalido");
            return false;
        }
        return true;
    }
    public boolean validarSintoma(List<String> sintomaList){
        boolean valido = true;
        if (sintomaList == null || sintomaList.isEmpty()){
            System.out.println("Lista de sintomas não pode estar vazia.");
            return false;
        }
        for (String sintoma : sintomaList) {
            if (sintoma == null || sintoma.isBlank()) {
                System.out.println("Sintoma não pode ser vazio.");
                valido = false;
                continue;
            }
            String sintomaFormatado = sintoma.trim().toLowerCase();
            if (!sintomasValidos.contains(sintomaFormatado)) {
                System.out.println("Sintoma inválido: " + sintoma);
                valido = false;
            }
        }
        return valido;
    }
    
//metodo / ação princial da class - prioridade:
    public String classificarPrioridade(Triagem triagem){
        List<String> sintomas = triagem.getSintomas();
        double temperatura = triagem.getTemperatura();
        int dor = triagem.getNivelDeDor();

        if (sintomas == null || sintomas.isEmpty()){
            return "Sem sintomas informados";
        }
        int prioridade = 0;

        for (String sintoma : sintomas){
            String formatado = sintoma.trim().toLowerCase();
            if (vermelho.contains(formatado) || temperatura >= 40 || dor >= 9){
                prioridade = 4;
            }
            else if (laranja.contains(formatado) || temperatura >= 38.5 || dor >= 7){
                if (prioridade < 3) prioridade = 3;
            }
            else if (amarelo.contains(formatado) || temperatura >= 37.5 || dor >= 4){
                if (prioridade < 2) prioridade = 2;
            }
            else if (verde.contains(formatado)){
                if (prioridade < 1) prioridade = 1;
            }
        }
        return switch (prioridade) {
            case 4 -> "VERMELHO";
            case 3 -> "LARANJA";
            case 2 -> "AMARELO";
            case 1 -> "VERDE";
            default -> "Não classificado";
        };
    }
    
//ficha tecnica da triagem;
    public void fichaTriagem(Triagem triagem){
        String prioridade = classificarPrioridade(triagem);

        System.out.println("====================================");
        System.out.println("        FICHA DE TRIAGEM");
        System.out.println("====================================");
        System.out.println("ID: " + triagem.getId());
        System.out.println("Nome: " + triagem.getPessoa());
        System.out.println("Temperatura: " + triagem.getTemperatura() + " °C");
        System.out.println("Nível de Dor: " + triagem.getNivelDeDor());
        System.out.println("Sintomas: " + String.join(", ", triagem.getSintomas()));
        System.out.println("------------------------------------");
        System.out.println("PRIORIDADE: " + prioridade);
        System.out.println("====================================");
    }
}
