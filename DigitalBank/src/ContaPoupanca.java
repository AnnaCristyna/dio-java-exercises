
public class ContaPoupanca extends Conta {
	protected double taxaRendimento;

	public ContaPoupanca(Cliente cliente, double taxaRendimento) {
		super(cliente);
        this.taxaRendimento = taxaRendimento;
	}

	public double getTaxaRendimento() {
        return taxaRendimento;
    }

	@Override
	public void imprimirExtrato() {
		System.out.println("=== Extrato Conta Poupan�a ===");
		super.imprimirInfosComuns();
	}

	public double calcularRendimento() {
		double rendimento = saldo * taxaRendimento;
		return rendimento;
	}

	public void adicionarRendimento(double rendimento) {
		saldo = saldo + rendimento;
	}
}
