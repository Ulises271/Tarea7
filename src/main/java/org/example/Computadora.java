package org.example;

public class Computadora {
    private String marca;
    private String modelo;
    private int ram;
    private String estado;

    public Computadora() {
        this.marca = "";
        this.modelo = "";
        this.ram = 0;
        this.estado = "";
    }

    public Computadora(String marca, String modelo, int ram, String estado) {
        this.marca = marca;
        this.modelo = modelo;
        this.ram = ram;
        this.estado = estado;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getRam() {
        return this.ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public String getEstado() {
        return this.estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String toString() {
        return "Computadora{marca='" + this.marca + "', modelo='" + this.modelo + "', ram=" + this.ram + ", estado='" + this.estado + "'}";
    }

    public void encender() {
        this.estado = "Encendida...";
        System.out.println(" El pc se esta encendiendo\n Estado del pc: " + this.estado);
    }

    public void apagar() {
        this.estado = "Apagada...";
        System.out.println(" El pc se apago\n Estado del pc: " + this.estado);
    }

    public void PantallaAzul() {
        this.estado = "loading....";
        System.out.println("El pc dio un pantallazo\n Estado del pc: " + this.estado);
    }
}
