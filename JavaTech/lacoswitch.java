package JavaTech;

import java.util.Scanner;

public class lacoswitch {

    public static void main(String[] args) {
        // TODO Auto-generated method stub

        int resposta;

        Scanner ler = new Scanner(System.in);

        System.out.println("\n\t\tMenu de elogios");
        System.out.println("\n1-Pessoal é incrivel");
        System.out.println("\n2-Pessoal é gentil");
        System.out.println("\n3-Pessoal é Top de linha");
        System.out.println("\n4-Pessoal é prestativo");
        System.out.println("\nDigite sua opção: ");
        resposta =ler.nextInt();

        switch(resposta) {
        case 1:
            System.out.println("\nPessoal é incrivel");
        break;
        case 2:
            System.out.println("\nPessoal é gentil");
        break;
        case 3:
            System.out.println("\nPessoal é Top de linha");
        break;
        case 4:
            System.out.println("\nPessoal é prestativo");
        break;  //break serve para finalizar o case 
        default:        //Se não tiver opção usamos o default 
            System.out.println("Opção invalida");

        }

    }

}
