import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        int numeroConta;
        String agencia = "";
        String nomeCliente = "";
        double saldo;
        //TODO: Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in);
                
        //Exibir as mensagens para o nosso usuário
        System.out.println("Por favor, digite o número da Conta !");
        //Obter pela scanner os valores digitados no terminal
        numeroConta = scanner.nextInt();

        System.out.println("Por favor, digite o número da Agencia !");
        agencia = scanner.next();

        System.out.println("Por favor, digite seu Nome !");
        //Obter pela scanner os valores digitados no terminal
        nomeCliente = scanner.next();

        System.out.println("Por favor, digite seu Saldo !");
        //Obter pela scanner os valores digitados no terminal
        saldo = scanner.nextDouble();

        //Exibir a mensagem de conta criada
        System.out.println("Olá " + nomeCliente +", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");

    }
}
