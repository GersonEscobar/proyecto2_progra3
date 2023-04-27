package matrices;

import java.util.ArrayList;
import java.util.List;

public class Inicio {

	public static void main(String[] args) {
		
		Matriz matriz = new Matriz();
		insertarNodo(matriz);
	    buscarNodo(matriz);
	    eliminarNodo(matriz);
	    
	  	  
	   
	}
	 
	public static void insertarNodo(Matriz matriz) {
		 
		
		 
		System.out.println("Iniciando metodo insertar...");		
			
		matriz.insertar("FBC123", "Rojo", "Sedán", 2018, "Gerson Escobar");
		matriz.insertar("DEF456", "Azul", "Camioneta", 2020, "Marco Tohom");
		matriz.insertar("GHI789", "Verde", "Hatchback", 2021, "kevin Cruz");
		matriz.insertar("JKL012", "Negro", "SUV", 2019, "Vani Alcantara");
		matriz.insertar("MNO345", "Rojo", "Sedán", 2022, "Jose Gonzalez");
		matriz.insertar("PQR678", "Verde", "Hatchback", 2021, "Sofia Hernandez");    
		   
	}
	
	
	public static void eliminarNodo(Matriz matriz) {
		
		System.out.println("");
		
		System.out.println("Iniciando metodo eliminar...");
			  
		matriz.eliminar(null, "Rojo", null, -1, null);
		
		
	  	    	
	}

	
	public static void buscarNodo(Matriz matriz) {
		
		System.out.println("");
		System.out.println("Iniciando el metodo buscar...");
		System.out.println("Buscando resultados...");
		
		List<Nodo> resultados = new ArrayList<>();

		resultados.addAll(matriz.buscar(null, "Rojo", null, -1,null));



		System.out.println("Se encontraron " + resultados.size() + " resultados:");
		  	    
		for (Nodo resultado : resultados) {
			System.out.println("Placa: " + resultado.placa + ", Color: " + resultado.color + ", Línea: " + resultado.linea + ", Modelo: " + resultado.modelo + ", Propietario: " + resultado.propietario);
		}
	}

}






