package ejerciciosbasicos;

import java.util.Scanner;

public class Operaciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba dos números");
		int a= sc.nextInt(), b=sc.nextInt();
		System.out.println("La suma de los dos números es " + (a+b));
		System.out.println("La resta de los dos números es " + (a-b));
		System.out.println("La multiplicación de los dos números es " + (a*b));
		System.out.println("La división de los dos números es " + (a/b));
		
	}

}
