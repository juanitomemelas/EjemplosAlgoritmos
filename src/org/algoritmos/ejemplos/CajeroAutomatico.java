package org.algoritmos.ejemplos;

import java.util.Scanner;

public class CajeroAutomatico {
/*
 * Diseñe un algoritmo para un cajero automático.
 * El cajero tiene la particularidad de dar solamente billetes de 500, 200, 100, 50, y 20. 
 * Si el usuario ingresa una cantidad menor a 1500 que desea retirar, debe arrojarle la cantidad mínima de billetes de cada tipo.
 * NOTA: No debe dar billetes de 10 soles, POR EJEMPLO, si se le ingresa un monto de 510, debe arrojarme:
 * Billetes de 200: 2
 * Billetes de 50: 1
 * Billetes de 20: 3
 */
	public static void main(String[] args) {
		Scanner consola=new Scanner(System.in);
		System.out.println("ingrese la cantidad a retirar");
		System.out.println(regresaEfectivo(consola.nextInt()));
		consola.close();

	}

private static String regresaEfectivo(int valor) {
	// TODO Auto-generated method stub
	return "";
}



}
