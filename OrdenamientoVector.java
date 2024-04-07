import java.util.Scanner;

public class OrdenamientoVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Pedir al usuario que ingrese la longitud del vector
        System.out.print("Ingrese la longitud del vector: ");
        int longitud = scanner.nextInt();

        // Crear un vector con la longitud especificada por el usuario
        int[] vector = new int[longitud];

        // Pedir al usuario que ingrese los elementos del vector
        System.out.println("Ingrese los elementos del vector:");
        for (int i = 0; i < longitud; i++) {
            System.out.print("Elemento " + (i + 1) + ": ");
            vector[i] = scanner.nextInt();
        }

        // Llamar al método de ordenamiento de burbuja para ordenar el vector
        ordenarVector(vector);

        // Mostrar el vector ordenado
        System.out.println("El vector ordenado de menor a mayor es:");
        for (int i = 0; i < longitud; i++) {
            System.out.print(vector[i] + " ");
        }

        // Cerrar el scanner
        scanner.close();
    }

    // Método para ordenar un vector utilizando el algoritmo de ordenamiento de burbuja
    public static void ordenarVector(int[] vector) {
        int n = vector.length;
        for (int i = 0; i < n-1; i++) {
            for (int j = 0; j < n-i-1; j++) {
                if (vector[j] > vector[j+1]) {
                    // Intercambiar elementos si están en el orden incorrecto
                    int temp = vector[j];
                    vector[j] = vector[j+1];
                    vector[j+1] = temp;
                }
            }
        }
    }
}
