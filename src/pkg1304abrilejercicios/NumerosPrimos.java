package pkg1304abrilejercicios;

import java.util.Scanner;

public class NumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingresa el número máximo hasta el que deseas obtener los números primos: ");
        int maximo = sc.nextInt(); 
        sc.close();
        
        System.out.println("Lista de números primos hasta " + maximo + ":");
        for (int i = 2; i <= maximo; i++) { 
            if (esPrimo(i)) { 
                System.out.print(i + " "); 
            }
        }
    }
    
    public static boolean esPrimo(int numero) {
        if (numero <= 1) { 
            return false; 
        }
        for (int i = 2; i <= Math.sqrt(numero); i++) { 
            if (numero % i == 0) { 
                return false; 
            }
        }
        return true; 
    }
}