package projetoTriagem;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import projetoTriagem.model.Pessoa;


@Controller
public class TriagemController {

    @GetMapping("/cadastro")
    public String cadastro() {
        return "cadastro";
    }

    @PostMapping ("/salvarPaciente")
    public String receberDadoHTML(Pessoa paciente) {
        System.out.println("Nome do paciente: " + paciente.getNome());
        System.out.println("Idade do paciente: " + paciente.getIdade());
        System.out.println("CPF do paciente: " + paciente.getCPF());

        return "redirect:/cadastro";
        }
    }

