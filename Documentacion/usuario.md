# Documentación de Usuario

El código proporcionado es una implementación de una matriz de nodos, la cual es una estructura de datos que organiza y almacena datos en forma de una tabla. En este caso, los nodos representan vehículos y se almacenan en la matriz según su modelo, línea y propietario.

La clase Nodo tiene las siguientes propiedades:

- placa: la placa del vehículo (cadena de caracteres)

- color: el color del vehículo (cadena de caracteres)

- linea: la línea del vehículo (cadena de caracteres)

- modelo: el modelo del vehículo (entero)

- propietario: el nombre del propietario del vehículo (cadena de caracteres)

- arriba: el nodo que está arriba del nodo actual en la matriz (puntero a otro Nodo)

- abajo: el nodo que está abajo del nodo actual en la matriz (puntero a otro Nodo)

- izquierda: el nodo que está a la izquierda del nodo actual en la matriz (puntero a otro Nodo)

- derecha: el nodo que está a la derecha del nodo actual en la matriz (puntero a otro Nodo)

La clase Matriz tiene las siguientes propiedades:

- raiz: el nodo raíz de la matriz (puntero a un Nodo)

La clase Matriz tiene los siguientes métodos:

- Matriz(): el constructor de la clase Matriz que inicializa la raíz en null.
  
- insertar(String placa, String color, String linea, int modelo, String propietario): este método permite insertar un nuevo nodo en la matriz, representando un nuevo vehículo. Los parámetros son la placa, color, línea, modelo y propietario del vehículo. Si la matriz está vacía, el nuevo nodo se convierte en la raíz. De lo contrario, el método busca la posición adecuada para el nuevo nodo y lo agrega. No se permiten valores duplicados.

- buscar(String placa, String color, String linea, int modelo, String propietario): este método busca nodos en la matriz que coincidan con los parámetros especificados. Los parámetros son opcionales, por lo que se pueden omitir. Si se omite un parámetro, se ignorará en la búsqueda. El método devuelve una lista de nodos que coinciden con los parámetros especificados.

- eliminar(String placa, String color, String linea, int modelo, String propietario): este método elimina los nodos de la matriz que coinciden con los parámetros especificados. Los parámetros son opcionales, por lo que se pueden omitir. Si se omite un parámetro, se ignorará en la búsqueda. El método devuelve un mensaje si no se encontraron nodos para eliminar. Si se eliminan nodos, se imprimirá la placa del vehículo eliminado.

Es importante tener en cuenta que el código es sensible a mayúsculas y minúsculas en los valores de cadena de caracteres. Además, es importante asegurarse de que los parámetros se pasen en el orden correcto.

