package ejerciciosbasicos;

import java.util.Scanner;

public class DatosUsuario {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc= new Scanner(System.in);
		String nombre, direccion;
		int num;
		System.out.println("Introduzca su nombre");
		nombre=sc.next();
		System.out.println("Introduzca su dirección");
		direccion= sc.nextLine();
		System.out.println("Introduzca su teléfono");
		num= sc.nextInt();
		System.out.println("Nombre: "+ nombre);
		System.out.println("dirección: "+ direccion);
		System.out.println("Teléfono: "+ num);
	}

}
