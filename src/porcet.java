

import java.util.Scanner;

public class porcet {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double p = 0.0, valor = 0.0;

		System.out.print("Desconto (porcetagem): ");
		p = sc.nextDouble();

		System.out.print("Valor a ser decontado: ");
		valor = sc.nextDouble();
		
		double desconto = (100 - p / 100) * valor;

		System.out.println("Resultado:  " + desconto);

		sc.close();
	}

}
