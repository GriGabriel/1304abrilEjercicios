package pkg1304abrilejercicios;

// Importamos la clase Scanner del paquete java.util para poder leer la entrada del usuario
import java.util.Scanner;

public class Cuadrado {
    public static void main(String[] args) {
        
       Scanner input = new Scanner(System.in);
       
       float area,perimetro,lado;
        System.out.println("Ingresa uno de los lados del cuadrado");
        
        lado = input.nextFloat();
        area = lado*lado;
        perimetro = lado *4;
        System.out.println("El area del cuadrado es: "+area+" cm ");
        System.out.println("El perimetro del cuadrado es: "+perimetro+" cm ");
    }
}