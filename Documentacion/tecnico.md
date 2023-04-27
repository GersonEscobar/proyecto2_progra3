# Documentación Técnica

### Clase Nodo

 - **Variables:**

      - **placa:** Variable de tipo String que representa la placa del vehículo.
    
      - **color:** Variable de tipo String que representa el color del vehículo.
    
      - **linea:** Variable de tipo String que representa la línea del vehículo.
    
      - **modelo:** Variable de tipo Int que representa el modelo del vehículo.
    
      - **propietario:** Variable de tipo String que representa el propietario del vehículo.

      - **arriba:** Variable de tipo Nodo que representa el nodo ubicado arriba.
  
      - **abajo:** Variable de tipo Nodo que representa el nodo ubicado abajo.
  
      - **izquierda:** Variable de tipo Nodo que representa el nodo ubicado a la izquierda.

      - **derecha:** Variable de tipo Nodo que representa el nodo ubicado a la derecha.

### Clase Matriz:

- **Variables:**

  - **raiz:** Variable de tipo Nodo que representa el nodo raíz de la estructura de datos. En una matriz, la raíz se refiere al primer nodo de la estructura, que no tiene nodos verticalmente ni a la horizontalmente, y a partir del cual se construye la matriz mediante la inserción de nuevos nodos.
   
- **Métodos:** 
  
  - **Insertar:** Método con parámetro que permite insertar un nuevo nodo en una matriz. 
    
    Se crea un nuevo objeto Nodo con los datos del vehículo a insertar (Estos datos son la placa, el color, la linea, el modelo y el propietario que son recibidos a través de un parametro). Si la raíz de la matriz es nula, el nuevo nodo se convierte en la raíz. De lo contrario, se busca la posición adecuada para el nuevo nodo en la matriz. Se hace esto recorriendo la matriz hacia abajo hasta encontrar la fila adecuada según el modelo y luego recorriendo la fila hacia la derecha hasta encontrar la posición adecuada según la línea. 
    
    En cada paso del recorrido se guarda el nodo actual y el nodo anterior. Se verifica si el nodo ya existe en la matriz. Si es así, se muestra un mensaje y se sale del método. Sino, se inserta el nuevo nodo en la matriz. (Si el nodo anterior es nulo, entonces el nuevo nodo se convierte en la raíz. De lo contrario, se agrega el nuevo nodo a la posición adecuada en la dirección vertical y horizontal). Se muestra un mensaje de éxito en la inserción del nuevo nodo.

  - **Buscar:** Método con parámetro que realiza una búsqueda en la matriz.
    
    La busqueda puede ser por placa, color, linea, modelo o propietario que son recibidos a traves de un parámetro, recorriendo sus nodos en orden de izquierda a derecha y de arriba a abajo, verificando si cada nodo cumple con los criterios de búsqueda especificados. 
    
    Si un nodo cumple con los criterios y no ha sido agregado previamente a la lista de resultados, se agrega a dicha lista y se marca como agregado en un conjunto para evitar duplicados.

    Al finalizar el recorrido, se retorna la lista de resultados.

  - **Eliminar:** Método con parámetro que se encarga de remover los nodos de la matriz que cumplan con los criterios especificados por el usuario. 
    
    Recibe como parámetros la placa, color, línea, modelo y propietario del vehículo a eliminar.
    
    El método primero llama al método buscar, que retorna una lista de nodos que coinciden con los criterios de búsqueda especificados. Si la lista está vacía, significa que no se encontraron nodos para eliminar y se imprime un mensaje por consola. En caso contrario, el método itera sobre cada uno de los nodos encontrados y procede a removerlos de la matriz. 
    
    Para cada nodo a eliminar, se guardará la placa en una variable auxiliar para posteriormente imprimir un mensaje que indique cuál placa se eliminó.

    Se actualizan las referencias a los nodos adyacentes del nodo actual que se está eliminando y, en caso de que sea la raíz, se actualiza la referencia a la raíz. Finalmente, se elimina el nodo actual asignándole el valor nulo.

    Después de eliminar los nodos, se imprime un mensaje indicando la cantidad de nodos que se eliminaron.

### Clase Inicio:

La clase Inicio es una clase que contiene el método main y que sirve para iniciar la aplicación. Se utiliza para probar los métodos de la clase Matriz y para verificar su correcto funcionamiento.

- **Métodos:**

  - **Main:** Este método crea una instancia de la clase Matriz y luego llama a los métodos insertarNodo, buscarNodo y eliminarNodo.
 
  - **insertarNodo:** Este método recibe como parámetro una instancia de la clase Matriz. Este método se encarga de llamar al método insertar de la clase Matriz varias veces para insertar nodos en la estructura.

  - **buscarNodo:** Este método recibe como parámetro una instancia de la clase Matriz. Este método se encarga de llamar al método buscar de la clase Matriz para buscar nodos en la estructura. Luego, muestra por consola los resultados obtenidos.
  
  - **eliminarNodo:** Este método recibe como parámetro una instancia de la clase Matriz. Este método se encarga de llamar al método eliminar de la clase Matriz para eliminar nodos de la estructura. En este caso, el método eliminar recibe como argumentos null, "Rojo", null, -1, null para eliminar todos los nodos que sean de color rojo.
