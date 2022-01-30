package curso;

import java.util.Locale;
import java.util.Scanner;

class Main {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int mask = 0b100000;
		int n = sc.nextInt();
		
		if ((n & mask) != 0 ) {
			
			System.out.println("6th bit is true!");
		}
		else {
			System.out.println("6th bit is false");
		}
		
		
		sc.close();
	}

}