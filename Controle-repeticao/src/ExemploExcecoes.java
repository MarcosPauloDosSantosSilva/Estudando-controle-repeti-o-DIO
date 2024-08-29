import java.util.Locale;
import java.util.Scanner;
import java.util.InputMismatchException;

public class ExemploExcecoes {

    public static void main(String[] args) {
        try {
            Scanner sc = new Scanner(System.in).useLocale(Locale.US);

            System.out.println("Digite seu nome");
            String nome = sc.next();

            System.out.println("Digite seu sobrenome");
            String sobrenome = sc.next();

            System.out.println("Digite sua idade");
            int idade = sc.nextInt();

            System.out.println("Digite sua altura");
            Double altura = sc.nextDouble();

            System.out.println("Ola, me Chamo " + nome.toUpperCase() + "");
            System.out.println("Meu sobrenome é  " + sobrenome.toUpperCase() + "");
            System.out.println("Tenho " + idade + " anos ");
            System.out.println("Minha altura é " + altura + " cm ");

            sc.close();
        } catch (InputMismatchException e) {
            System.out.println("O campo idade e altura precisam ser numericos, não adicionar virgulas.");
        }
    }

}
