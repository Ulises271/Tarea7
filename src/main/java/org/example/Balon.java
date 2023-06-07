package org.example;

public class Balon {
    private String marca;
    private String color;
    private double diametro;

    public Balon() {
        this.marca = "";
        this.color = "";
        this.diametro = 0.0;
    }

    public Balon(String marca, String color, double diametro) {
        this.marca = marca;
        this.color = color;
        this.diametro = diametro;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getColor() {
        return this.color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getDiametro() {
        return this.diametro;
    }

    public void setDiametro(double diametro) {
        this.diametro = diametro;
    }

    public String toString() {
        return "Balon{marca='" + this.marca + "', color='" + this.color + "', diametro=" + this.diametro + "}";
    }

    public void desinflar() {
        System.out.println("El balón ha sido desinflado");
    }

    public void inflar() {
        System.out.println("El balón ha sido inflado");
    }
}
