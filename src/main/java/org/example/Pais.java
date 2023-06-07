package org.example;

public class Pais {
    private String nombre;
    private String capital;
    private int poblacion;
    private String idioma;

    public Pais() {
        this.nombre = "";
        this.capital = "";
        this.poblacion = 0;
        this.idioma = "";
    }

    public Pais(String nombre, String capital, int poblacion, String idioma) {
        this.nombre = nombre;
        this.capital = capital;
        this.poblacion = poblacion;
        this.idioma = idioma;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCapital() {
        return this.capital;
    }

    public void setCapital(String capital) {
        this.capital = capital;
    }

    public int getPoblacion() {
        return this.poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    public String getIdioma() {
        return this.idioma;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public String toString() {
        return "Pais{nombre='" + this.nombre + "', capital='" + this.capital + "', poblacion=" + this.poblacion + ", idioma='" + this.idioma + "'}";
    }

    public void emigracion() {
        this.poblacion -= 45000;
        System.out.println(this.nombre + " Abandonan el Pais por una mejor situacion\n Ahora su poblacion es de: " + this.poblacion);
    }

    public void visitantes() {
        this.poblacion += 1500;
        System.out.println(this.nombre + " Llegan de vacaciones turistas\n Su poblacion ahora es de: " + this.poblacion);
    }
}
