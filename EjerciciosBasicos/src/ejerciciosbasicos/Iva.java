package ejerciciosbasicos;

import java.util.Scanner;

public class Iva {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el valor del precio");
		double iva=21, precio=s.nextDouble();
		System.out.println("El valor del precio con IVA es " + (precio*iva/100));
	}

}
