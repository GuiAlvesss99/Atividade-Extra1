package JavaTech;

import java.util.Scanner;

public class atvif2 {
	public static void main(String[] args) {
		
		Scanner leia = new Scanner(System.in);

	
		System.out.println("Digite um número: ");
		int num = leia.nextInt();

		
		if (num % 2 == 0) {
			if (num >= 0) {
				System.out.println(num + " é positivo e par");
			} else {
				System.out.println(num + " é negativo e par");
			}
		} else {
			if (num >= 0) {
				System.out.println(num + " é positivo e ímpar");
			} else {
				System.out.println(num + " é negativo e ímpar");
			}
		}
	}
}
    
    
