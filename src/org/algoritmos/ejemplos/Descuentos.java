package org.algoritmos.ejemplos;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * En una tienda se ha establecido la siguiente oferta: por compras menores a 50 soles se hace un descuento de 8%, 
 * pero para compras a partir de 50 el descuento es de 10%. Se pide ingresar la cantidad 
 * y el precio del producto que se compra y determinar cuanto se descontará y cuanto se cobrará.
 */
public class Descuentos {
	  public static void main(String[] args) {
		  Scanner consola=new Scanner(System.in);
		  System.out.println("ingresar cantidad y después ingrese el valor de cada producto: ");
		  try {
		    System.out.println(validaDescuento(consola.nextInt(), consola.nextInt()));
		  }catch(InputMismatchException ex) {
		    System.out.println("no ingresó un número");
		  }
		  consola.close();
	  }

	private static String validaDescuento(final int cantidad, final int valor) {
		int pago = cantidad * valor;	
		final String regreso = "Se compraron %d piezas con valor de %d c/u, por un total de %d. "
				+ "\nEl valor a descontar es: %.2f y a pagar: $%.2f";
		double desc = 0;
		if (pago < 50) {
			desc = (8.0/100.0) * Long.valueOf(pago);	
			return String.format(regreso, cantidad, valor,(cantidad * valor), desc, ( Long.valueOf(pago) - desc));
		}else {
			desc = (10.0/100.0) * Long.valueOf(pago);
			return String.format(regreso, cantidad, valor,(cantidad * valor), desc, ( Long.valueOf(pago) - desc));
		}
	}
}

