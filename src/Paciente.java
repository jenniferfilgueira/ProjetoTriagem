public abstract class Paciente extends ProfissionalSaude {
    
    public Paciente(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);
    }

    abstract int calcularAgravanteRisco();
    
}
