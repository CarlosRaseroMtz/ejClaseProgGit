package ejercicios;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = 0;
		//chicaa que disee
		
		System.out.println("Diga un número");
		n = sc.nextInt();
		
		if (n%2==0) {
			System.out.println("Es par");
		}
		else {
			System.out.println("Es impar");
		}

	}

}
