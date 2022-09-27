package ejerciciosbasicos;

import java.util.Scanner;

public class PesetasEuro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.println("Introduzca el valor en pesetas");
		double pesetas= s.nextDouble(), euros=(pesetas*0.0060);
		System.out.println("El valor en euros es " + euros);
	}

}
