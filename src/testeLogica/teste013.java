package testeLogica;

import java.util.Scanner;

public class teste013 {

    public static void main(String[] args) {

        // PAR OU ÍMPAR

        Scanner sc = new Scanner(System.in);

        int num;

        System.out.print("Digite um número: ");
        num = sc.nextInt();

        if (num % 2 == 0) {
            System.out.println("PAR");
        } else {
            System.out.println("ÍMPAR");
        }

        sc.close();

    }

}
