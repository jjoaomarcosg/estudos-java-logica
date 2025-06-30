package testeLogica;

import java.util.Scanner;

public class teste009 {

    public static void main(String[] args) {
        
        //TRABALHE COM CONVERSAO DE TEMPERATURA (fARENHEIT PARA CELCIUS)


        Scanner sc = new Scanner(System.in);
        
        double F, C;

        System.out.println("Qual a temperatura atual ?");
            F = sc.nextDouble();

        C = (F - 32) / 1.8; 
        
        System.out.printf("No Brasil seriam %.2fC%n", C);

        
        sc.close();


    }

}
