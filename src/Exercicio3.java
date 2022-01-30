import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		double valor, valorfinal, desconto;
		System.out.println("Informe o valor do produto");
		valor = entrada.nextDouble();
		
		desconto = valor * 0.10;
		valorfinal = valor - desconto;
		
		System.out.println("O valor final é " + valorfinal);
	}

}
