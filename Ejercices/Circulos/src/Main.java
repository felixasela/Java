//Escriba un programa que reciba como entrada el radio de un círculo y entregue como salida su perímetro y su área

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Se usa la clase Scanner para guardar los datos ingresados por el usuario
		Scanner input = new Scanner(System.in);
		
		//Se solicitan los datos al usuario
		System.out.print("Ingrese el radio del circulo: ");
		
		//Se guarda el dato ingresado en la variable radiustr
		String radiustr = input.next();
		
		//Se convierte la variable de tipo String a tipo Float
		Float radius = Float.parseFloat(radiustr);
		
		//Se declara una variable constante pi
		Float pi = (float)3.14;
			
		//Se realizan las operaciones para encontrar el Perimetro y el Area
		Float perimeter = 2 * pi * radius;
		Float area = pi * (float)Math.pow(radius, 2);
		
		//Se imprime en pantalla los resultados de las operaciones anteriores
		System.out.println("Perimetro: " + perimeter);
		System.out.println("Area: " + area);
	}

}
