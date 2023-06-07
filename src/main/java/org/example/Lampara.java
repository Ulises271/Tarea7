package org.example;

public class Lampara {
    private String marca;
    private int watts;
    private boolean encendida;

    public Lampara() {
        this.marca = "Sin marca";
        this.watts = 0;
        this.encendida = false;
    }

    public Lampara(String marca, int watts) {
        this.marca = marca;
        this.watts = watts;
        this.encendida = false;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getWatts() {
        return this.watts;
    }

    public void setWatts(int watts) {
        this.watts = watts;
    }

    public boolean isEncendida() {
        return this.encendida;
    }

    public void encender() {
        this.encendida = true;
    }

    public void apagar() {
        this.encendida = false;
    }

    public String toString() {
        return "Lampara{marca='" + this.marca + "', watts=" + this.watts + ", encendida=" + this.encendida + "}";
    }

    public void aumentarWatts(int watts) {
        this.watts += watts;
        System.out.println("Se ha aumentado la potencia de la lámpara en " + watts + " watts. Nueva potencia: " + this.watts + " watts.");
    }

    public void disminuirWatts(int watts) {
        this.watts -= watts;
        System.out.println("Se ha disminuido la potencia de la lámpara en " + watts + " watts. Nueva potencia: " + this.watts + " watts.");
    }
}
