package ejerciciosbasicos;

import java.util.Scanner;

public class Año {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("¿Cúal es el año actual?");
		int añoActual= sc.nextInt();
		System.out.println("¿Cúal es el año de su nacimiento?");
		int añoNac= sc.nextInt();
		System.out.println("Su edad es " + (añoActual-añoNac));
	}

}
