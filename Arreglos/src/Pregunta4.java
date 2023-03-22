


public class Pregunta4 {
	 public static void main(String[] args) {
		    
		    
		    String[][] matriz = {
		        {"Juan", "María", "Pedro"},
		        {"Lucía", "Ana", "Carla"},
		        {"José", "Sara", "Luis"}
		    };
		    
		   
		    matriz[1][2] = "Mario";
		    
		   
		    for (int i = 0; i < matriz.length; i++) {
		      for (int j = 0; j < matriz[i].length; j++) {
		        System.out.println("numero de fila y columna en la tabla [" + i + "][" + j + "] = " + matriz[i][j]);
		      }
		    }
		  }
		}
		






