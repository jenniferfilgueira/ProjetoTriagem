public class Medico extends ProfissionalSaude {
    public Medico(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);  
    }

    public void avaliarFicha(FichaTriagem ficha) {
        System.out.println("\n");
        System.out.println("────────────────────────────────────────────");
        System.out.println("             AVALIAÇÃO MÉDICA               ");
        System.out.println("────────────────────────────────────────────");
        System.out.println("Dr(a)." + this.getNome());
        System.out.println("CRM: " + this.getRegistroConselho());
        System.out.println("Está avaliando a ficha de: " + ficha.getPaciente().getNome());
        System.out.println("────────────────────────────────────────────");
    }

    public void encaminharPaciente(FichaTriagem ficha) {
        GrauRisco risco = ficha.getRiscoReal();

        System.out.println("\n");
        System.out.println("────────────────────────────────────────────");
        System.out.println("              DECISÃO MÉDICA FINAL          ");
        System.out.println("────────────────────────────────────────────");

        if(risco == GrauRisco.VERMELHO || risco == GrauRisco.LARANJA) {
            System.out.println("[!] STATUS: ATENDIMENTO CRÍTICO");
            System.out.println("PACIENTE EM RISCO: " + risco);
            System.out.println("DESTINO:  ALA EMERGENCIAL (Transferência Imediata)");
            System.out.println("OBSERVAÇÃO:  Monitoramento contínuo obrigatório.");
        } else {
            System.out.println("[ ok ] STATUS: ATENDIMENTO AMBULATORIAL");
            System.out.println("PACIENTE EM RISCO: " + risco);
            System.out.println("DESTINO:  LIBERADO / CONSULTÓRIO");
        }
        System.out.println("────────────────────────────────────────────");
    }

}
