import java.util.Scanner;

public class Menu {
    private Scanner scanner;
    private ContaCorrente contaCorrente;
    private ContaPoupanca contaPoupanca;
    public Banco banco;

    enum MenuOptions {
        PRINT_CORRENTE("Imprimir extrato conta corrente"),
        PRINT_POUPANCA("Imprimir extrato conta poupança"),
        DEPOSIT("Realizar depósito"),
        SAQUE("Realizar saque"),
        TRANSFER("Realizar transferência"),
        RENDIMENTO("Calcular rendimento (Conta Poupança)"),
        SAIR("Sair");
        
        private final String description;
        
        MenuOptions(String description) {
            this.description = description;
        }
        
        public String getDescription() {
            return description;
        }
    }
    
    public Menu(ContaCorrente corrente, ContaPoupanca poupanca) {
        contaCorrente = corrente;
        contaPoupanca = poupanca;
    }

    public void exibir() throws ParametrosInvalidosException {
        scanner = new Scanner(System.in);

        int opcao;

        do {
            exibirOpcoes();
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:
                    System.out.print("O extrato da sua conta corrente é: ");
                    contaCorrente.imprimirExtrato();
                    break;
                case 2:
                    System.out.println("O extrato da sua conta poupanca é: ");
		            contaPoupanca.imprimirExtrato();
                    break;
                case 3:
                    System.out.print("Informe o valor para depositar: ");
                    double valorDeposito = scanner.nextDouble();
                    contaCorrente.depositar(valorDeposito);
                    System.out.println("Depósito realizado com sucesso.");
                    break;
                case 4:
                    System.out.print("Informe o valor para sacar: ");
                    double valorSaque = scanner.nextDouble();
                    contaCorrente.sacar(valorSaque);
                    break;
                case 5:
                    System.out.print("Informe o valor para transferir: ");
                    double valorTransferencia = scanner.nextDouble();
                    System.out.print("Informe o número da conta de destino: ");
                    int numeroContaDestino = scanner.nextInt();
                    Conta contaDestino = banco.encontrarConta(numeroContaDestino);

                    if (contaDestino != null) {
                        contaCorrente.transferir(valorTransferencia, contaDestino);
                        System.out.println("Transferência realizada com sucesso.");
                    } else {
                        System.out.println("Conta de destino não encontrada.");
                    }
                    break;
                case 6:
                    contaPoupanca.calcularRendimento();
                    System.out.println("Rendimento calculado com sucesso.");
                    break;
                case 7:
                    System.out.println("Encerrando o programa...");
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
                    break;
            }
        } while (opcao != 5);

        scanner.close();
    }

    private void exibirOpcoes() {
        System.out.println("=== MENU ===");
        int num = 1;
        for (MenuOptions option : MenuOptions.values()) {
            System.out.println(num + " - " + option.getDescription());
            num ++;
        }
        System.out.print("Escolha uma opção: ");
    }
}
