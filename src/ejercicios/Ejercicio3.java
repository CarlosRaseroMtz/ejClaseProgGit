package ejercicios;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		double n = 0.00;

		System.out.println("Escriba un número decimal");
		n = sc.nextDouble();
		System.out.println(n);
		if (n >= 1 || n <= -1) {
			System.out.println("No es casi 0");
		} else if (n == 0) {
			System.out.println("Es 0");
		} else {
			System.out.println("Es casi 0");
		}

	}

}
