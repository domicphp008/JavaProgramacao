
import java.util.Scanner;

public class hora {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hora;

		System.out.println("Quantas horas?");
		hora = sc.nextInt();

		if (hora < 12) {

			System.out.println("Bom dia");
		} else if (hora < 19) {
			System.out.println("Boa tarde");
		} 
		else {
			System.out.println("Boa noite");
		}

			sc.close();
		}

	}

//class 35 - Conditional structure chaining
