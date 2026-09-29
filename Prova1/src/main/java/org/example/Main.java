import org.example.empresa.Funcionario;
import org.example.empresa.Desenvolvedor;
import org.example.empresa.Gerente;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("=== Sistema de Folha de Pagamento TechSolutions ===");
        System.out.println("\n--- Novo Cadastro ---");

        try {
            System.out.print("Nome: ");
            String nome = scanner.nextLine();

            String cpf;

            do {
                System.out.print("CPF (mínimo 11 caracteres): ");
                cpf = scanner.nextLine();

                if (cpf.length() < 11) {
                    System.out.println("Erro: O CPF digitado é inválido. Tente novamente.\n");
                }
            } while (cpf.length() < 11);

            System.out.print("Salário Base: R$ ");
            double salarioBase = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Cargo (1 - Desenvolvedor | 2 - Gerente): ");
            int opcao = scanner.nextInt();
            scanner.nextLine();

            if (opcao == 1) {
                System.out.print("Nível (JUNIOR, PLENO, SENIOR): ");
                String nivel = scanner.nextLine();

                Desenvolvedor dev = new Desenvolvedor(nome, cpf, salarioBase, nivel);
                System.out.println("\nDesenvolvedor cadastrado com sucesso!");
                dev.exibirDados();

            } else if (opcao == 2) {
                System.out.print("Bônus Mensal: R$ ");
                double bonus = scanner.nextDouble();

                Gerente gerente = new Gerente(nome, cpf, salarioBase, bonus);
                System.out.println("\nGerente cadastrado com sucesso!");
                gerente.exibirDados();

            } else {
                System.out.println("\nOpção inválida! Cadastro cancelado.");
            }

        } catch (Exception e) {
            System.out.println("\nErro: Entrada de dados inválida.");
            System.out.println("Certifique-se de digitar números corretamente (tente usar vírgula para decimais).");

        } finally {
            scanner.close();
            System.out.println("\nSistema encerrado.");
        }
    }
}