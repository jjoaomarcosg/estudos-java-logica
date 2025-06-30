package testeLogica;

import java.util.Locale;
import java.util.Scanner;

public class teste015 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        
        double nota1, nota2, media;

        System.out.print("Digite a primeira nota: ");
        nota1 = sc.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = sc.nextDouble();

        media = (nota1 + nota2)/2;

        if (media >= 7){
            System.out.println("APROVADO");
        }
        else{
            System.out.println("REPROVADO");
        }

        sc.close();

    }

}
