import Classes.ConsultarConta;
import Classes.ConsultarSaldo;
import Classes.CriarConta;
import Classes.DepositSaque;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        CriarConta criarConta = new CriarConta();
        ConsultarSaldo consultarSaldo = new ConsultarSaldo();
        ConsultarConta consultarConta = new ConsultarConta();
        DepositSaque depositSaque = new DepositSaque();

        Scanner scanner = new Scanner(System.in);
        int opcao;

        do {
            System.out.println("\n(1) - Criar Conta");
            System.out.println("(2) - Consultar Saldo");
            System.out.println("(3) - Consultar Conta");
            System.out.println("(4) - Depositar / Sacar");
            System.out.println("(0) - Sair do Banco");

            System.out.print("Digite uma das opções: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    criarConta.criarConta();
                    break;
                case 2:
                    if (criarConta.getNome() == null) {
                        System.out.println("Nao existe contas");
                    } else {
                        consultarSaldo.consultsald();
                    }

                    break;
                case 3:
                    if (criarConta.getNome() == null) {
                        System.out.println("Nao existe contas");
                    } else {
                        consultarConta.consultConta(criarConta.getNome(), criarConta.getCpf(), consultarSaldo.getsaldo());
                    }
                    break;
                case 4:
                    int operacao;

                    if (criarConta.getNome() == null) {
                        System.out.println("Nao existe contas");
                    } else {
                        System.out.println("\n(1) - Depositar");
                        System.out.println("(2) - Sacar");
                        System.out.print("Escolha a operação: ");
                        operacao = scanner.nextInt();

                        if (operacao == 1) {
                            depositSaque.Deposito(consultarSaldo); // Chama a função de depósito
                        } else if (operacao == 2) {
                            depositSaque.Saque(consultarSaldo); // Chama a função de saque
                        } else {
                            System.out.println("Operação inválida. Tente novamente.");
                        }
                    }

                    break;
                case 0:
                    System.out.println("Saindo do Banco. Até mais!");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }

        } while (opcao != 0);

        scanner.close();
    }
}
