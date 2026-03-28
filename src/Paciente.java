public abstract class Paciente extends Pessoa {
    
    public Paciente(String nome, String cpf, int dataNascimento){
        super(nome, cpf, dataNascimento);
    }

    abstract int calcularAgravanteRisco();
//testeagain
}
