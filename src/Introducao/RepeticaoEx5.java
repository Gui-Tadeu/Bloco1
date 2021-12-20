package Introducao;

import java.util.Scanner;

public class RepeticaoEx5 {

	public static void main(String[] args) {
		int x,soma;
		x=0;
		soma=0;
		Scanner ler = new Scanner (System.in);
		System.out.println("Para finalizar o programa digite:'0'.");
		do {
			System.out.println("Informe um numero: ");
			x = ler.nextInt();
			soma = (soma + x);
		}
		while (x != 0);
		System.out.println("A soma das entradas é: "+soma);
	}
	
}
