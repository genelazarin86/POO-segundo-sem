package app;

import java.util.Scanner;

import clases.Rectangulo;

public class appRectangulo {

    public static void main(String[] args) {
        Scanner captu = new Scanner(System.in);
        
        // Capturando la base
        System.out.println("Captura la base: ");
        int b = captu.nextInt();
        
        // Capturando la altura
        System.out.println("Captura la altura: ");
        int h = captu.nextInt();

        // Creando un objeto Rectangulo
        Rectangulo canchaFut = new Rectangulo(b, h);
        
        // Calculando el área
        int ar = canchaFut.area();
        System.out.println("El área es: " + ar);

        captu.close();
    }
}
