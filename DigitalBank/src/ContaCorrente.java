import java.util.Scanner;

public class ContaCorrente extends Conta {
	protected double limiteChequeEspecial;

	public ContaCorrente(Cliente cliente, double limiteChequeEspecial) {
		super(cliente);
		this.limiteChequeEspecial = limiteChequeEspecial;
	}

	public double getLimiteChequeEspecial() {
        return limiteChequeEspecial;
    }

	@Override
	public void imprimirExtrato() {
		super.imprimirInfosComuns();
	}

	@Override
	public void sacar (double valor) throws ParametrosInvalidosException {
		double totalDisponivel = saldo + limiteChequeEspecial;
		if (valor > totalDisponivel) throw new ParametrosInvalidosException();
		
		boolean atingirLimite = false;
		if (valor > saldo && valor <= totalDisponivel) {
			atingirLimite = avisarOverflowLimite();
		}

		if (!atingirLimite) throw new ParametrosInvalidosException();
		
		saldo -= valor;
	}

	protected boolean avisarOverflowLimite() {
		Scanner terminal = new Scanner(System.in);
		System.out.println("O valor ultrapassa o saldo. Deseja continuar?");
		boolean atingirLimite = terminal.nextBoolean();

		terminal.close();
		return atingirLimite;
	}	
}
