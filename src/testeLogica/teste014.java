package testeLogica;

import java.util.Locale;
import java.util.Scanner;

public class teste014 {

    // CALCULO DE IMC (PESO IDEAL -> IMC entre 18,5 e 25)

    public static void main(String[] args) {

        
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);

        double peso, altura, IMC;

        System.out.print("Digite seu peso: ");
        peso = sc.nextDouble();

        System.out.print("Digite sua altura: ");
        altura = sc.nextDouble();

        IMC = peso / (altura * altura);

        System.out.printf("SEU IMC É: %.2f\n", IMC);

        if((IMC >= 18.5) && (IMC<=25)) {
            System.out.println("Está no peso ideal.");
        }
        else if(IMC < 18.5){
            System.out.println("Você está abaixo do peso.");
        }
        else if((IMC > 25) && (IMC < 30)){
            System.out.println("Você está sobrepeso.");
        }
        else if(IMC > 30){
            System.out.println("Você sofre de obesidade.");
        }
        
        sc.close();

    }

}
