package projetoTriagem.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import projetoTriagem.model.Pessoa;
import projetoTriagem.service.PessoaService;
import projetoTriagem.service.TriagemService;


@Controller
public class TriagemController {

    @Autowired
    private PessoaService pacienteService;

    @Autowired 
    private TriagemService triagemService;

    @Autowired
    private EncaminhamentoService encaminhamentoService;

// O RedirectAttributes serve para enviar mensagens temporárias para a tela HTML
    @PostMapping("/salvarPaciente")
    public String receberDadosHtml(Pessoa paciente, RedirectAttributes attributes) {

        return "redirect:/cadastro";
    }
    
}


