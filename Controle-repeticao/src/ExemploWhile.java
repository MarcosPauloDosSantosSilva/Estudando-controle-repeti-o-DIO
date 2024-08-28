import java.util.concurrent.ThreadLocalRandom;

public class ExemploWhile {

    private static double valorAleatorio() {
        return ThreadLocalRandom.current().nextDouble(2, 8);
    }

    public static void main(String[] args) {

        Double cartãoCredito = 80.0;

        while (cartãoCredito > 0) {

            Double produtos = valorAleatorio();

            // if (produtos > cartãoCredito)
            // produtos = cartãoCredito;

            System.out.println("Produto do valor" + produtos + " Adicionado no Carrinho");
            cartãoCredito = cartãoCredito - produtos;

        }

        System.out.println("Cartão" + cartãoCredito);
        System.out.println("Cartão esta sem limite de credito");

    }

}
