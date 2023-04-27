package matrices;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Matriz {
    Nodo raiz;
   


    public Matriz() {
        this.raiz = null;
     

    }

  
    
    
    public void insertar(String placa, String color, String linea, int modelo, String propietario) {
        

    	Nodo nuevo = new Nodo(placa, color, linea, modelo, propietario);

       System.out.println("Nodo agregado: " + nuevo.placa + ", " + nuevo.color + ", " + nuevo.linea + ", " + nuevo.modelo + ", " + nuevo.propietario);

        if (raiz == null) {
            // Si la matriz está vacía el nuevo nodo será la raíz
            raiz = nuevo;
           
        } else {
            // Buscar la posición adecuada para el nuevo nodo
            Nodo actual = raiz;
            Nodo anterior = null;

            System.out.println("Buscando posición para el nuevo nodo...");

            while (actual != null && actual.modelo < modelo) {
                anterior = actual;
                actual = actual.abajo;
                System.out.println("Actual: " + actual);
                System.out.println("Anterior: " + anterior);
            }
            
            System.out.println("Se encontró la posición adecuada para el modelo...");


            while (actual != null && actual.linea.compareTo(nuevo.linea) < 0) {
                anterior = actual;
                actual = actual.derecha;
                System.out.println("Actual: " + actual);
                System.out.println("Anterior: " + anterior);
            }
            
            System.out.println("Se encontró la posición adecuada para la línea...");

            
            //No permite valores duplicados
            if (actual != null && actual.modelo == modelo && actual.linea.equals(nuevo.linea) && actual.color.equals(nuevo.color) && actual.placa.equals(nuevo.placa)) {
                System.out.println("El nodo ya existe en la matriz");
                return;
            }
            /**/
            
            System.out.println("Posición encontrada: " + anterior + ", " + actual);

            
            //
            if (anterior == null) {
                raiz = nuevo;
            } else if (anterior.abajo == null) {
                anterior.abajo = nuevo;
                nuevo.arriba = anterior;
            } else {
                nuevo.abajo = actual;
                actual.arriba = nuevo;
                nuevo.arriba = anterior;
                anterior.abajo = nuevo;
            }

            System.out.println("Nodo agregado en la dirección vertical...");

            
            //            
            if (anterior == null) {
                raiz = nuevo;
            } else if (anterior.derecha == null) {
                anterior.derecha = nuevo;
                nuevo.izquierda = anterior;
            } else {
                nuevo.derecha = actual;
                actual.izquierda = nuevo;
                nuevo.izquierda = anterior;
                anterior.derecha = nuevo;
            }

           
            System.out.println("Nodo agregado en la dirección horizontal...");
            
            System.out.println("--------------------------");

            
        }
    }
    
    
    public List<Nodo> buscar(String placa, String color, String linea, int modelo, String propietario) {
        List<Nodo> resultados = new ArrayList<>();
        Set<Nodo> nodosAgregados = new HashSet<>();

        Nodo actual = raiz;
        while (actual != null) {
            Nodo temp = actual;
            while (temp != null) {
                if ((placa == null || temp.placa.equals(placa))
                        && (color == null || temp.color.equals(color))
                        && (linea == null || temp.linea.equals(linea))
                        && (modelo == -1 || temp.modelo == modelo)
                        && (propietario == null || temp.propietario.equals(propietario))) {
                    if (!nodosAgregados.contains(temp)) {
                        resultados.add(temp);
                        nodosAgregados.add(temp);
                       

                    }
                }
                temp = temp.derecha;
            }
            actual = actual.abajo;
        }

        return resultados;
    }


    public void eliminar(String placa, String color, String linea, int modelo, String propietario) {
        List<Nodo> nodosAEliminar = buscar(placa, color, linea, modelo, propietario);
        if (nodosAEliminar.isEmpty()) {
            System.out.println("No se encontraron nodos para eliminar");
            return;
        }
        for (Nodo nodoActual : nodosAEliminar) {
            String placaEliminada = nodoActual.placa; 

            Nodo nodoArriba = nodoActual.arriba;
            Nodo nodoAbajo = nodoActual.abajo;
            Nodo nodoIzquierda = nodoActual.izquierda;
            Nodo nodoDerecha = nodoActual.derecha;

            if (nodoArriba != null) {
                nodoArriba.abajo = nodoAbajo;
            }
            if (nodoAbajo != null) {
                nodoAbajo.arriba = nodoArriba;
            }
            if (nodoIzquierda != null) {
                nodoIzquierda.derecha = nodoDerecha;
            }
            if (nodoDerecha != null) {
                nodoDerecha.izquierda = nodoIzquierda;
            }

            if (nodoActual == raiz) {
                raiz = nodoActual.derecha != null ? nodoActual.derecha : nodoActual.abajo;
            }

            nodoActual = null;
            
            System.out.println("Se eliminó correctamente la placa " + placaEliminada); 

        }
        
        System.out.println("Se han eliminado " + nodosAEliminar.size() + " nodos");

    }
    
    




}


