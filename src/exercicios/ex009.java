package exercicios;

import java.util.Scanner;

public class ex009 {

    public static void main(String[] args) {
        
        /*
         * Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem
         * "Sao Multiplos" ou "Nao sao
         * Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os
         * números devem poder ser digitados em
         * ordem crescente ou decrescente.
         */

         Scanner sc = new Scanner (System.in);
         
         int A, B;
         

         System.out.println("Digite dois números: ");
         A = sc.nextInt();   
         B = sc.nextInt();
         
         if (A % B == 0){
            System.out.println("SÃO MÚLTIPLOS");
         }
         else if (B % A == 0){
            System.out.println("SÃO MÚLTIPLOS");
         }
         else{
            System.out.println("NÃO SÃO MÚLTIPLOS");
         }
         


         sc.close();

    }

    /*
     * Verificar se dois números são múltiplos entre si:
     *
     * - Dois números são múltiplos se um divide o outro sem deixar resto.
     * - Ou seja, se o resto da divisão de A por B for 0, A é múltiplo de B.
     * - Também é necessário verificar o contrário: se o resto da divisão de B por A
     * for 0,
     * então B é múltiplo de A.
     * 
     * - Isso garante que a verificação funcione independentemente da ordem em que
     * os números
     * forem digitados (crescente ou decrescente).
     * 
     * - Estrutura de decisão:
     * Se A % B == 0 ou B % A == 0 → "São múltiplos"
     * Caso contrário → "Não são múltiplos"
     */


}
