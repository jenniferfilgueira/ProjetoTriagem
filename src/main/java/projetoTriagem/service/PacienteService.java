package projetoTriagem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import projetoTriagem.model.Paciente;

@Service
public class PacienteService {
    private final List<Paciente> bancoPacientes = new ArrayList<>();

    public void registroPaciente(Paciente paciente) {
        if (paciente.getNome() == null || paciente.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome completo do paciente é obrigatório! ");
        }

        if (paciente.getCpf() == null || paciente.getCpf().length() != 11) {
            throw new IllegalArgumentException("CPF inválido. ");
        }

        if (paciente.getIdade() < 0 || paciente.getIdade() > 130) {
            throw new IllegalArgumentException("Idade inválida. ");
        }

        if (paciente.getNome() == null || paciente.getNome().trim().isEmpty()) {
            throw new IllegalArgumentException("O nome completo do paciente é obrigatório! ");
        }

        if (paciente.getDataNascimento() == null || paciente.getDataNascimento().trim().isEmpty()) {
            throw new IllegalArgumentException("A data de nascimento do paciente é obrigatório! ");
        }

        if (paciente.getDataNascimento().length() != 10) {
            throw new IllegalArgumentException("Erro na digitação. A data de nascimento deve estar no formato: DD/MM/AAAA ");
        }

        if (paciente.getNSus() == null || !paciente.getNSus().matches("\\d{15}")) {
            throw new IllegalArgumentException("Número do cartão do SUS inválido. ");
        }

        bancoPacientes.add(paciente);

        System.out.println("Cadastro validado e realizado com sucesso em nosso sistema!");
        System.out.println("Nome Completo: " + paciente.getNome() + "\n" + "CPF: " + paciente.getCpf() + "\n" + "Idade: " + paciente.getIdade() + "\n" + "Data de nascimento: " + paciente.getDataNascimento() + "\n" + "Número do cartão do Sus: " + paciente.getNSus());
        }

        public List<Paciente> listarPacientes() {
        return bancoPacientes;
        
        }
    }

