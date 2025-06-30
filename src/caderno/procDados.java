package caderno;

public class procDados {

    public static void main(String[] args) {

        /*
         * Processamento de Dados:
         * Sintaxe -> <variável> = <expressão>;
         * 
         * Regra:
         * 1) Aexpressão é calculada e o resultado é atribuído a variável.
         * 
         */

        // Exemplo 1

        int x, y;
        x = 5;
        y = 2 * x;

        System.out.println(x);
        System.out.println(y);
        System.out.println();

        // Exemplo 2

        int z;
        double c;

        z = 5;
        c = 2 * z;

        System.out.println(z);
        System.out.println(c);
        System.out.println();

        // Exemplo 3 - Calcule a área

        double b, B, h, area;

        b = 6.0;
        B = 8.0;
        h = 5.0;

        area = (b + B) / 2.0 * h;

        System.out.println(area);
        System.out.println();

        // Exemplo 4

        int a, d;
        double resultado;

        a = 5;
        d = 2;

        resultado = (double) a / d; // aqui estamos fazendo um casting de int para double
        // ou seja, estamos convertendo o valor de a para double antes da divisão

        System.out.println(resultado);
        System.out.println();

        // Exemplo 5

        double l;
        int k;

        l = 5.0;
        k = (int) l;

        System.out.println(k);

    }

}
