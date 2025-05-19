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


        // Operacaçao ternario sobre true e false

        int a, b;
        a = 5;
        b = 6;

        String resultado = a==b ? "verdadeiro" : "falso";

        System.out.println(resultado);
        //Exemplos de operadores 

        int numero1 = 1;
        int numero2 = 2;

        boolean simNao = numero1 == numero2;

        System.out.println("NumeroUm e igual a mumeroDois ? " + simNao);
        
        simNao = numero1 != numero2;

        System.out.println("NumeroUm e diferente a mumeroDois ? " + simNao);

        simNao = numero1 > numero2;

        System.out.println("NumeroUm e maior a mumeroDois ? " + simNao);

        if (numero1 < numero2) {
            System.out.println("A nossa condiçao e verdadeira");
        }

        //string* o obejto e salvo em outro local dos numeros
        // equals = ver se e igual (nomeUm.equals(nomeDois));
        
        String nomeUm = "LUIZ";
        String nomeDois = "LUIZ";

        System.out.println(nomeUm.equals(nomeDois));

        //Operadores $$ e || exemplos abaixo

        boolean condicao1 = true;

        boolean condicao2 = true;
        // && e igual a "E"
        //podemos usar numeros detro do paramenrto 7 > 4 true
        if (condicao1 && ( 7 > 4)) {
              System.out.println("As duas condicoes é verdadeira");
            
        }

        //|| e igual "OU"
        if (condicao1 || condicao2) {
          System.out.println("Uma das condicoes e verdadeira");  
        }
        
        System.out.println("Fim");

    }

}
