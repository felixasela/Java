//Escriba un programa que convierta de centímetros a pulgadas. Una pulgada es igual a 2.54 centímetros

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Se solicitan los datos y se declara las variables con estos datos
		System.out.println("Ingrese una medida en centimetros: ");
		String centimeter = input.next();
		Float centimeterf = Float.parseFloat(centimeter);
		
		//Se convierte el dato ingresado en centimetros a pulgadas
		Float inch = centimeterf * (float)2.54;
		
		//Se muestra en pantalla el resultado
		System.out.print(centimeterf + "cm, Equivalen a = " + inch + " Pulgadas");

	}

}