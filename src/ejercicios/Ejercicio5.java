package ejercicios;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int num1 = 0;
		int num2 = 0;
		int num3 = 0;
		int mayor = 0;
		int medio = 0;
		int menor = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Escribe un número");
		num1 = sc.nextInt();
		System.out.println("Escribe un número");
		num2 = sc.nextInt();
		System.out.println("Escribe un número");
		num3 = sc.nextInt();

		// Aqui comprobamos el 1 número
		if (num1 >= num2 && num1 >= num3) {
			mayor = num1;
			if (num2 >= num3) {
				medio = num2;
				menor = num3;
			} else {
				medio = num3;
				menor = num2;
			}

			// Aqui comprobamos el 2 número
		} else if (num2 >= num1 && num2 >= num3) {
			mayor = num2;
			if (num1 >= num3) {
				medio = num1;
				menor = num3;
			} else {
				medio = num3;
				menor = num1;
			}

			// Aqui comprobamos el 3 número
		} else {
			mayor = num3;
			if (num1 >= num2) {
				medio = num1;
				menor = num2;
			} else {
				medio = num2;
				menor = num1;
			}
		}

		System.out.println("Los números de mayor a menor son " + mayor + " ," + medio + " ," + menor);

	}

}
