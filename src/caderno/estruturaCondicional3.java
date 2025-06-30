package caderno;

import java.util.Scanner;

public class estruturaCondicional3 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int hora;

        System.out.println("Quantas horas ? ");
        hora = sc.nextInt();

        if (hora < 12) {
            System.out.println("Bom dia");
        } 
        else if (hora < 18) {
            System.out.println("Boa tarde");
        } 
        else {
            System.out.println("Boa noite");
        }

        sc.close();

    }

}

/*
 * Etapas:
 * 1 - Importamos a classe Scanner para ler dados do teclado.
 * 2 - Definimos a variável hora como um inteiro.
 * 3 - Usamos o método System.out.println() para solicitar ao usuário que
 * informe a hora.
 * 4 - Usamos o método nextInt() da classe Scanner para ler um número inteiro do
 * teclado e armazenar na variável hora.
 * 5 - Usamos a estrutura condicional if para verificar se a hora é menor que
 * 12.
 * 6 - Se for menor que 12, imprime "Bom dia".
 * 7 - Se não for menor que 12, usamos outra estrutura condicional if para
 * verificar se a hora é menor que 18 através de else.
 * 8 - Se for menor que 18, imprime "Boa tarde".
 * 9 - Se não for menor que 18, imprime "Boa noite".
 */