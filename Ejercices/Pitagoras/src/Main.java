//Escriba un programa que reciba como entrada las longitudes de los dos catetos a y b de un triángulo rectángulo, y que entregue como salida el largo de la hipotenusa c del triangulo, dado por el teorema de Pitágoras
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Ingrese el cateto a: ");
		String a = input.next();
		Float legs_a = Float.parseFloat(a);
		
		System.out.println("Ingrese el cateto b: ");
		String b = input.next();
		Float legs_b = Float.parseFloat(b);
		
		Float legs_addition = (float)Math.pow(legs_a, 2) + (float)Math.pow(legs_b, 2);
		Float hypotenuse = (float)Math.sqrt(legs_addition);
		
		System.out.println("El valor de la hipotenusa es: " + hypotenuse);
		
	}

}
