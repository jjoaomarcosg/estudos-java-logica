package exercicios;

import java.util.Scanner;

public class ex007 {

    public static void main(String[] args) {

        /*
         * Ex007: Fazer um programa para ler um número inteiro, e depois dizer se este
         * número é negativo ou não.
         */

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num < 0){
            System.out.println("NEGATIVO");
        }
        else {
            System.out.println("POSITIVO");
        }    
        

        sc.close();

    }

}
