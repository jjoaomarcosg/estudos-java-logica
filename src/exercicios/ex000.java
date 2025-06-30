package exercicios;

import java.util.Scanner;

public class ex000 {

    public static void main(String[] args) {

        /*
         * Fazer um programa para ler as medidas da largura e comprimento de um terreno
         * retangular com uma casa decimal,
         * bem como o valor do metro quadrado do terreno com duas casas decimais. Em
         * seguida, o programa deve mostrar o valor
         * da área do terreno, bem como o valor do preço do terreono, ambos com duas
         * casas decimais comforme o exemplo.
         */

        Scanner sc = new Scanner(System.in);

        double larg = sc.nextDouble();
        double comp = sc.nextDouble();
        double vmq = sc.nextDouble();

        double area = larg * comp;
        double preco = area * vmq;

        System.out.printf("ÁREA = %.2f%n", area);
        System.out.printf("PREÇO = %.2f%n", preco);

        sc.close();

    }

}
