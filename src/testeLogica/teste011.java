package testeLogica;

import java.util.Scanner;

public class teste011 {

    public static void main(String[] args) {

        // PEGUEI UM EMPRESTIMO NO BANCO, CONSIDERANDO QUE TIVE 20% DE JUROS E TIVE QUE
        // PARCELAR,
        // ME DIGA O VALOR DAS PARCELAS

        Scanner sc = new Scanner(System.in);

        double emprestimo, totalComjuros, valorParcelas;
        int parcelas;

        System.out.print("Peguei um emprestimo de R$");
        emprestimo = sc.nextDouble();

        totalComjuros = emprestimo * 1.2; // Aplica 20% de juros: 100% + 20% = 120% → multiplica por 1.2

        System.out.println("Quer parcelar em quantas vezes ? ");
        parcelas = sc.nextInt();

        valorParcelas = totalComjuros / parcelas;

        System.out.printf("Parcelando em %d vezes, você vai pagar R$%.2f por parcela", parcelas, valorParcelas);

        sc.close();

    }

}
