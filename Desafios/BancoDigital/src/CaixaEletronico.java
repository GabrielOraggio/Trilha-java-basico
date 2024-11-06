import java.util.Scanner;

public class CaixaEletronico {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcao;

        Cliente cliente = new Cliente();
        cliente.setNome("Venilton");

        ContaCorrente cc = new ContaCorrente(cliente);
        ContaPoupanca poupanca = new ContaPoupanca(cliente);

        do {
            System.out.println("\n=== Menu de Opções: ===");
            System.out.println("1 - Saque");
            System.out.println("2 - Deposito");
            System.out.println("3 - Transferencia");
            System.out.println("4 - Ver Extrato");
            System.out.println("0 - Sair");
            System.out.print("Escolha uma opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                System.out.print("Digite o valor para sacar: ");
                double valor = scanner.nextDouble();
                cc.sacar(valor);
                break;

                case 2:
                    System.out.print("Digite o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    cc.depositar(valorDeposito);
                    break;

                case 3:
                    System.out.print("Digite o valor para Transferir: ");
                    double valorTransferir = scanner.nextDouble();
                    cc.transferir(valorTransferir, poupanca);
                    break;

                case 4:
                    cc.imprimirExtrato();
                break;

                case 0:
                    System.out.println("Saindo...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 0);

        scanner.close();
    }
}