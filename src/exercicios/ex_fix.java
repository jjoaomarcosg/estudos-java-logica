package exercicios;


public class ex_fix {

    public static void main(String[] args) {
        
      /*
       * Crie um programa em Java que declare e inicialize as seguintes variáveis:
       * 
       * String product1 = "Computer";
       * String product2 = "Office desk";
       * 
       * int age = 30;
       * int code = 5200;
       * char gender = 'r';
       * 
       * double price1 = 2100.0;
       * double price2 = 650.50;
       * double measure = 3.234567;
       * 
       * -------------------------------------------------------------------------
       * 
       * Em seguida, utilize os valores dessas variáveis para produzir a seguinte
       * saída no console:
       * 
       * Products:
       * Computer, which price is $ 2100.00
       * Office desk, which price is $ 650.50
       * 
       * Record: 30 years old, code 5200 and gender: r
       * 
       * Measure with eight decimal places: 3.23456700
       * Rounded (three decimal places): 3.235
       * US decimal point: 3.235
       */  

        String product1 = "Computer";
        String product2 = "Office desk";

        int age = 30;
        int code = 5200;
        char gender = 'r';

        double price1 = 2100.0;
        double price2 = 650.50;
        double measure = 3.234567;

        System.out.println("Products:");
        System.out.printf("%s, which price is $ %.2f%n", product1, price1);
        System.out.printf("%s, which price is $ %.2f%n", product2, price2);
        System.out.println();
        System.out.printf("Record: %d years old, code %d and gender: %c%n", age, code, gender);
        System.out.println();    
        System.out.printf("Measure with eight decimal places: %.8f%n", measure);
        System.out.printf("Rounded (three decimal places): %.3f%n", measure);
        System.out.printf("US decimal point: %.3f", measure);
    }

}
