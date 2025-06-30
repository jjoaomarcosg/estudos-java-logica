package exercicios;

import java.util.Scanner;

public class ex010 {

    public static void main(String[] args) {
        
        /*
         * Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do
         * jogo, sabendo que o mesmo pode
         * começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e
         * máxima de 24 horas.
         */

        Scanner sc = new Scanner(System.in);
        
        int hi, hf, duracao, duracao2;
        
        System.out.println("Digite a hora inicial e final do jogo:");
        hi = sc.nextInt();
        hf = sc.nextInt();

        duracao = hf - hi;
        duracao2 = (24 - hi) + hf;

        if (hf == hi) {
            System.out.println("O JOGO DUROU 24h");
        }
        else if (hf > hi){
            System.out.println("O JOGO DUROU " + duracao +"h");
        }
        else if (hf < hi){
            System.out.println("O JOGO DUROU " + duracao2 + "h");
        }

        
        sc.close();

        /*EXPLICAÇÃO:
        
         * O programa calcula a duração de um jogo dado o horário inicial (hi) e o
         * horário final (hf).
         * 
         * A lógica considera três casos:
         * 
         * 1. Se hi for igual a hf, significa que o jogo durou 24 horas (um dia
         * completo).
         * 
         * 2. Se hf for maior que hi, o jogo começou e terminou no mesmo dia.
         * A duração é calculada pela subtração simples: duracao = hf - hi.
         * 
         * 3. Se hf for menor que hi, o jogo começou em um dia e terminou no dia
         * seguinte,
         * passando da meia-noite. Para calcular a duração, soma-se o tempo restante
         * até a meia-noite com o tempo após a meia-noite:
         * duracao = (24 - hi) + hf.
         * 
         * Dessa forma, o programa garante que a duração seja sempre entre 1 e 24 horas,
         * respeitando a regra do enunciado.
         */

    }
}
