package caderno;

public class tiposPrimitivos { 

public static void main(String[] args) {
    
    // Tipos primitivos em Java

    // Tipos numéricos inteiros
   /*
   Quando usar ?
   int é usado quando precisamos de números inteiros.
    */ 
    int i = 100000; // 4 bytes
    

    // Tipos numéricos de ponto flutuante
    /*
     * Quando usar ? 
     * double é usado quando precisamos de maior precisão
     */
    double d = 20.99; // 8 bytes

    // Tipo caractere
    /*
     * Quando usar? 
     * quando precisamos armazenar um único caractere, como uma letra ou símbolo.
     */
    char c = 'A'; // 2 bytes

    // Tipo booleano
    /*
     * Quando usar? 
     * quando precisamos armazenar um valor lógico, que pode ser verdadeiro ou falso.
     */
    boolean bool = true; // 1 bit

    System.out.println(i + " é um número inteiro.");
    System.out.println(d + " é um número de ponto flutuante.");
    System.out.println(c + " é um caractere.");
    System.out.println(bool + " é um valor booleano.");
    
}

}
