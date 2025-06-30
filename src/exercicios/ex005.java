package exercicios;

import java.util.Scanner;

public class ex005 {

    public static void main(String[] args) {
        
        /*
         * Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
         * valor unitário de cada peça 1, o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
         * Calcule e mostre o valor a ser pago.
         */
    
    Scanner sc = new Scanner(System.in);

    int p1, q1, p2, q2;
    double v1, v2, total;

    p1 = sc.nextInt();
    q1 = sc.nextInt();
    v1 = sc.nextDouble();

    p2 = sc.nextInt();
    q2 = sc.nextInt();
    v2 = sc.nextDouble();

    total = q1 * v1 + q2 * v2;

    System.out.printf("VALOR A PAGAR: R$ %.2f%n", total);


    sc.close();


    }

}
