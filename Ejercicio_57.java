package ejecicios;
import java.util.Scanner;
public class Ejercicio_57 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Dado un número determinar la suma de sus dígitos
Scanner tc = new Scanner(System.in);


System.out.println("Ingrese un número");
int n = tc.nextInt();
int d = Integer.toString(n).length();
int t = 0;

for (int i = 0; i<d; i++) {
	String num = String.valueOf(Integer.toString(n).charAt(i));
	t+=Integer.parseInt(num);
}
tc.close();

System.out.println("La suma es: "+t);
	}

}
