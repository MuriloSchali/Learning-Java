
public class Main {

    public static void main(String[] args) {

        Cliente cliente = new Cliente();
        cliente.setNome("Veniltom");

        Conta cc = new ContaCorrente(cliente);
        Conta poupanca = new ContaPoupanca(cliente);

        cc.depositar(100);
        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();

        System.out.println("\n\n");
        Cliente cliente1 = new Cliente();
        cliente1.setNome("Murilo");
        Conta c2 = new ContaCorrente(cliente1);

    }

}