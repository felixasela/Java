//Escriba un programa que pida al usuario un entero y entregue el número con los dígitos en orden inverso

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		//Se solicita el numero a invertir
		System.out.println("Ingrese un numero entero: ");
		Integer number = input.nextInt();
		//Se inicializa la variable invertido que inicia en 0
		Integer inverted = 0;
		
		//Se genera un clico que mientras el numero sea mayor a 0 se ejecutara
		while ( number > 0 ) {
			//Se raliza la operacion para invertir el numero
			inverted = (inverted * 10) + number % 10;;
			number /= 10;
			
		}
		
		//Se imprime el numero en pantalla
		System.out.println("El numero invertido es: " + inverted);
		
	}

}
