package ejercicios;

import java.util.Scanner;

public class Ejercicio8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		int ano = 0;

		System.out.println("Ingrese el dia");
		dia = sc.nextInt();
		System.out.println("Ingrese el mes");
		mes = sc.nextInt();
		System.out.println("Ingrese el año");
		ano = sc.nextInt();

		if (dia > 31) {
			System.out.println("El dia no es válido");
			System.out.println("Ingrese un dia comprendido entre 1 y 31");
			dia = sc.nextInt();
		} else {
			System.out.println("El dia es válido");
		}
		if (mes > 12) {
			System.out.println("El mes no es válido");
			System.out.println("Ingrese un mes comprendido entre 1 y 12");
			mes = sc.nextInt();
		} else {
			System.out.println("El mes es válido");
		}
		
		//La fecha no la comprobamos ya que casi cualquier fecha puede ser real
		//ya sea en el pasado o futuro lejanos
		
		System.out.println("La fecha es "+dia+"/"+mes+"/"+ano);
	}

}
