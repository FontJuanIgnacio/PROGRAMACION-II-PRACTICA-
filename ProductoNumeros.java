import java.util.Scanner;

public class ProductoNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número
        System.out.print("Ingrese el primer número: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número
        System.out.print("Ingrese el segundo número: ");
        double numero2 = scanner.nextDouble();

        // Calcular el producto de los dos números
        double producto = numero1 * numero2;

        // Mostrar el resultado
        System.out.println("El producto de " + numero1 + " y " + numero2 + " es: " + producto);

        // Cerrar el scanner
        scanner.close();
    }
}

