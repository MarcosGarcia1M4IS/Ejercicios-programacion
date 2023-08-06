package ejecicios;
import java.util.Scanner;
public class Ejercicio_58 {

	public static void main(String[] args) {
      //. Hacer un programa que registre 20 números en un array de una dimensión y muestre
		//posteriormente los elementos que contienen números múltiplos de 5.

		
		int[] numeros = new int[20];
        Scanner tc = new Scanner(System.in);
        System.out.println("Ingrese 20 números:");
        for (int i = 0; i < numeros.length; i++) {
            numeros[i] = tc.nextInt();
        }
        System.out.print("Números múltiplos de 5: ");
        for (int i = 0; i < numeros.length; i++) {
            if (numeros[i] % 5 == 0) {
                System.out.print(numeros[i] + " ");
            }
        }
    tc.close();
	}

}
