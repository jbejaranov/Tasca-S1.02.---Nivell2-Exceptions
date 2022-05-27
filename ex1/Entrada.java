package ex1;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.lang.Exception;

public class Entrada {
	public static void main(String[] args) {

//Byte
		byte numByte = llegirByte("Introdueix un número byte: ");
// Int
		int numInt = llegirInt("Introdueix un número enter: ");
// Float
		float numFloat = llegirFloat("Introdueix un número float: ");
// Double		
		double numDouble = llegirDouble("Introdueix un número double: ");
// Char		
		char numChar = llegirChar("Introdueix un char: ");
// String		
		String numString = llegirString("Introdueix un número en String: ");
// Boolean		
		boolean siNoBoolean = llegirSiNo("introdueix “s” Sí() o “n” (No): ");
	}

//Metodes classe InputMismatchException
	public static byte llegirByte(String missatge) {
		Scanner scan = new Scanner(System.in);
		byte numByte = 0;
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				numByte = scan.nextByte();
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}
		} while (!correcte);
		System.out.println("El valor introduït es: " + numByte);
		return numByte;
	}

	public static int llegirInt(String missatge) {
		Scanner scan = new Scanner(System.in);
		int numInt = 0;
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				numInt = scan.nextInt();
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}

		} while (!correcte);
		System.out.println("El valor introduït es: " + numInt);
		return numInt;
	}

	public static float llegirFloat(String missatge) {
		Scanner scan = new Scanner(System.in);
		float numFloat = 0;
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				numFloat = scan.nextFloat();
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}
		} while (!correcte);
		System.out.println("El valor introduït es: " + numFloat);
		return numFloat;
	}

	public static double llegirDouble(String missatge) {
		Scanner scan = new Scanner(System.in);
		double numDouble = 0;
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				numDouble = scan.nextDouble();
				correcte = true;
			} catch (InputMismatchException ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}
		} while (!correcte);
		System.out.println("El valor introduït es: " + numDouble);
		return numDouble;
	}

//Metodes classe Exception
	public static char llegirChar(String missatge) {
		Scanner scan = new Scanner(System.in);
		char numChar = 'A';

		boolean correcte = false;

		do {
			try {
				System.out.println(missatge);
				numChar = scan.next().charAt(0);
				correcte = true;
			} catch (Exception ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}
		} while (!correcte);
		System.out.println("El valor introduït es: " + numChar);
		return numChar;
	}

	public static String llegirString(String missatge) {
		Scanner scan = new Scanner(System.in);
		String numString = "";
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				numString = scan.nextLine();
				correcte = true;
			} catch (Exception ex) {
				System.out.println("Error de format.");
			}
		} while (!correcte);
		System.out.println("El valor introduït es: " + numString);

		return numString;
	}

	public static boolean llegirSiNo(String missatge) {
		Scanner scan = new Scanner(System.in);
		boolean siNoBoolean = false;
		char siNoBooleanChar = 'n';
		boolean correcte = false;
		do {
			try {
				System.out.println(missatge);
				siNoBooleanChar = scan.next().charAt(0);

				if (siNoBooleanChar == 's') {
					siNoBoolean = true;
					correcte = true;
				} else if (siNoBooleanChar == 'n') {
					siNoBoolean = false;
					correcte = true;
				}

			} catch (Exception ex) {
				System.out.println("Error de format.");
				scan.nextLine();
			}
		} while (!correcte);

		System.out.println("El valor introduït es: " + siNoBoolean);
		return siNoBoolean;
	}

}