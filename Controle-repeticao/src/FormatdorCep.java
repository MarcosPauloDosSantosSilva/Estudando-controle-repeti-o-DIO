import java.util.Scanner;

public class FormatdorCep {

    public static void main(String[] args) {

        try {
            String cepDigitado = formatarCep("12244455");

            System.out.println(cepDigitado);
        } catch (CepInvalido e) {
            // TODO Auto-generated catch block
            // e.printStackTrace();
            System.out.println("Cep invalido");
        }

    }

    static String formatarCep(String cep) throws CepInvalido {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o cep");
        cep = sc.next();
        sc.close();
        if (cep.length() != 8) {
            throw new CepInvalido();
        }

        // simulando as regras de negocio de um cep formatado
        return cep + " CepModificado";

    }

}
