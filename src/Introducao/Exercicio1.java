package Introducao;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String args []) 
	{
			int Dia,Mes,Ano,DiaA,MesA,AnoA,IdadeDias;
			Scanner ler = new Scanner (System.in);
			System.out.println("Dia em que nasceu:");
			Dia = ler.nextInt();
			System.out.println("Mes em que nasceu:");
			Mes = ler.nextInt();
			System.out.println("Ano em que nasceu:");
			Ano = ler.nextInt();
			System.out.println("Dia de hoje:");
			DiaA = ler.nextInt();
			System.out.println("Em qual mes estamos:");
			MesA = ler.nextInt();
			System.out.println("em qual ano estamos:");
			AnoA = ler.nextInt();
		    IdadeDias = (((AnoA)-Ano)*365)+(((MesA-1)-Mes)*30)+(30-Dia)+DiaA;
		    System.out.println ("A idade desta pessoa em dias é:");
		    System.out.println (IdadeDias);
				
		
	}

	

}
