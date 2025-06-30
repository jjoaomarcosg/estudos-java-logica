package caderno;

import java.util.Scanner; // como dito na classe notas.entradaDeDados1, precisamos importar o pacote java.util.Scanner para usar a classe Scanner.

public class entradaDeDados1 { 

    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in); // Cria um novo objeto chamado sc, que vai ler dados do teclado usando a classe Scanner.
        
        // Exemplo de entrada de dados

        String x;    // declarando uma variável do tipo String, que vai armazenar o texto informado pelo usuário.
        x = sc.next();    // usando o método next() da classe Scanner, que le uma palavra (até o primeiro espaço) do teclado e armazena na variável x.

        System.out.println("Você digitou: " + x); // escrevendo na tela o que o usuário digitou, concatenando a variável x com o texto "Você digitou: ".

        //---------------------------------------------------//

        // Exemplo de entrada de dados com número inteiro

        int y;
        y = sc.nextInt();             // usando o método nextInt() da classe Scanner, que le um número inteiro do teclado e armazena na variável y.

        System.out.println("Você digitou : " + y); 

        //---------------------------------------------------//

        // Exemplo de entrada de dados com número decimal

        double z;
        z = sc.nextDouble();           // usando o método nextDouble() da classe Scanner, que le um número decimal do teclado e armazena na variável z.

        System.out.printf("Você digitou : %.2f%n", + z);

        //---------------------------------------------------//

        // Exemplo de entrada de dados com caractere 

        char c;
        c = sc.next().charAt(0);   // usando o método next() da classe Scanner, que le uma palavra do teclado e depois usamos o método charAt(0) para pegar o primeiro caractere.

        System.out.println("Você digitou : " + c); 

        //---------------------------------------------------//

        // Exemplo de entrada de dados com múltiplos valores    

        String s;  // declaramos uma variavel do tipo String
        int i;      // declaramos uma variável do tipo inteiro
        double d;  // declaramos uma variável do tipo decimal
        s = sc.next(); 
        i = sc.nextInt(); 
        d = sc.nextDouble();

        System.out.println("Dados digitados: ");
        System.out.println(s);
        System.out.println(i);
        System.out.println(d);

        sc.close(); // quando não precisar mais dela, devemos fechá-la com o comando sc.close();
    }

}
