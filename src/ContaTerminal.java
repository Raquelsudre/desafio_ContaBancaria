import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, insira as seguintes informações ");

        System.out.print("Digite seu Nome ");
        String nome = scanner.next();

        System.out.print("Digite sua Agencia ");
        String agencia = scanner.next();

        System.out.print("Digite sua Conta ");
        int conta = scanner.nextInt();

        System.out.print("Digite seu Saldo ");
        double saldo = scanner.nextDouble();

        scanner.close();

        System.out.println("Olá " + nome + ", obrigada por criar uma conta com nosso banco, sua Agência é " + agencia
                + ", conta " + conta + " e seu saldo " + saldo + " já está disponivel para saque.");

    }
}