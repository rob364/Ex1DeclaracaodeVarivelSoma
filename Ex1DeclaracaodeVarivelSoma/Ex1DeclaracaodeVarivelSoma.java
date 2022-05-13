import java.util.Locale;
import java.util.Scanner;

public class Ex1DeclaracaodeVarivelSoma {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c; 
		System.out.println("Digite o valor 10");
		a = sc.nextInt();
		System.out.println("Digite o valor 30");
		b = sc.nextInt();
		c = a + b;
		
		System.out.println("SOMA = "+ c);
		
		sc.close();
		
	}

}
