//Escriba un programa que pida al usuario que escriba su nombre, y lo salude llamándolo por su nombre.

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");

		Float name = input.nextFloat();
	
		System.out.println("Hola, " + name);

	}

}
