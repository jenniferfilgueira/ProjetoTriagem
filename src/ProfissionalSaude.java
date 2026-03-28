public abstract class ProfissionalSaude extends Pessoa{

    protected String registroConselho;

    public ProfissionalSaude(String nome, String cpf, int dataNascimento, String registroConselho){
        super(nome, cpf, dataNascimento);
        this.registroConselho = registroConselho;
    }

    public String getRegistroConselho() {
        return registroConselho;
    }

    public void setRegistroConselho(String registroConselho) {
        this.registroConselho = registroConselho;
    }
}