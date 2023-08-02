package JavaTech;

import java.util.Scanner;
/*
 Logico E = &&
 
 entrada1   entrada2    saida 
 V          V            V
 V          F            F
 F          V            F
 F          F            F
 
 Logico OU = ||
 
 entrada1   entrada2    saida 
 V          V            V
 V          F            V
 F          V            V
 F          F            F
 */


public class Olamundo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String nome = "Guilherme Alves";
		int idade = 22;
		float altura = (float) 1.83,nota1,nota2,nota3,media;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("\nNome do participante: "+nome+"");
		System.out.println("\nIdade do participante: "+idade+" anos");
		System.out.println("\nAltura da participante: "+altura+" metro");
		
		System.out.println("\nEntre com a nota1: ");
		nota1 = leia.nextFloat();
		System.out.println("\nEntre com a nota2: ");
		nota2 = leia.nextFloat();
		System.out.println("\nEntre com a nota3: ");
		nota3 = leia.nextFloat();
		
		media = (nota1 + nota2 + nota3) /3;
		System.out.println("\nMédia Aritimética foi de: "+media);
		System.out.printf("\nMédia Aritimética foi de: %.2f",media);
		
		if(media>=7 && media<=10) {
			System.out.println("\nAluno aprovado");
		}
		else if(media>=5 && media<7) {
			System.out.println("\nAluno de exame");
		}
		else {
			System.out.println("\nAluno reprovado");
		}
	}
}	
