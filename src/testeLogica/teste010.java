package testeLogica;

import java.util.Scanner;

public class teste010 {

public static void main(String[] args) {
    
    //CALCULE A TAXAÇÃO QUE VOCE VAI TOMAR NAS SUAS COMPRAS PARA TRAZER PARA O BR

    // como no caso será 60% de taxação considerados, usa-se a formula (x * 60)/100

    Scanner sc = new Scanner(System.in);
    
    double preco, imposto;

    System.out.print("Digite o valor do produto: R$");
    preco = sc.nextDouble();

    imposto = (preco * 60) / 100;
    
    System.out.printf("O valor do imposto é R$%.2f\n", imposto);

    sc.close();



}

}
