package projetoTriagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;

import projetoTriagem.model.Pessoa;
import projetoTriagem.service.PessoaService;


@Controller
public class TriagemController {

    @Autowired
    private PessoaService pacienteService;

    @PostMapping("/salvarPaciente")
    public String receberDadosHtml(Pessoa paciente) {
        pacienteService.registroPaciente(paciente);

        return "redirect:/cadastro";
    }
    
    }


