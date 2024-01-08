package ejercicios;

import java.util.Scanner;

public class Ejercicioo11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int base = 0;
		int total = 0;
		int iva = 0;
		int codigoPromo = 0;

		System.out.println("Escriba la base");
		base = sc.nextInt();
		System.out.println("Escriba el iva, eligiendo entre 21, 10 y 4");
		iva = sc.nextInt();
		if (iva == 21) {
			iva = 21;
			total = base - (100 * iva);
		}
		if (iva == 10) {
			iva = 10;
			total = base - (100 * iva);
		}
		if (iva == 4) {
			iva = 4;
			total = base - (100 * iva);
		}

	}

}
