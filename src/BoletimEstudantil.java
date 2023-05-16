public class BoletimEstudantil {
    public static void main(String[] args) {
        int mediaFinal = 5;

        if (mediaFinal < 6) {
            System.out.println(" Sua Nota foi: " + mediaFinal + " voce foi: REPROVADO");
        } else if (mediaFinal == 6) {
            System.out.println(" Sua Nota foi: " + mediaFinal + " voce esta de RECUPERACAO");
        } else {
            System.out.println(" Sua Nota foi: " + mediaFinal + " voce foi: APROVADO");
        }
    }
}
