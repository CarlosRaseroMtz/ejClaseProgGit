package ejercicios;

import java.util.Scanner;

public class Ejercicioo10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int dia = 0;
		int mes = 0;
		
		System.out.println("Diga un dia");
		dia = sc.nextInt();
		System.out.println("Diga un mes");
		mes = sc.nextInt();

		
		if (dia>=21 && mes<=12 && dia<=20 && mes>=3) {
			System.out.println("Es invierno");
		}
		if (dia>=21 && mes<=3 && dia<=20 && mes>=6) {
			System.out.println("Es primavera");
		}
		if (dia>=21 && mes<=6 && dia<=20 && mes>=9) {
			System.out.println("Es verano");
		}
		if (dia>=22 && mes<=12 && dia<=21 && mes>=9) {
			System.out.println("Es otoño");
		}
	}

}
