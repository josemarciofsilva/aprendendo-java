public class ControleDeFluxo {
    public static void main(String[] args) {
        double saldo = 25.0;
        double valorSolicitado = 32.0;

        if (valorSolicitado < saldo) {
            saldo = saldo - valorSolicitado;
        } else {
            System.out.println("Saldo Insuficiente!");
        }
        System.out.println("Seu Saldo: " + saldo);
    }
}
