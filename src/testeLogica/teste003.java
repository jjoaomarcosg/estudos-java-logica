package testeLogica;

import java.util.Scanner;

public class teste003 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String nome;

        System.out.println("Digite seu nome: ");
        nome = sc.nextLine();

        System.out.printf("Muito prazer %s\n", nome);

        sc.close();

    }

}
