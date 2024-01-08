package ejercicios;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int numDia = 0;

		System.out.println("Escriba un número de la semana");
		numDia = sc.nextInt();

		if (numDia == 1) {
			System.out.println("El dia que has seleccionado es Lunes");
		} else if (numDia == 2) {
			System.out.println("El dia que has seleccionado es Martes");
		}

		else if (numDia == 3) {
			System.out.println("El dia que has seleccionado es Miércoles");
		}

		else if (numDia == 4) {
			System.out.println("El dia que has seleccionado es Jueves");
		}

		else if (numDia == 5) {
			System.out.println("El dia que has seleccionado es Viernes");

		} else if (numDia == 6) {
			System.out.println("El dia que has seleccionado es Sábado");
		}

		else if (numDia == 7) {
			System.out.println("El dia que has seleccionado es Domingo");
		} else {
			System.out.println("Te has equivocado");
		}

	}

}
