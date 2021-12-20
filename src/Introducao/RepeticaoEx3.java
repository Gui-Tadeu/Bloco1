package Introducao;

import java.util.Scanner;

public class RepeticaoEx3{
	public static void main(String[] args) 
	{
	int idade,jovem,velho;
	jovem = 0;
	velho = 0;
	Scanner ler = new Scanner(System.in);
	System.out.println("Para finalizar o programa digite:'-99'.");
	do {
	System.out.print("Informe a idade: ");
	idade = ler.nextInt();
	if (idade < 21) {
		jovem = (jovem+1);
	}
	if (idade > 50) {
		velho = (velho+1);
	}
		
	}
	while (idade != -99); {
		
	}
	
	jovem = (jovem-1);
	System.out.println("Pessoas com menos de 21 anos: "+jovem);
	System.out.println("Pessoas com mais de 50 anos: "+velho);
	System.out.println("Fim do programa.");
	}	
}
	
