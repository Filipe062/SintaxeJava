public class Operadores {
    public static void main(String[] args) {
        // Aula sobre Concatenação   
        String concatenacao;

        concatenacao = 1 + 1 + 1 + "1";
        System.out.println(concatenacao); // Resultado: 31

        concatenacao = 1 + "1" + 1 + 1;
        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = 1 + "1" + 1 + "1";
        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = "1" + 1 + 1 + 1;
        System.out.println(concatenacao); // Resultado: 1111

        concatenacao = "1" + (1 + 1 + 1);
        System.out.println(concatenacao); // Resultado: 13
  
        // Operadores de soma e subtração e como deixar o numero positivo ou negativo.

        int numero = 5;

        numero = - numero;

        System.out.println(numero);

        // Decrementação e incrementação
        int valor = 5;

        //System.out.println(++ valor);

        //Exemplos de Incrementaçao e decrementacao
        //como podemos ver so funciona um exemplo por vez.
        
        System.out.println(valor -- );
        System.out.println(valor);

        boolean variavel = true;

        System.out.println(!variavel);

        System.out.println(variavel);

        variavel = !variavel;

        System.out.println(variavel);
    }

}
