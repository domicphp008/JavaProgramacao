import java.util.Locale;
import java.util.Scanner;

public class lucro {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		double p = 0.0, valor = 0.0;

		System.out.print("Lucro (porcetagem): ");
		p = sc.nextDouble();

		System.out.print("Valor a ser calculado: ");
		valor = sc.nextDouble();
		
		double lucro = ((100 + p) / 100) * valor;

		System.out.println("Resultado:  " + lucro);

		sc.close();
	}

}
