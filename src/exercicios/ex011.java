package exercicios;

import java.util.Scanner;

public class ex011 {

    public static void main(String[] args) {
       
        
        Scanner sc = new Scanner(System.in);
        
        double preço, total; // preço dos produtos e valor total.
        int qtd, cod; //quantidade, codigo do produto.

        preço = 0.0;

        System.out.println("DIGITE O CÓDIGO E QUANTIDADE DO PRODUTO:");
        cod = sc.nextInt();
        qtd = sc.nextInt();

        if (cod == 1) {
            preço = 4.00;
        }
        else if(cod == 2){
            preço = 4.50;
        }
        else if(cod == 3){
            preço = 5.0;
        }
        else if(cod == 4){
            preço = 2.0;
        }
        else if(cod == 5){
            preço = 1.50;
        }


        total = preço * qtd;

        System.out.printf("Total: %.2f\n", total);

        sc.close();


        /*
         * Leia o código do produto e a quantidade desejada.
         * A variável 'preço' é inicializada com 0.0 para evitar erros.
         * Usamos uma série de condições if-else para definir o preço
         * correspondente ao código do produto digitado.
         * Depois calculamos o total multiplicando o preço pela quantidade.
         * Para mostrar o valor formatado com duas casas decimais,
         * usamos o printf com o especificador "%.2f".
         * Isso garante que, mesmo se o número não tiver casas decimais,
         * ele será exibido sempre com duas, importante para valores monetários.
         */

    }

}
