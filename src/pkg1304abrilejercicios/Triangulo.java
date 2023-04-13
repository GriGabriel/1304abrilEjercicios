package pkg1304abrilejercicios;

import java.util.Scanner;

public class Triangulo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el valor de la base del triángulo: ");
        double base = sc.nextDouble(); 
        System.out.print("Ingresa el valor de la altura del triángulo: ");
        double altura = sc.nextDouble(); 
        sc.close(); 

        double area = (base * altura) / 2; 
        double hipotenusa = Math.sqrt((base * base) + (altura * altura)); 
        double perimetro = base + altura + hipotenusa; 

        System.out.println("El área del triángulo es: " + area); 
        System.out.println("El perímetro del triángulo es: " + perimetro); 
    }
}