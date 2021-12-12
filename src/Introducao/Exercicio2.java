package Introducao;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) 
		{
			float Dia,Mes,Ano,DiaA;
			Scanner ler = new Scanner (System.in);
			System.out.println("Qual sua idade em dias?\n");
			DiaA = ler.nextInt(); 
			Ano= (DiaA/365);
			System.out.println("Sua idade em anos é:");
			System.out.println(Ano);
			Mes= (DiaA/30);
			System.out.println("Sua idade em meses é:");
			System.out.println(Mes);
			
			
			
		}
	

}
