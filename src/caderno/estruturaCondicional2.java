package caderno;

import java.util.Scanner;

public class estruturaCondicional2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int hora;

        System.out.println("Quantas horas ?");
        hora = sc.nextInt(); // usamos pq a variavel está denominada como int.

        if (hora < 12) {
            System.out.println("Bom dia");
        } else {
            System.out.println("Boa tarde");
        }
        sc.close();
    }

    /*
     * Explicação:
     * 1 - importamos a classe Scanner que é usada para ler dados do teclado.
     * 2 - definimos a variavel hora como um inteiro.
     * 3 - usamos o método System.out.println() para solicitar ao usuário que
     * informe a hora.
     * 4 - usamos o método nextInt() da classe Scanner para ler um número inteiro do
     * teclado e armazenar na variável hora.
     * 5 - usamos a estrutura condicional if para verificar se a hora é menor que
     * 12.
     * 6 - se for menor que 12, imprime "Bom dia", caso contrário, imprime
     * "Boa tarde".
     */

}
