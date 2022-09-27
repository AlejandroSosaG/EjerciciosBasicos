package ejerciciosbasicos;

import java.util.Scanner;

public class Circunferencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba el radio de la circunferencia");
		double radio= sc.nextDouble();
		System.out.println("La longitud de la circunferencia es " + (2*Math.PI*radio));
		System.out.println("El area de la circunferencia es " + (Math.PI*radio*radio));
	}

}
