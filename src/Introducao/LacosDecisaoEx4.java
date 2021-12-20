package Introducao;

import java.util.Scanner;

public class LacosDecisaoEx4 {

	public static void main(String[] args) {
		int x;
		double n,quad;
		x = 0;
		quad=0;
		for (x = 0; x < 1; x++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Informe um número: ");
			n = ler.nextInt();
			if (n % 2 == 0) {
				System.out.println("Numero é Par");
				System.out.println("A raiz quadrada é: "+Math.sqrt(n));
			}

			else if (n % 2 == 1) {
				System.out.println("Numero é Impar");
				quad=(n*n);
				System.out.println("O quadrado é: "+quad);
			}
		}
	}

}
