package caderno;

import java.util.Scanner;

public class entradaDeDados2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Para ler um texto ATÉ a quebra de linha

        String s1, s2, s3;

        s1 = sc.nextLine();
        s2 = sc.nextLine();
        s3 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // melhor dizendo, eu posso digitar todas as 3 linhas até a hora que eu decidir
        // dar Enter.

        // ---------------------------------------------------

        // QUEBRA DE LINHA PENDENTE
        // Se eu quiser ler mais 3 linhas, eu preciso limpar a quebra de linha pendente
        // do buffer do teclado.
        int i;
        String s4, s5, s6;

        i = sc.nextInt(); // ele come a próxima linha, pois ja tem uma quebra armazenada no buffer do
                          // teclado.
        sc.nextLine(); // Limpa a quebra de linha pendente
        s4 = sc.nextLine();
        s5 = sc.nextLine();
        s6 = sc.nextLine();

        System.out.println("DADOS DIGITADOS: ");
        System.out.println(i);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s6);

        sc.close();
    }

}
