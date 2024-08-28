import java.util.Scanner;

public class ExemploForArray {

    public static void main(String[] args) {

        String alunos[] = { "Marcos", "Paulo", "Santos", "Silva" };

        Scanner y = new Scanner(System.in);

        for (int x = 0; x < alunos.length; x++) {
            System.out.print("Digite o valor do indice: ");
            x = y.nextInt();
            System.out.println("O aluno no indice " + x + " é " + alunos[x]);
        }

        y.close();

    }
}
