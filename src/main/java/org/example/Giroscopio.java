package org.example;

public class Giroscopio {
    private String tipo;
    private double resolucion;
    private boolean activado;

    public Giroscopio() {
        this.tipo = "Desconocido";
        this.resolucion = 0.0;
        this.activado = false;
    }

    public Giroscopio(String tipo, double resolucion) {
        this.tipo = tipo;
        this.resolucion = resolucion;
        this.activado = false;
    }

    public String getTipo() {
        return this.tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getResolucion() {
        return this.resolucion;
    }

    public void setResolucion(double resolucion) {
        this.resolucion = resolucion;
    }

    public boolean isActivado() {
        return this.activado;
    }

    public String toString() {
        String estado = this.activado ? "encendido" : "apagado";
        return this.tipo + " (resolución: " + this.resolucion + ", estado: " + estado + ")";
    }

    public void encender() {
        System.out.println("Encendiendo el giroscopio " + this.tipo);
        this.activado = true;
    }

    public void apagar() {
        System.out.println("Apagando el giroscopio " + this.tipo);
        this.activado = false;
    }

    public double obtenerAngulo() {
        return 0.0;
    }
}
