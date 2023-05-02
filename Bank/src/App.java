import java.util.Scanner;
import bankAccount.Account;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Olá! Qual seu nome?");
        String clienteName = scanner.nextLine();

        System.out.println("Por favor, digite o número da Agência !");
        String agency = scanner.nextLine();

        System.out.println("Agora, o número da conta:");
        Long number = scanner.nextLong();

        System.out.println("E o seu saldo:");
        Double balance = scanner.nextDouble();

        scanner.close();

        new Account(clienteName, agency, number, balance);
    }
}
