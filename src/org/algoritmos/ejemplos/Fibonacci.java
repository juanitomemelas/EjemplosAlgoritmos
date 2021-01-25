package org.algoritmos.ejemplos;

public class Fibonacci {

  public static void main(String[] args) {
    System.out.println("cadena fibonacci");
    long uno = 0;
    long dos = 1;    
    Fibonacci.imprime(uno);
    Fibonacci.imprime(dos);
    while (dos >0){
      uno = uno + dos;
      Fibonacci.imprime(uno);
      dos = uno + dos;
      Fibonacci.imprime(dos);
    }

  }
  private static void imprime(final long valor){
    System.out.println(valor);
    
  }
}
