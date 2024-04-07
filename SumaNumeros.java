import java.util.Scanner;

public class SumaNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer numero: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo numero: ");
        double numero2 = scanner.nextDouble();

        // Calcular la suma de los dos números
        double suma = numero1 + numero2;

        // Mostrar el resultado
        System.out.println("La suma de " + numero1 + " y " + numero2 + " es: " + suma);

        // Cerrar el scanner
        scanner.close();
    }
}
