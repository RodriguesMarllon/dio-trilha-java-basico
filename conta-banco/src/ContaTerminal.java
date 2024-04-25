import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int numeroConta;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.print("Olá, por favor, digite o seu nome: ");
        nomeCliente = sc.nextLine();
        System.out.print("Agora digite o número da sua conta: ");
        numeroConta = sc.nextInt();
        sc.nextLine();
        System.out.print("Agora digite o número da Agência: ");
        agencia = sc.nextLine();
        System.out.print("Agora digite o saldo da sua conta: ");
        saldo = sc.nextDouble();
        sc.nextLine();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d, e seu saldo %.2f já está disponível para saque", nomeCliente, agencia, numeroConta, saldo);


        sc.close();

    }
}
