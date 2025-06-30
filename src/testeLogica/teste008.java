package testeLogica;

import java.util.Scanner;

public class teste008 {

    public static void main(String[] args) {
        
        //Descubra quantos dolares você terá, convertendo os reais que vc tem no bolso.

        Scanner sc = new Scanner(System.in);

        double reais, dolares;

        System.out.println("Quantos reais eu tenho ? R$");
        reais = sc.nextDouble();

        dolares = reais/5.49;
        System.out.printf("Eu tenho então: %.2f%n dolares.", dolares);



        sc.close();


    }

}
