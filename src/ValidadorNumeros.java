import java.util.Scanner;

// Definición de la interfaz Validador
interface Validador {
    boolean validar(int numero);
}

public class ValidadorNumeros {
    public static void main(String[] args) {
        // Implementación de la clase anónima para validar números (par o impar)
        Validador validador = new Validador() {
            @Override
            public boolean validar(int numero) {
                return numero % 2 == 0; // Devuelve true si el número es par, false si es impar
            }
        };

        Scanner scanner = new Scanner(System.in);
        int numero;

        try {
            do {
                System.out.print("Ingrese un número (0 para salir): ");
                numero = scanner.nextInt();
                if (numero != 0) {
                    if (validador.validar(numero)) {
                        System.out.println("El número ingresado es par.");
                    } else {
                        System.out.println("El número ingresado es impar.");
                    }
                }
            } while (numero != 0);
        } catch (Exception e) {
            System.out.println("Ha ocurrido un error al leer la entrada.");
            e.printStackTrace();
        } finally {
            scanner.close();
        }
    }
}
