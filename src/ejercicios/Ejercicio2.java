package ejercicios;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		int n2 = 0;
		
		System.out.println("Diga un número");
		n = sc.nextInt();
		System.out.println("Diga otro número");
		n2= sc.nextInt();
		
		if (n==n2) {
			System.out.println("Son iguales");
		}
		else {
			System.out.println("Son distintos");
			if(n>n2) {
				System.out.println("n es mayor que n2 puesto que n es "+n+" y n2 es "+n2);
			}
			else {
				System.out.println("n2 es mayor que n puesto que n2 es "+n2+" y n es "+n);
			}
		}

	}

}
