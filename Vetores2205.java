package dia2205;
import java.util.Scanner;
public class Vetores2205 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		int soma = 0;
		int numero [] = new int [5];
		for (int i = 0; i < 5; i++) {
			System.out.println("informe o numero" + i + "..");
			numero [i] = ler.nextInt();	
			soma = soma + numero[i];
		}
		if (soma > 30) {
			System.out.println("resultado da soma(+30): "+ soma);
		}
		else {
			System.out.println("resultado menor que 30"+ soma );
		}

		}

	}
