import java.util.ArrayList;
import java.util.Scanner;
public class Tarefas {
    private ArrayList<String> listaTarefas;

    public Tarefas() {
        this.listaTarefas = new ArrayList<>();
    }

    public void adicionarTarefa(String tarefa) {
        listaTarefas.add(tarefa);
    }

    public void exibirTarefas() {
        System.out.println("Lista de Tarefas:");
        for (int i = 0; i < listaTarefas.size(); i++) {
            System.out.println((i + 1) + ". " + listaTarefas.get(i));
        }
    }

    public static void main(String[] args) {
        Tarefas tarefas = new Tarefas();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem-vindo à Lista de Tarefas!");

        while (true) {
            System.out.println("\nOpções:");
            System.out.println("1. Adicionar Tarefa");
            System.out.println("2. Exibir Tarefas");
            System.out.println("3. Sair");

            System.out.print("Escolha uma opção: ");
            int opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("Digite a nova tarefa: ");
                    scanner.nextLine(); // Limpar o buffer do scanner
                    String novaTarefa = scanner.nextLine();
                    tarefas.adicionarTarefa(novaTarefa);
                    break;
                case 2:
                    tarefas.exibirTarefas();
                    break;
                case 3:
                    System.out.println("Saindo... Até logo!");
                    System.exit(0);
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }
    }
}
