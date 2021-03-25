package datos.Throw;
import java.util.Scanner;
public class throwExamples {
    int num;
    public void printList() throws  Exception{
        String[] animals = {"Perro", "Gato", "Pinguino"};
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un numero menor que 3");
        try {
            num = scanner.nextInt();
            System.out.println("Su animal es: " + animals[num]);
        }catch (Exception e) {
            throw new Exception("El numero debe ser menor que 3");
        }
    }
}
