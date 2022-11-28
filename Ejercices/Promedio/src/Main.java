//Escriba un programa que calcule el promedio de 4 notas ingresadas por el usuario

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Se solicitan y declaran las variables
		System.out.println("Ingrese la primer nota: ");
		String a = input.next();
		Float afloat = Float.parseFloat(a);
		
		System.out.println("Ingrese la segunda nota: ");
		String b = input.next();
		Float bfloat = Float.parseFloat(b);
		
		System.out.println("Ingrese la tercera nota: ");
		String c = input.next();
		Float cfloat = Float.parseFloat(c);
		
		System.out.println("Ingrese la cuarta nota: ");
		String d = input.next();
		Float dfloat = Float.parseFloat(d);
		
		//Se realiza la operacion para encontrar el promedio
		Float average = (afloat + bfloat + cfloat + dfloat) / 4;
		
		//Se muestra en pantalla el promedio que se obtuvo
		System.out.println("El promedio es: " + average);
	}

}
