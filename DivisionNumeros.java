import java.util.Scanner;

public class DivisionNumeros {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario que ingrese el primer número real
        System.out.print("Ingrese el primer numero real: ");
        double numero1 = scanner.nextDouble();

        // Solicitar al usuario que ingrese el segundo número real
        System.out.print("Ingrese el segundo numero real: ");
        double numero2 = scanner.nextDouble();

        // Verificar si el segundo número es diferente de cero
        if (numero2 != 0) {
            // Realizar la división y mostrar el resultado
            double resultado = numero1 / numero2;
            System.out.println("El resultado de la división es: " + resultado);
        } else {
            // Si el segundo número es cero, mostrar un mensaje de error
            System.out.println("Error: No se puede dividir por cero.");
        }

        // Cerrar el scanner
        scanner.close();
    }
}
