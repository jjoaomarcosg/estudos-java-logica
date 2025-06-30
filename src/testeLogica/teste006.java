package testeLogica;

import java.util.Scanner;

public class teste006 {

    public static void main(String[] args) {

        // FAÇA O SISTEMA DIZER SE O TRIANGULO É EQUILÁTERO OU ESCALENO

        Scanner sc = new Scanner(System.in);

        int L1, L2, L3;
        boolean EQ, ES, TRI; // define como booelano pra te retornar valores em true or false 

        System.out.println("Digite o primeiro lado: ");
        L1 = sc.nextInt();

        System.out.println("Digite o segundo lado: ");
        L2 = sc.nextInt();

        System.out.println("Digite o terceiro lado: ");
        L3 = sc.nextInt();

        TRI = (L1 < L2 + L3) && (L2 < L1 + L3) && (L3 < L1 + L2);
        EQ = (L1 == L2) && (L2 == L3);
        ES = (L1 != L2) && (L2 != L3) && (L3 != L1);

        System.out.println("Pode formar um triangulo ?  " + TRI);
        System.out.println("O triangulo é equilátero: " + EQ);
        System.out.println("O triangulo é escaleno: " + ES);

        sc.close();

    }

}
