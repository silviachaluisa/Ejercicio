public class Cubo extends Figura3D {
    double lado;

    Cubo(double lado) {
        this.lado = lado;
    }

    double calcularVolumen() {
        return Math.pow(lado, 3);
    }
}
