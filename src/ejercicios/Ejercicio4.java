package ejercicios;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		int pagoNormal = 12;
		int pagoExtra = 16;
		int horasNormales = 40;
		int horasTrabajadas = 0;
		int salarioSemanalTotal = 0;

		System.out.println("Indique el número de horas tranajadas esta semana");
		horasTrabajadas = sc.nextInt();

		if (horasTrabajadas <= horasNormales) {
			salarioSemanalTotal = horasTrabajadas * pagoNormal;
		} else {
			salarioSemanalTotal = horasTrabajadas * pagoNormal + (horasTrabajadas - horasNormales) * pagoExtra;
		}
		
		System.out.println("El trabajador gana a la semana "+salarioSemanalTotal+" euros");
	}

}
