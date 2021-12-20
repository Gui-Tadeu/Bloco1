package Introducao;

import java.util.Scanner;

public class RepeticaoEx2 {
	public static void main(String[] args) {
		int x, n;
		x = 0;
		for (x = 0; x <= 10; x++) {
			Scanner ler = new Scanner(System.in);
			System.out.println("Informe um número: ");
			n = ler.nextInt();
			if (n % 2 == 0) {
				System.out.println("Numero é Par");
			}

			else if (n % 2 == 1) {
				System.out.println("Numero é Impar");
			}
		}
	}
}
