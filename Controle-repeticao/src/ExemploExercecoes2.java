import java.text.NumberFormat;
import java.text.ParseException;

public class ExemploExercecoes2 {

    public static void main(String[] args) {

        Number valor;
        try {
            valor = NumberFormat.getInstance().parse("01.75");
            System.out.println(valor);
        } catch (ParseException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

    }

}
