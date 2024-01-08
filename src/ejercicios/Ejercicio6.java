package ejercicios;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stubç
		Scanner sc = new Scanner(System.in);
		int num = 0;
		int cifras = 0;

		System.out.println("Ingrese un num entre 0 y 99.999");
		num = sc.nextInt();
		if (num >= 0 && num <= 99999) {
			//En esta sentencia transformamos nuestro int en un String y con .lenght sacamos el tamaño
			cifras = String.valueOf(num).length();
			System.out.println("El número " + num + " tiene " + cifras + " cifras");
		} else {
			System.out.println("No ha introducido los parametros");
		}

	}

}
