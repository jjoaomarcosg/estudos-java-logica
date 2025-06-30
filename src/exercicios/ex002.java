package exercicios;

import java.util.Scanner;

public class ex002 {

    public static void main(String[] args) {
        
        /*
         * Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
         * valor da área deste círculo com quatro
         * casas decimais conforme exemplos.
         * Fórmula da área: area = π . raio2
         * Considere o valor de π = 3.14159
         */

        Scanner sc = new Scanner (System.in);

        double a, r, pi = 3.14159;

        r = sc.nextDouble();

        a = pi * r * r;

        System.out.printf("A = %.4f%n", a);


        sc.close();


    }


}
