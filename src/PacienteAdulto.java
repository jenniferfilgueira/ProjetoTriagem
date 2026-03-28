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

}