package notas;

public class estruturaCondicional {

    public static void main(String[] args) {
        
        /*
         * Estrutura condicional
         * 
         * - Consiste em uma estrutura de controle que permite que o programa tome
         * decisões
         * com base em condições específicas.
         * 
         * - Você direciona o fluxo do programa para um lado ou outro, caso a condição
         * seja
         * verdadeira ou falsa.
         * 
         * if > se
         * else > senão
         * 
         * -------------------------------------------------------------
         * 
         * SINTAXE DA ESTRUTURA CONDICIONAL:
         * 
         * - SIMPLES:
         * 
         * if (condição) { REGRA: V: executa o bloco de comandos
         * F: pula o bloco de comandos
         * <comando>
         * <comando>
         * }
         * 
         * -------------------------------------------------------------
         * 
         * - COMPOSTA:
         * 
         * if ( condição ) { REGRA: V: executa somente o bloco do if
         * <comando 1> F: executa somente o bloco do else
         * <comando 2>
         * }
         * else (condição) {
         * <comando 3>
         * <comando 4>
         * }
         * 
         * -------------------------------------------------------------
         * 
         * ENCADEAMENTO DE ESTRUTURAS CONDICIONAIS:
         * - Usada quando há mais de duas possibilidades de execução.
         * 
         * SINTAXE:
         * 
         * if (condição 1){
         * comando 1
         * comando 2
         * }
         * else if (condição 2){
         * comando 3 Detalhe importante: Sempre atento a edentação !!
         * comando 4
         * }
         * else if (condição 3){
         * comando 5
         * comando 6
         * }
         * else {
         * comando 7
         * comando 8
         * }
         * 
         * -----------------------------------------------------------------
         *
         * Para identificar se um número é par ou ímpar:
         * - Usamos a operação de resto da divisão (%).
         * - Dividimos o número por 2.
         * - Se o resto for 0, o número é par.
         * - Se o resto for diferente de 0 (normalmente 1), o número é ímpar.
         * 
         * Exemplo de condição:
         * if (num % 2 == 0) {
         * // número par
         * } else {
         * // número ímpar
         * }
         * 
         * A base do cálculo é sempre 2, porque a definição de paridade depende da
         * divisão por 2.
         * 
         * -----------------------------------------------------------------
         *
         * Verificar se dois números são múltiplos entre si:
         *
         * - Dois números são múltiplos se um divide o outro sem deixar resto.
         * - Ou seja, se o resto da divisão de A por B for 0, A é múltiplo de B.
         * - Também é necessário verificar o contrário: se o resto da divisão de B por A
         * for 0,
         * então B é múltiplo de A.
         * 
         * - Isso garante que a verificação funcione independentemente da ordem em que
         * os números
         * forem digitados (crescente ou decrescente).
         * 
         * - Estrutura de decisão:
         * Se A % B == 0 ou B % A == 0 → "São múltiplos"
         * Caso contrário → "Não são múltiplos"
         */
        



    }

}
