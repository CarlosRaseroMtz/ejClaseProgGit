package ejercicios;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int nota = 0;
		
		System.out.println("Escriba una nota");
		nota = sc.nextInt();
		
		if (nota<=4) {
			System.out.println("Has sacado un insuficiente");
		}
		else if (nota==5) {
			System.out.println("Has sacado un suficiente");
		}
		else if (nota==6) {
			System.out.println("Has sacado un bien");
		}
		else if(nota>6 && nota<9) {
			System.out.println("Has sacado un notable");
		}
		else if (nota>=9 && nota<=10){
			System.out.println("Has sacado un sobresaliente");
		}
		else {
			System.out.println("Te has pasado el juego de las notas");
		}
		

	}

}
