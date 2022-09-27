package ejerciciosbasicos;

import java.util.Scanner;

public class Mensaje {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		String nombre;
		int edad;
		System.out.println("Introduzca su nombre");
		nombre=s.next();
		System.out.println("Introduzca su edad");
		edad= s.nextInt();
		System.out.println("Hola "+ nombre + ", tienes " + edad + " años, ¡qué mayor eres!");
	}

}
