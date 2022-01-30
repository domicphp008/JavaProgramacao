
import java.util.Locale;
public class Main {

	public static void main(String[] args) {
		
		
			String nome = "José ";
			int idade = 34;
			double renda = 4000.0;
			double x = 10.34784;
			
			System.out.println(x);
			System.out.printf("%.1f%n", x);
			System.out.printf("%.2f%n", x);
			System.out.printf("%.3f%n", x);
			System.out.printf("%.4f%n", x);
			Locale.setDefault(Locale.US);
			System.out.printf("%.4f%n", x);
			
			System.out.println("Olá Mundo!");
			System.out.printf("RESULTADO = " + x + " METROS ");
			System.out.printf("RESULTADO = %2f metros%n", x);
			System.out.printf("%s tem %d anos e ganha R$ %.2f reais%n", nome, idade, renda);
	}

}