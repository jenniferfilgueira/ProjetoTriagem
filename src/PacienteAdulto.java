<<<<<<< HEAD
public class PacienteAdulto extends Paciente {
    
    public PacienteAdulto(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento, registroConselho);
    }

    @Override
    public int calcularAgravanteRisco(){
        if(2026 - this.dataNascimento >= 65){
            return 2;
        }else if(2026 - this.dataNascimento >= 50){
            return 1;
        }else{
            return 0;
        }
    }
//testeGitHub
//teste
//testeagain
=======
public class PacienteAdulto {
    
>>>>>>> a525f76a083ace9ce54a0c1302eee927dc9c1e8e
}