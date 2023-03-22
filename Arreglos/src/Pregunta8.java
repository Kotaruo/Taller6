


import java.util.Scanner;

public class Pregunta8 {
	 public static void main(String[] args) {
	        Scanner entrada = new Scanner(System.in);

	        int n;
	        System.out.print("Ingrese la cantidad de números que desea sumar: ");
	        n = entrada.nextInt();

	        int[] numeros = new int[n];
	        int suma = 0;

	        for (int i = 0; i < n; i++) {
	            System.out.print("Ingrese el número " + (i+1) + ": ");
	            numeros[i] = entrada.nextInt();
	            suma += numeros[i];
	        }

	        System.out.println("La suma de los números ingresados es: " + suma);
	    }
	}
	






