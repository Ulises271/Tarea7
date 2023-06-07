package org.example;
import java.awt.Color;

public class Gato {
    private String nombre;
    private String especie;
    private byte edad;
    private Color color;
    private int tamanio;

    public Gato() {
    }

    public Gato(String nombre, String especie, byte edad, Color color, int tamanio) {
        this.nombre = nombre;
        this.especie = especie;
        this.edad = edad;
        this.color = color;
        this.tamanio = tamanio;
    }

    public Gato(String nombre, String especie) {
        this.nombre = nombre;
        this.especie = especie;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEspecie() {
        return this.especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public byte getEdad() {
        return this.edad;
    }

    public void setEdad(byte edad) {
        this.edad = edad;
    }

    public Color getColor() {
        return this.color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamanio) {
        this.tamanio = tamanio;
    }

    public String toString() {
        return "gato{nombre='" + this.nombre + "', especie='" + this.especie + "', edad=" + this.edad + ", color=" + this.color + ", tamanio=" + this.tamanio + "}";
    }

    public boolean comer() {
        System.out.println("¿El gato esta comiendo?...");
        boolean resultado = Math.random() > 0.3;
        return resultado;
    }

    public boolean dormir() {
        System.out.println("¿El gato durmio?...");
        boolean resultado = Math.random() > 0.5;
        return resultado;
    }

    public boolean araniar() {
        System.out.println("¿El gato aranio?...");
        boolean resultado = Math.random() > 0.11;
        return resultado;
    }
}
