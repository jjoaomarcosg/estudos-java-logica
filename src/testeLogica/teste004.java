package testeLogica;

import java.util.Scanner;

public class teste004 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        int n1, n2, soma;

        System.out.println("Digite dois números:");
        n1 = sc.nextInt();
        n2 = sc.nextInt();

        soma = n1 + n2;

        System.out.printf("A soma entre %d e %d é %d", n1, n2, soma);
        
        sc.close();

    }

}
