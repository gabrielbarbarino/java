package geometricas;

public class Main {
    public static void main(String[] args) {
        FormaGeometrica circulo = new Circulo(5);
        FormaGeometrica retangulo = new Retangulo(5, 3);

        System.out.printf("Circulo: %.2f", circulo.calcularArea());
        System.out.printf("   ||   Retangulo: %.2f", retangulo.calcularArea());
    }
}
