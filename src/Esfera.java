public class Esfera extends Figura3D {
    double radio;

    Esfera(double radio) {
        this.radio = radio;
    }

    double calcularVolumen() {
        return (4.0 / 3.0) * Math.PI * Math.pow(radio, 3);
    }
}
