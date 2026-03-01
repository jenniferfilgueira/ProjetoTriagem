package projetoTriagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import projetoTriagem.model.Paciente;
import projetoTriagem.service.PacienteService;
import projetoTriagem.service.TriagemService;


@Controller
public class TriagemController {

    @Autowired
    private PacienteService pacienteService;

    @Autowired 
    private TriagemService triagemService;

    @Autowired
    private EncaminhamentoService encaminhamentoService;

// O RedirectAttributes serve para enviar mensagens temporárias para a tela HTML
    @PostMapping("/salvarPaciente")
    public String receberDadosHtml(Paciente paciente, RedirectAttributes attributes) {

        return "redirect:/cadastro";
    }
    
}


