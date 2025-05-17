public class BoletimAluno {
    public static void main(String[] args) {
        int mediaFinal = 7;

        if (mediaFinal < 6)
            System.out.println("REPROVADOO");
        else if (mediaFinal == 6)
            System.out.println("PROVA MINERVA");
        else
            System.out.println("APROVADO"); 
    }
}