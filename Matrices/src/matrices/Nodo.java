package matrices;

public class Nodo {
    String placa;
    String color;
    String linea;
    int modelo;
    String propietario;
    Nodo arriba;
    Nodo abajo;
    Nodo izquierda;
    Nodo derecha;

    public Nodo(String placa, String color, String linea, int modelo, String propietario) {
        this.placa = placa;
        this.color = color;
        this.linea = linea;
        this.modelo = modelo;
        this.propietario = propietario;
        this.arriba = null;
        this.abajo = null;
        this.izquierda = null;
        this.derecha = null;
    }
}


