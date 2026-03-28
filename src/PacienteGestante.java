public class PacienteGestante extends Paciente{
    
    private int messesGestacao;

    public PacienteGestante(String nome, String cpf, int dataNascimento, int messesGestacao){
        super(nome, cpf, dataNascimento);
        this.messesGestacao = messesGestacao;
    }

    @Override
    public int calcularAgravanteRisco(){

        if(messesGestacao >= 7 && messesGestacao <= 9){
            return 2;
        } else if(messesGestacao <= 6 && messesGestacao >= 4){
            return 1;
        }else{
            return 0;
        }
    }
}
