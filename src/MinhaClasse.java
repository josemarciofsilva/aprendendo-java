public class MinhaClasse {
    public static void main(String[] args) {
        //variável constante não deve ser mudado durante a execuçã do programa
        final String BR = "Brasil";
        String meuNome = "Jose Marcio";
        int anoFabricacao = 2023;
        boolean verdadeira = true;
        String primeiroNome = "Jose Marcio";
        String segundoNome = "Ferreira da Silva";
        String nomeCompleto = nomeCompleto(primeiroNome, segundoNome);

        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto(String primeiroNome, String segundoNome) {
        return primeiroNome.concat(" ").concat(segundoNome);
    }
}
