import java.util.InputMismatchException;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // TODO:Conhecer e importar a classe Scanner.
        Scanner scanner = new Scanner(System.in);

        try {

            // Exibir as mensagens para o nosso usuário.
            // Obter pela scanner os valores digitados no terminal.
            System.out.println("\n ----- Bem Vindo ao Banco X, vamos começar seu Cadastro ----- ");

            System.out.println("\n - Por favor, digite o número da Agência:");

            String agencia = scanner.next();
            scanner.nextLine();

            System.out.println("\n - Por favor, digite o número da Conta:");
            int conta = scanner.nextInt();
            scanner.nextLine();

            System.out.println("\n - Por favor, digite o nome do cliente:");
            String nomeCliente = scanner.nextLine();

            System.out.println(
                    "\n - Por favor, digite o saldo da conta: \n Use vírgula para as casas decimais. \n Exemplo R$150,48.\n");
            double saldo = scanner.nextDouble();

            scanner.nextLine();

            // Exibir a mensagem conta criada.
            System.out
                    .println(
                            "\n\nOlá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " +
                                    agencia + ", conta " + conta + " e seu saldo de R$" + saldo
                                    + " já está disponível para saque.\n");

        } catch (InputMismatchException e) {
            System.out.println(" Ops!, Evite usar Caracteres Especiais como: '' ; / ? .");
        }
    }
}
