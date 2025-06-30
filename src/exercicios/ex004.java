package exercicios;

import java.util.Scanner;

public class ex004 {

    public static void main(String[] args) {
        /*
         * Fazer um programa que leia o número de um funcionário, seu número de horas
         * trabalhadas, o valor que recebe por hora e calcula o salário desse funcionário. A seguir, mostre o número e o
         * salário do funcionário, com duas casas decimais.
         */

        Scanner sc = new Scanner(System.in);

        int nf, nh;
        double vh, sl;

        nf = sc.nextInt();
        nh = sc.nextInt();
        vh = sc.nextDouble();

        sl = nh * vh;

        System.out.printf("NUMBER = %d%n", nf);
        System.out.printf("SALARY = US$ %.2f%n", sl);



        sc.close();


    }

}
