package org.example;

public class Libro {
    private String titulo;
    private String autor;
    private int numerodePaginas;

    public Libro() {
        this.titulo = "";
        this.autor = "";
        this.numerodePaginas = 0;
    }

    public Libro(String titulo, String autor, int numerodePaginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.numerodePaginas = numerodePaginas;
    }

    public String getTitulo() {
        return this.titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return this.autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumerodePaginas() {
        return this.numerodePaginas;
    }

    public void setNumerodePaginas(int numerodePaginas) {
        this.numerodePaginas = numerodePaginas;
    }

    public String toString() {
        return "Libro{titulo='" + this.titulo + "', autor='" + this.autor + "', numerodePaginas=" + this.numerodePaginas + "}";
    }

    public void leer() {
        System.out.println("Leyendo:" + this.titulo);
    }

    public void prestamo() {
        System.out.println("El libro: " + this.titulo + " del autor: " + this.autor + " ha sido prestado.");
    }
}
