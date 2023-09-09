package semana04;

import java.util.Scanner;

public class Ejercicio02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Ingrese un número:");

		 int N = scanner.nextInt(); // N es un número entero a evaluar

		
		// Ingrese aquí la lógica para determinar St N es un número impar o par. Use
		// if... else

		if (N % 2 > 0) {
			System.out.println("Luna");
		} else {
			System.out.println("Luna");
		}
		if (N % 2 == 0 && 2 <= N && N <= 5) {
			System.out.println("Sol");
		}
		if (N % 2 == 0 && 6 <= N && N <= 20) {
			System.out.println("Tierra");
		}
		if (N % 2 == 0 && N > 20) {
			System.out.println("Galaxia");
		} else {
			System.out.println("Error");
		}
		scanner.close();

	}

}
