/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author santi
 */

public class Libro {
    private String titulo;
    private String autor;
    private int numEjemplares;
    private int numEjemplaresPrestados;


    public Libro() {
    }


    public Libro(String titulo, String autor, int numEjemplares) {
        this.titulo = titulo;
        this.autor = autor;
        this.numEjemplares = numEjemplares;
        this.numEjemplaresPrestados = 0;
    }


    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setNumEjemplares(int numEjemplares) {
        this.numEjemplares = numEjemplares;
    }

    public void setNumEjemplaresPrestados(int numEjemplaresPrestados) {
        this.numEjemplaresPrestados = numEjemplaresPrestados;
    }


    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public int getNumEjemplares() {
        return numEjemplares;
    }

    public int getNumEjemplaresPrestados() {
        return numEjemplaresPrestados;
    }


    public boolean prestar() {
        if (numEjemplares - numEjemplaresPrestados > 0) {
            numEjemplaresPrestados++;
            return true;
        } else {
            return false;
        }
    }

    public boolean devolver() {
        if (numEjemplaresPrestados > 0) {
            numEjemplaresPrestados--;
            return true;
        } else {
            return false;
        }
    }
}
