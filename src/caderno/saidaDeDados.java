package caderno;

public class saidaDeDados {
    public static void main(String[] args) {

         // Para escrever na tela, usamos o comando System.out.print que não pula linha
         
         System.out.print("Olá, Mundo!"); // Escreve na tela "Olá Mundo!" sem pular linha
            
         // Para escrever na tela e pular linha, usamos o comando System.out.println
        
         System.out.println("Olá, Mundo!"); // Escreve na tela "Olá, Mundo!" e pula linha";

        // Para escrever o conteúdo de uma variável de algum tipo primitivo:
        int y = 32;
        double x = 10.35784;
        System.out.println(y);
        System.out.printf("%.2f%n", x); // Escreve o valor de x com 2 casas decimais e pula linha.
        
        // Para concatenar vários elemtentos em um mesmo comando de escrita:
        System.out.println("RESULTADO: " + x + " METROS");
    
        // Para concatenar vários elementos em um mesmo comando de escrita:
        System.out.printf("RESULTADO = %.2f metros%n", x); // escreve o valor de x com duas casas decimais e pula linha.
    
        // atribuição para concatenar e formatar varios elementos em um mesmo comando de
        String nome = "João";
        int idade = 26;
        double renda = 1560.0;
        System.out.printf("%s tem %d anos e ganha %.2f reais ao mês.%n", nome, idade, renda);

    }

}
