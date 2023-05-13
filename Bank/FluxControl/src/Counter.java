import java.util.Scanner;

public class Counter {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parameterOne = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parameterTwo = terminal.nextInt();
		
		try {
			count(parameterOne, parameterTwo);
		
		}catch (ParametrosInvalidosException exception) {
			System.out.println("O segundo parâmetro deve ser maior que o primeiro");
		}
		finally {
			terminal.close();
		}
		
	}
	static void count(int parameterOne, int parameterTwo ) throws ParametrosInvalidosException {
		if (parameterTwo < parameterOne) throw new ParametrosInvalidosException();		
		
		int number = parameterTwo - parameterOne;

		for (int i = 0; i < number; i++) {
			System.out.println("Imprimindo o número " + i);
		}
	}
}

