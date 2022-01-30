package curso;

import java.util.Scanner;

class desc {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		double preco = 34.5;
		double desconto = (preco < 20.0 ? preco * 0.1 : preco * 0.05);
		double subtracao = preco - desconto;
		System.out.println(desconto);
		System.out.printf("O preço com desconto ficou agora : "  + subtracao);
		
		sc.close();
	}

}
// Tenary conditional expression.