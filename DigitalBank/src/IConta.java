
public interface IConta {
	
	void sacar(double valor) throws ParametrosInvalidosException;
	
	void depositar(double valor);
	
	void transferir(double valor, IConta contaDestino) throws ParametrosInvalidosException;
	
	void imprimirExtrato();
}
