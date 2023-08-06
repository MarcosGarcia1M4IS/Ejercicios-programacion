package ejecicios;
import java.util.Scanner;
public class Ejercicio_47_p3 {
	public static void main(String[] args) {
       
		Scanner tc = new Scanner(System.in);
int n; 
double productoModulos, Z;   
double moduloA = 0, moduloB = 0;
        

System.out.print("Ingrese el tamaño de los arreglos: ");
       n = tc.nextInt();
     
        
        int[] A = new int[n];
        int[] B = new int[n];
        
        System.out.println("Ingrese los elementos del arreglo A:");
        for (int i = 0; i < n; i++) {
            A[i] = tc.nextInt();
        }
        
        System.out.println("Ingrese los elementos del arreglo B:");
        for (int i = 0; i < n; i++) {
            B[i] = tc.nextInt();
        }
        
     
        int productoArreglos = 1;
        for (int i = 0; i < n; i++) {
            productoArreglos *= A[i] * B[i];
        }
        

       
        for (int i = 0; i < n; i++) {
            moduloA += Math.pow(A[i], 2);
            moduloB += Math.pow(B[i], 2);
        }
        moduloA = Math.sqrt(moduloA);
        moduloB = Math.sqrt(moduloB);
        

        productoModulos = moduloA * moduloB;
        
         Z = productoArreglos / productoModulos;

        System.out.println("El valor de Z es: " + Z);
        
        tc.close();
    }

}
