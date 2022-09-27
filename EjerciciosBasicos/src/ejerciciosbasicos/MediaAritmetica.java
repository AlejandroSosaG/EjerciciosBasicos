package ejerciciosbasicos;

import java.util.Scanner;

public class MediaAritmetica {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba dos notas enteras");
		double a= sc.nextDouble(), b = sc.nextDouble();
		System.out.println("La media aritmetica es " + ((a+b)/2));
		
	}

}
