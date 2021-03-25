package datos.Try;
import java.util.InputMismatchException;
import java.util.Scanner;


public class TryExamples {
    int num;
    public void  cuadradoDeNumero() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        try {
            num = scanner.nextInt();
            System.out.println(num * num);
        } catch (InputMismatchException e) {
            System.out.println("ERROR!!! POR FAVOR INGRESE UN NUMERO");
        } finally {
            System.out.println("Gracias por usar nuestro servicio, vuelva pronto");
        }
    }
}
