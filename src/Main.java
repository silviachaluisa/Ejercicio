import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nMenú:");
            System.out.println("1. Calcular volumen de Cubo");
            System.out.println("2. Calcular volumen de Esfera");
            System.out.println("3. Mostrar figuras en 2D");
            System.out.println("0. Salir");
            System.out.print("Ingrese su opción: ");

            int opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el lado del Cubo: ");
                    double ladoCubo = scanner.nextDouble();
                    Cubo cubo = new Cubo(ladoCubo);
                    System.out.println("Volumen del Cubo: " + cubo.calcularVolumen());
                    break;
                case 2:
                    System.out.print("Ingrese el radio de la Esfera: ");
                    double radioEsfera = scanner.nextDouble();
                    Esfera esfera = new Esfera(radioEsfera);
                    System.out.println("Volumen de la Esfera: " + esfera.calcularVolumen());
                    break;
                case 3:
                    System.out.println("\t\tFiguras en 2D");
                    Circulo circulo_uno = new Circulo(6);
                    Triangulo triangulo_uno = new Triangulo(9, 6, 7);
                    Cuadrilatero cuadrado_uno = new Cuadrilatero(9, 7, 10, 12);
                    Pentagono pentagono_uno = new Pentagono(9, 7, 10, 12, 8);
                    Hexagono hexagono_uno = new Hexagono(5, 7, 2, 10, 7, 8);
                    Heptagono heptagono_uno = new Heptagono(7, 8, 2, 10, 7, 8, 14);

                    circulo_uno.mostrar_circulo();
                    triangulo_uno.mostrar_triangulo();
                    cuadrado_uno.mostrar_cuadrado();
                    pentagono_uno.mostrar_pentagono();
                    hexagono_uno.mostrar_hexagono();
                    heptagono_uno.mostrar_heptagono();
                    break;
                case 0:
                    System.out.println("Saliendo del programa. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Inténtelo de nuevo.");
            }
        }
    }
}
