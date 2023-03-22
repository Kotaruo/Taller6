import java.util.Scanner;

public class Pruebas {
	public static void main(String[] args) {
		 Scanner entrada = new Scanner(System.in);
	        
	       
	        int[] resultados = new int[5];
	        
	        // Pedir al usuario que ingrese los resultados de las pruebas
	        System.out.println("Ingrese los resultados de las 5 pruebas:");
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Prueba " + (i + 1) + ": ");
	            resultados[i] = entrada.nextInt();
	        }
	        
	        // Calcular el promedio de los estudiantes
	        int suma = 0;
	        for (int i = 0; i < 5; i++) {
	            suma += resultados[i];
	        }
	        double promedio = (double) suma / 5;
	        
	       
	        System.out.printf("El promedio de los estudiantes es: %.2f", promedio);
	    }
	
	
	
}

