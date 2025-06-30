package testeLogica;

import java.util.Scanner;

public class teste007 {

public static void main(String[] args) {
    
    // Digite o ano que estamos, o ano que nasceu e por fim sua idade.

    Scanner sc = new Scanner(System.in);

    int ano_atual, nasci, idade;

    System.out.println("Em que ano nós estamos ?");
        ano_atual = sc.nextInt();

    System.out.println("Em que ano eu nasci ? ");
        nasci = sc.nextInt();
    
    idade = ano_atual - nasci;

    System.out.println("Eu tenho " + idade + " anos.");

    sc.close();
}

}
