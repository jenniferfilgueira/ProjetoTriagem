package projetoTriagem.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import projetoTriagem.model.Pessoa;

@Service
public class PessoaService {
    private final List<Pessoa> bancoPacientes = new ArrayList<>();

    public void registroPaciente(Pessoa paciente) {
        if (paciente.getCpf() != null) {
            bancoPacientes.add(paciente);
            System.out.println("Cadastro de paciente realizado com sucesso em nosso sistema! ");            System.out.println("Cadastro de paciente realizado com sucesso em nosso sistema! ");
            System.out.println("Nome Completo: " + paciente.getNome() + "\n" + "Cpf: " + paciente.getCpf() + "\n" + "Idade: " + paciente.getIdade() + "\n" + "Data de nascimento: " + paciente.getDataNascimento() + "\n" + "Número do cartão do Sus: " + paciente.getNSus());
        }
    }

    public List<Pessoa> listarPacientes() {
        return bancoPacientes;
    }
}