public class Medico extends ProfissionalSaude {
    public Medico(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);  
    }
    public void encaminhamentoEmergencia(FichaTriagem ficha) {
        System.out.println("ALERTA DE PRIORIDADE - ENCAMINHAMENTO EMERGENCIAL");
        System.out.println("---------------------------------");
        System.out.println("Paciente: " + ficha.getPaciente().getNome());
        System.out.println("Grau de Risco: " + ficha.getRiscoReal());
        System.out.println("Médico Solicitante: Dr(a)." + this.getNome() +  "CRM: " + this.getRegistroConselho());
        System.out.println(">> Ação: O paciente foi transferido IMEDIATAMENTE para a ala de urgência.");
        System.out.println("---------------------------------");

        this.avaliarFicha();
    }

    public void encaminhamentoMedico(FichaTriagem ficha) {
        System.out.println("ENCAMINHAMENTO AMBULATORIAL");
        System.out.println("---------------------------------");
        System.out.println("Paciente: " + ficha.getPaciente().getNome());
        System.out.println("Médico Solicitante: Dr(a)." + this.getNome() +  "CRM: " + this.getRegistroConselho());
        System.out.println(">> Ação: O paciente foi avaliado. Receituário emitido e paciente recebeu alta.");
        System.out.println("---------------------------------");

        this.avaliarFicha();
    }  

    public void avaliarFicha() {
        System.out.println("Assinatura eletrônica do médico responsável:");
        System.out.println("---------------------------------");
        System.out.println("Médico(a): " + this.getNome());
        System.out.println("CRM: " + this.getRegistroConselho());
        System.out.println("---------------------------------");
    }
}
