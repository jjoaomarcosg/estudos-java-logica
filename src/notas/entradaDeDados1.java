package notas;

public class entradaDeDados1 {

    public static void main(String[] args) {
        
        /*
         * Entrada de dados é quando o usuário informa dados ao programa. (dentro de variáveis).
         * usando dispositivos de entrada, como o teclado.
         * 
         * Também chamado de leitura de dados.
         */

        
         /*
          * - Para fazer a entrada dados em Java, usamos a classe/ variável Scanner.
          * realizamos essa entrada de dados através do código Scanner sc = new
          * Scanner(System.in);
          * que
          * "Cria um novo objeto chamado sc, que vai ler dados do teclado usando a classe Scanner."
          * 
          * - para usar essa classe, precisamos importar o pacote java.util.Scanner.
          * e quando não precisar mais dela, devemos fechá-la com o comando sc.close();
          * 
          * - o método next() da classe Scanner, le uma palavra (até o primeiro espaço)
          * do teclado e armazena na variável.
          * caso eu use espaçamento entre as palavras, o método next() só vai ler a
          * primeira palavra.
          * 
          * 
          * -----------------------------------------------------------------------------
          * DÚVIDA ENTRE print e println na hora de imprimir no console usando scanner:
          * 
          * System.out.println("Quantas horas ?");
          * hora = sc.nextInt();
          * 
          * Resultado:
          * Quantas horas ?
          * _ ← (o cursor fica aqui embaixo esperando o número)
          * 
          * 
          * AGORA SE USAR:
          * 
          * System.out.print("Quantas horas ?");
          * hora = sc.nextInt();
          * 
          * Resultado:
          * Quantas horas ?_ ← (o cursor já fica na mesma linha esperando o número)
          * 
          * 
          */


    }

}
