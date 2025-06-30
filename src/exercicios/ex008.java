package exercicios;

import java.util.Scanner;

public class ex008 {

    public static void main(String[] args) {
    
        /*
         * Fazer um programa para ler um número inteiro e dizer se este número é par ou
         * ímpar.
         */


         Scanner sc = new Scanner (System.in);

         int num;

         System.out.print("Digite um número: ");
         num = sc.nextInt();

        if (num % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("ÍMPAR");
        }

         sc.close();

    }

    /*
     * Para identificar se um número é par ou ímpar:
     * - Usamos a operação de resto da divisão (%).
     * - Dividimos o número por 2.
     * - Se o resto for 0, o número é par.
     * - Se o resto for diferente de 0 (normalmente 1), o número é ímpar.
     * 
     * Exemplo de condição:
     * if (num % 2 == 0) {
     * // número par
     * } else {
     * // número ímpar
     * }
     * 
     * A base do cálculo é sempre 2, porque a definição de paridade depende da
     * divisão por 2.
     */

}
