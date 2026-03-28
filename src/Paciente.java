<<<<<<< HEAD
public abstract class Paciente extends Pessoa {
    
    public Paciente(String nome, String cpf, int dataNascimento){
        super(nome, cpf, dataNascimento);
    }

    abstract int calcularAgravanteRisco();
//testeagain
=======
public abstract class Paciente extends ProfissionalSaude {
    
    public Paciente(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);
    }

    abstract int calcularAgravanteRisco();
    
>>>>>>> a525f76a083ace9ce54a0c1302eee927dc9c1e8e
}
