package JavaTech; 

import java.util.Scanner;

public class Atvif1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	int A, B , C ;
	int soma;
	
	Scanner leia= new Scanner(System.in);
	
	System.out.println("\nDigite o valor de A:");
	A = (int) leia.nextFloat();
	System.out.println("\nDigite o valor de B:");
	B = (int) leia.nextFloat(); 
	System.out.println("\nDigite o valor de C:");
	C = (int) leia.nextFloat();
	
	soma=A + B;
	
	if(soma>C) {
		System.out.println("\nA soma deu maior que C");
	}
	else if(soma<C) {
		System.out.println("\nA soma deu menor que C");
	}
	else {
		System.out.println("\nA soma deu igual a C");
	}
	}
}

