

public class Pregunta3 {
	public static void main(String[] args) {
	    
	    
	    int[][] matriz = {
	        {1, 2, 3},
	        {4, 5, 6},
	        {7, 8, 9}
	    };
	    
	   
	    matriz[1][2] = 10;
	    
	    
	    for (int i = 0; i < matriz.length; i++) {
	      for (int j = 0; j < matriz[i].length; j++) {
	        System.out.println("orden de tabla [" + i + "][" + j + "] = " + matriz[i][j]);
	      }
	    }
	  }
	}
	






