import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String nomeCliente;
        String agencia;
        int numeroConta;
        double saldo;

        System.out.print("Por favor, digite seu nome: ");
        nomeCliente = input.next();

        System.out.print("Insira o numero da agencia: (123-5) ");
        agencia = input.next();

        System.out.print("Insira numero da conta (1234) ");
        numeroConta = input.nextInt();

        System.out.print("Seu saldo inicial: ");
        saldo = input.nextDouble();

        System.out.println("Olá " +nomeCliente+ ", obrigado por criar uma conta em nosso banco, " +
                "sua agência é " + agencia + ", conta "
                + numeroConta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
