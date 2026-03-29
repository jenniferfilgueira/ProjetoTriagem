import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class SistemaTriagemApp {

    Scanner scanner = new Scanner(System.in);
    private List<FichaTriagem> filaAtendimento;

    public void iniciarAtendimento() {
        System.out.println(
                "Ola, sejam bem-vindos ao APP de triagem / atendimento e encaminhando oficial do Hospital KJJ.\nIremos agora iniciar o seu atendimento: ");

    }

    public void exibirMenuPrincipal() {
        System.out.println("Menu principal: ");
    }

    public void cadastrarEnfermeiro(Enfermeiro enfermeiro) {
        System.out.println("Sobre o(a) enfermeiro(a): \nNome: ");
        enfermeiro.nome = scanner.nextLine();
        System.out.println("CPF: ");
        enfermeiro.cpf = scanner.nextLine();
        System.out.println("Data de nascimento: ");
        enfermeiro.dataNascimento = scanner.nextInt();
        System.out.println("Registro conselho: ");
        enfermeiro.registroConselho = scanner.nextLine();
    }

    public void cadastrarPaciente(Paciente paciente) {
        System.out.println("Sobre o(a) paciente: \nNome: ");
        paciente.nome = scanner.nextLine();
        System.out.println("CPF: ");
        paciente.cpf = scanner.nextLine();
        System.out.println("Data de nascimento: ");
        paciente.dataNascimento = scanner.nextInt();
    }

    public void realizarNovaTriagem(Enfermeiro enf, Paciente pac) {

    }

}