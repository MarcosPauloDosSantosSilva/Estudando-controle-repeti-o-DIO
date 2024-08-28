import java.util.Scanner;

public class ExemploBreackContinue {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        for (int contador = 0; contador <= 10; contador++) {

            System.out.println("Digite um numero da sorte");
            int numero = sc.nextInt();
            contador = numero;

            if (contador != 4) {

                System.out.println("Tente novamente");
            }

            else {
                System.out.println("Voce acertou");

                break;
            }

        }

        System.out.println("Deseja jogar novamente ?");
        Scanner opcao = new Scanner(System.in);
        int escolha = opcao.nextInt();

        if (escolha == 1) {

        }

        sc.close();

    }

}
