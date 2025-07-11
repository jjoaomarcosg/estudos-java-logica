package exercicios;

import java.util.Scanner;

public class ex006 {

    public static void main(String[] args) {
        /*
         * Fazer um programa que leia três valores com ponto flutuante de dupla
         * precisão: A, B e C. Em seguida, calcule e
         * mostre:
         * a) a área do triângulo retângulo que tem A por base e C por altura.
         * b) a área do círculo de raio C. (pi = 3.14159)
         * c) a área do trapézio que tem A e B por bases e C por altura.
         * d) a área do quadrado que tem lado B.
         * e) a área do retângulo que tem lados A e B.
         */

        Scanner sc = new Scanner(System.in);

        double A, B, C;

        A = sc.nextDouble();
        B = sc.nextDouble();
        C = sc.nextDouble();

        double at = (A * C) / 2;
        double ac = (3.14159 * C * C);
        double atp = (A + B) * C / 2;
        double aq =  B * B;
        double ar = A * B;

        System.out.printf("TRIANGULO: %.3f%n", at);
        System.out.printf("CIRCULO: %.3f%n", ac);
        System.out.printf("TRAPEZIO: %.3f%n", atp);
        System.out.printf("QUADRADO: %.3f%n", aq);
        System.out.printf("RETANGULO: %.3f%n", ar);
        


        sc.close();

    }


}
