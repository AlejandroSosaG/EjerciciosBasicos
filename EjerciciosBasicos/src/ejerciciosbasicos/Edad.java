package ejerciciosbasicos;

import java.util.Scanner;

public class Edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Escriba su edad");
		byte edad= sc.nextByte();
		System.out.println("Su edad el próximo año será " + (edad+1));
	}

}
