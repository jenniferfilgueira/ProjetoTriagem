import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
public class SistemaTriagemApp {

    Scanner scanner = new Scanner(System.in);
    private List<FichaTriagem> filaAtendimento;
    private Enfermeiro enfermeiroLogado;
    private Paciente pacienteAtual;
    private Medico medicoAtual;

    public void iniciar() {
        this.filaAtendimento = new ArrayList<>();
        int opcao = -1;

        while (opcao != 0) {
            exibirMenuPrincipal();
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();
            scanner.nextLine();

            switch (opcao) {
                case 1:
                    this.enfermeiroLogado = cadastrarEnfermeiro();
                    System.out.println("Enfermeiro " + enfermeiroLogado.getNome() + " pronto para trabalhar!");
                    break;
                case 2:
                    this.medicoAtual = cadastrarMedico();
                    System.out.println("Médico(a) " + medicoAtual.getNome() + " está de plantão.");
                    break;

                case 3:
                    this.pacienteAtual = cadastrarPaciente();
                    System.out.println("Paciente " + pacienteAtual.getNome() + " aguardando triagem.");
                    break;

                case 4:
                    if (enfermeiroLogado == null) {
                        System.out.println("ERRO: Cadastre um Enfermeiro primeiro (Opção 1)!");
                    } else if (pacienteAtual == null) {
                        System.out.println("ERRO: Cadastre um Paciente primeiro (Opção 3)!");
                    } else {
                        realizarNovaTriagem(enfermeiroLogado, pacienteAtual);
                        this.pacienteAtual = null; 
                    }
                    break;
                case 5:
                    realizarAtendimentoMedico();
                    break;
                case 0:
                    System.out.println("Saindo...");
                    break;
                default:
                    System.out.println("Opção inválida!");
            }
        }
    }

    public void exibirMenuPrincipal() {
        System.out.println("============== SISTEMA DE TRIAGEM =========");
        System.out.println("1 - Cadastrar Enfermeiro");
        System.out.println("2 - Cadastrar Médico");
        System.out.println("3 - Cadastrar Paciente");
        System.out.println("4 - Realizar Triagem");
        System.out.println("5 - Atendimento Médico");
        System.out.println("0 - Sair");
        System.out.println("===========================================\n");
    }

    public Enfermeiro cadastrarEnfermeiro() {
        System.out.println("----- CADASTRAR ENFERMEIRO -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data Nascimento: ");
        int data = scanner.nextInt();
        scanner.nextLine();
        System.out.print("COREM: ");
        String corem = scanner.nextLine();
        System.out.println("----------------------\n");

        return new Enfermeiro(nome, cpf, data, corem);
    }

    public Medico cadastrarMedico(){
        System.out.println("----- CADASTRAR Médico -----");
        System.out.print("Nome: ");
        String nome = scanner.nextLine();
        System.out.print("CPF: ");
        String cpf = scanner.nextLine();
        System.out.print("Data Nascimento: ");
        int data = scanner.nextInt();
        scanner.nextLine();
        System.out.print("CRM: ");
        String crm = scanner.nextLine();
        System.out.println("----------------------\n");

        return new Medico(nome, cpf, data, crm);
    }

    public Paciente cadastrarPaciente() {
    System.out.println("------ CADASTRO DE PACIENTE -------");
    System.out.print("Nome: ");
    String nome = scanner.nextLine();
    System.out.print("CPF: ");
    String cpf = scanner.nextLine();
    System.out.print("Ano de Nascimento: ");
    int ano = scanner.nextInt();
    scanner.nextLine();
    System.out.print("A paciente é gestante? (SIM/NAO): ");
    String resposta = scanner.nextLine();

    Paciente novoPaciente = null;

    if (resposta.equalsIgnoreCase("SIM")) {
        System.out.print("Meses de gestação: ");
        int meses = scanner.nextInt();
        scanner.nextLine();
        novoPaciente = new PacienteGestante(nome, cpf, ano, meses);
    } else {
        novoPaciente = new PacienteAdulto(nome, cpf, ano);
    }

    return novoPaciente;
}

    public void realizarNovaTriagem(Enfermeiro enfermeiro, Paciente paciente) {

        System.out.println("======== INICIANDO TRIAGEM ========");
        System.out.println("Olá " + paciente.getNome());
        System.out.println("Eu sou(a): " + enfermeiro.getNome() + " enfermeiro(a) responsável pela sua triagem");
        System.out.println("");

        FichaTriagem ficha = new FichaTriagem(paciente, enfermeiro);

        String continuar = "SIM";
        while (continuar.equalsIgnoreCase("SIM")) {
            System.out.print("Por favor. Qual o sintoma que você está sentindo: ");
            String descricao = scanner.nextLine();
            
            System.out.print("Peso da gravidade deste sintoma (1 a 5): ");
            int peso = scanner.nextInt();
            scanner.nextLine();

            Sintoma novoSintoma = new Sintoma(descricao, peso);
            ficha.adicionarSintomas(novoSintoma);

            System.out.print("Deseja adicionar outro sintoma? (SIM/NAO): ");
            continuar = scanner.nextLine();
        }
        
        ficha.processarTriagem();

        System.out.println("-----------------------------------------");
        ficha.gerarRelatorio();
        System.out.println("-----------------------------------------");

        this.filaAtendimento.add(ficha);
        
        System.out.println("\nTriagem concluída! Paciente enviado para a fila.");

    }
    public void realizarAtendimentoMedico() {
        if (filaAtendimento.isEmpty()) {
            System.out.println("Fila vazia!");
            return;
        }

        FichaTriagem ficha = filaAtendimento.remove(0);
        this.medicoAtual.avaliarFicha(ficha);
        this.medicoAtual.encaminharPaciente(ficha);
    }
}