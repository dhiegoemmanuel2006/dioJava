import java.util.Scanner;

public class App {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o número da conta: ");
    int numeroConta = sc.nextInt();

    System.out.println("Digite a agencia: ");
    String agencia = sc.next();

    System.out.println("Digite o nome do cliente: ");
    String nomeCliente = sc.next();

    System.out.println("Digite o saldo da conta");
    double saldoConta = sc.nextDouble();

    System.out.println("Conta criada com sucesso!" + "\nNúmero da conta: " + numeroConta
            + "Agência: " + agencia + "\nNome: " + nomeCliente + "\nSaldo: " + saldoConta
            );

    }
}