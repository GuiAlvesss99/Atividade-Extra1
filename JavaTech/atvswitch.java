package JavaTech;
import java.util.Scanner;
public class atvswitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        
		String[] produtos = {"Cachorro Quente","X-Salada","X-Bacon","Bauru","Refrigerante","Suco de laranja"};
	
		Scanner ler = new Scanner(System.in);
		
		System.out.println("\n\t\tDigite o codigo do item (1 a 6):");
	    int codigo1= ler.nextInt();
		float preco= (float) 0.0;
		String produto = "";
		
    switch(codigo1) {
    case 1:
    	produto= "Cachorro quente";
    	preco= (float) 10.00;
    	break;
    	
    case 2:
    	produto= "X-salada";
    	preco= (float) 15.00;
    	break;
    	
    case 3:
    	produto= "X-bacon";
    	preco= (float) 18.00;
    	break;
    	
    case 4:
    	produto= "Bauru";
    	preco= (float) 12.00;
    	break;
    	
    case 5:
    	produto= "Refrigerante";
    	preco= (float) 8.00;
    	break;
    	
    case 6:
    	produto= "Suco de laranja";
    	preco= (float) 13.00;
    	break;
    	
    	default:
    		System.out.println("Codigo inexistente de produto!");
    		
    		System.out.println("Informe a quantidade comprada");
    		int quantidade = ler.nextInt();
    		
    		float valorTotal = preco * quantidade;
    		
    		System.out.println("Produto"+produto);
    		System.out.println("Valor total da conta: R$"+valorTotal);
    }
	
		
	}

}
