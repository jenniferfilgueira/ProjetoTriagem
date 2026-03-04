package projetoTriagem.service;

import org.springframework.stereotype.Service;

import projetoTriagem.model.Paciente;

import projetoTriagem.model.Triagem;

import projetoTriagem.model.Encaminhamento;

public class EncaminhamentoService {
    private Encaminhamento encaminhamento;

    public EncaminhamentoService(Encaminhamento encaminhamento) {
        this.encaminhamento = encaminhamento;
    }

    public void EncaminharAoMedico(Triagem triagem, Paciente paciente) {
        for (String sintoma : triagem.getSintomas()) {
            if (sintoma.equalsIgnoreCase("dor no peito")) {
                System.out.println("Paciente: " + paciente.getNome() + "\nCPF: " + paciente.getCpf() + "\nPrioridade: "
                        + triagem.getPrioridade());
                System.out.println("Você será encaminhado para um Cardiologista!");
            } else if (sintoma.equalsIgnoreCase("dor nas articulações") || sintoma.equalsIgnoreCase("fratura")) {
                System.out.println("Paciente: " + paciente.getNome() + "\nCPF: " + paciente.getCpf() + "\nPrioridade: "
                        + triagem.getPrioridade());
                System.out.println("Você será encaminhado para um Ortopedista!");
            } else {
                System.out.println("Paciente: " + paciente.getNome() + "\nCPF: " + paciente.getCpf() + "\nPrioridade: "
                        + triagem.getPrioridade());
                System.out.println("Você será encaminhado para um Clínico geral!");
            }
        }

    }
}