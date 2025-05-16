public class MinhaClasse {
    
    public static void main(String [] args) {
        String primeiroNome = "Luiz";
       String segundoNome = "Filipe";
       String nomeCompleto = nomeCompleto (primeiroNome, segundoNome);
       System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do metado " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
