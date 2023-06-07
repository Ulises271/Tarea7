package org.example;

import java.util.Arrays;

public class CuboRubik {
    private String marca;
    private int tamanio;
    private String[] caras;

    public CuboRubik() {
        this.marca = "";
        this.tamanio = 0;
        this.caras = new String[]{"blanco", "rojo", "azul", "naranja", "verde", "amarillo"};
    }

    public CuboRubik(String marca, int tamanio) {
        this.marca = marca;
        this.tamanio = tamanio;
        this.caras = new String[]{"blanco", "rojo", "azul", "naranja", "verde", "amarillo"};
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public int getTamanio() {
        return this.tamanio;
    }

    public void setTamanio(int tamano) {
        this.tamanio = tamano;
    }

    public String[] getCaras() {
        return this.caras;
    }

    public String toString() {
        String var10000 = this.marca;
        return "cuboRubik{marca='" + var10000 + "', tamanio=" + this.tamanio + ", caras=" + Arrays.toString(this.caras) + "}";
    }

    public void mezclar() {
        System.out.println("Mezclando el cubo Rubik de " + this.marca);
    }

    public boolean estaResuelto() {
        System.out.println("false");
        return false;
    }
}
