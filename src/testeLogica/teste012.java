package testeLogica;

import java.util.Scanner;

public class teste012 {

    public static void main(String[] args) {
        
        //TESTE IDADE


    Scanner sc = new Scanner(System.in);


    int ano, nasc, idade;

    System.out.print("Em que ano estamos ? ");
    ano = sc.nextInt();
    
    System.out.print("Em que ano você nasceu ? ");
    nasc = sc.nextInt();

    idade = ano - nasc;

    System.out.printf("Em %d, você terá %d anos\n", ano, idade);

        if(idade >= 21){
            System.out.println("Você é maior de idade.");
        }
        else{
            System.out.println("Você é menor de idade.");
        }

    sc.close();
    }

}
