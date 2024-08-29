
import App.circulo;
public class Circulo {
    private double radio;

    // Constructor
    public Circulo(double radio) {
        this.radio = radio;
    }

    // Método para calcular el área
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    // Método para calcular el perímetro
    public double calcularPerimetro() {
        return 2 * Math.PI * radio;
    }

    // Método para obtener el radio
    public double getRadio() {
        return radio;
    }

    // Método para establecer un nuevo radio
    public void setRadio(double radio) {
        this.radio = radio;
    }
}