public class Medico extends ProfissionalSaude {
    public Medico(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);  
    }

    public void avaliarFicha(FichaTriagem ficha) {
        System.out.println("\n---AVALIAÇÃO MÉDICA---");
        System.out.println("O(a) Dr(a)." + this.getNome() + "(CRM: " + this.getRegistroConselho() + ") está avaliando a ficha de " + ficha.getPaciente().getNome());
        
    }

    public void encaminharPaciente(FichaTriagem ficha) {
        GrauRisco risco = ficha.getRiscoReal();

        System.out.println("\nDECISÃO DO MÉDICO:");

        if(risco == GrauRisco.VERMELHO || risco == GrauRisco.LARANJA) {
            System.out.println("ALERTA DE ATENDIMENTO - ENCAMINHAMENTO URGENTE PARA A ALA EMERGENCIAL");

            System.out.println("Risco do Paciente: " + risco);
            System.out.println("Ação executada: O paciente foi transferido com urgência para a ala emergencial.");
        } else {
            System.out.println("ENCAMINHAMENTO AMBULATORIAL");
            System.out.println("Risco do paciente: " + risco);
            System.out.println("Ação: Paciente avaliado no consultório. Receituário emitido e paciente liberado.");
        }
        System.out.print("----------------------");
    }
}
