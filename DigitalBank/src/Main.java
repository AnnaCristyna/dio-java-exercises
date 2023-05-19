
public class Main {

	public static void main(String[] args) {
		Cliente venilton = new Cliente();
		venilton.setNome("Venilton");

		
		ContaCorrente corrente = new ContaCorrente(venilton, 4000);
		ContaPoupanca poupanca = new ContaPoupanca(venilton, 1.1);
		
		corrente.depositar(100);
		
		Menu menu = new Menu(corrente, poupanca);
        try {
			menu.exibir();
		} catch (ParametrosInvalidosException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
