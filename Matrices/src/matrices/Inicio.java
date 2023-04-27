package matrices;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Inicio {

    public static void main(String[] args) {

        Matriz matriz = new Matriz();

        menu(matriz);

    }

    public static void menu(Matriz matriz) {

        Scanner scanner = new Scanner(System.in);
        int opcion = 0;
        System.out.println("iniciando menú...");
        System.out.println("1. Insertar");
        System.out.println("2. Buscar");
        System.out.println("3. Eliminar");
        System.out.println("Elija una opción:");
        opcion = scanner.nextInt();


        if(opcion==1){
        insertarNodo(matriz);
        }else if(opcion==2) {
        buscarNodo(matriz);
        }else if (opcion==3) {
        eliminarNodo(matriz);
        }
    }

    public static void insertarNodo(Matriz matriz) {

        Scanner scanner = new Scanner(System.in);
        String respuesta = "";
        System.out.println("Iniciando metodo insertar...");

        do {
            System.out.println("Ingrese el número de placa del vehículo:");
            String placa = scanner.nextLine();

            System.out.println("Ingrese el color del vehículo:");
            String color = scanner.nextLine();

            System.out.println("Ingrese la linea de vehículo:");
            String linea = scanner.nextLine();

            System.out.println("Ingrese el modelo del vehículo:");
            int modelo = scanner.nextInt();
            scanner.nextLine();

            System.out.println("Ingrese el nombre del propietario del vehículo:");
            String propietario = scanner.nextLine();

            matriz.insertar(placa, color, linea, modelo, propietario);

            System.out.println("¿Desea ingresar otro vehículo? (s/n)");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        if (respuesta.equalsIgnoreCase("n")) {
            menu(matriz);
        }
    }

    public static void buscarNodo(Matriz matriz) {

        Scanner scanner = new Scanner(System.in);
        int modelo = 0;
        String respuesta = "";
        String placa = "", color = "", linea = "", propietario = "";
        String entradaPlaca = "", entradaColor = "", entradaLinea = "", entradaModelo, entradaPropietario = "";

        System.out.println("");
        System.out.println("Iniciando el metodo buscar...");
        System.out.println("Busque por cualquier valor");

        do {

            List<Nodo> resultados = new ArrayList<>();

            System.out.println("Ingrese el número de placa del vehículo:");
            entradaPlaca = scanner.nextLine();

            if (entradaPlaca == null || entradaPlaca == "") {
                placa = null;
            } else {
                placa = entradaPlaca;
            }

            System.out.println("Ingrese el color del vehículo:");
            entradaColor = scanner.nextLine();

            if (entradaColor == null || entradaColor == "") {
                color = null;
            } else {
                color = entradaColor;
            }

            System.out.println("Ingrese la linea de vehículo:");
            entradaLinea = scanner.nextLine();

            if (entradaLinea == null || entradaLinea == "") {
                linea = null;
            } else {
                linea = entradaLinea;
            }

            System.out.println("Ingrese el modelo del vehículo:");
            entradaModelo = scanner.nextLine();

            if (entradaModelo == null || entradaModelo == "") {
                modelo = -1;
            } else {
                modelo = Integer.parseInt(entradaModelo);
            }

            System.out.println("Ingrese el nombre del propietario del vehículo:");
            entradaPropietario = scanner.nextLine();

            if (entradaPropietario == null || entradaPropietario == "") {
                propietario = null;
            } else {
                propietario = entradaPropietario;
            }

            resultados.addAll(matriz.buscar(placa, color, linea, modelo, propietario));

            System.out.println("Se encontraron " + resultados.size() + " resultados:");

            for (Nodo resultado : resultados) {
                System.out.println("Placa: " + resultado.placa + ", Color: " + resultado.color + ", Línea: " + resultado.linea + ", Modelo: " + resultado.modelo + ", Propietario: " + resultado.propietario);
            }

            System.out.println("¿Desea buscar otro vehículo? (s/n)");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        if (respuesta.equalsIgnoreCase("n")) {
            menu(matriz);
        }
    }

    public static void eliminarNodo(Matriz matriz) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("");

        System.out.println("Iniciando metodo eliminar...");
        System.out.println("Elimine por cualquier valor");

        int modelo = 0;
        String respuesta = "";
        String placa = "", color = "", linea = "", propietario = "";
        String entradaPlaca = "", entradaColor = "", entradaLinea = "", entradaModelo, entradaPropietario = "";

        do {

            System.out.println("Ingrese el número de placa del vehículo:");

            entradaPlaca = scanner.nextLine();

            if (entradaPlaca == null || entradaPlaca == "") {
                placa = null;
            } else {
                placa = entradaPlaca;
            }

            System.out.println("Ingrese el color del vehículo:");
            entradaColor = scanner.nextLine();

            if (entradaColor == null || entradaColor == "") {
                color = null;
            } else {
                color = entradaColor;
            }

            System.out.println("Ingrese la linea de vehículo:");
            entradaLinea = scanner.nextLine();

            if (entradaLinea == null || entradaLinea == "") {
                linea = null;
            } else {
                linea = entradaLinea;
            }

            System.out.println("Ingrese el modelo del vehículo:");
            entradaModelo = scanner.nextLine();

            if (entradaModelo == null || entradaModelo == "") {
                modelo = -1;
            } else {
                modelo = Integer.parseInt(entradaModelo);
            }

            System.out.println("Ingrese el nombre del propietario del vehículo:");
            entradaPropietario = scanner.nextLine();

            if (entradaPropietario == null || entradaPropietario == "") {
                propietario = null;
            } else {
                propietario = entradaPropietario;
            }

            matriz.eliminar(placa, color, linea, modelo, propietario);

            System.out.println("¿Desea eliminar otro vehículo? (s/n)");
            respuesta = scanner.nextLine();

        } while (respuesta.equalsIgnoreCase("s"));

        if (respuesta.equalsIgnoreCase("n")) {
            menu(matriz);
        }
    }

}






