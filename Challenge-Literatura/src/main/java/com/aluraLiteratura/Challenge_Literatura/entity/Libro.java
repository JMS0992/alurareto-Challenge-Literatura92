package com.aluraLiteratura.Challenge_Literatura.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Libro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String titulo;
    private String autor;
    private String idioma;
    private int descargas;

    // Constructores
    public Libro() {}

    public Libro(String titulo, String autor, String idioma, int descargas) {
        this.titulo = titulo;
        this.autor = autor;
        this.idioma = idioma;
        this.descargas = descargas;
    }

    // Getters
    public Long getId() {
        return id;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getAutor() {
        return autor;
    }

    public String getIdioma() {
        return idioma;
    }

    public int getDescargas() {
        return descargas;
    }

    // Setters
    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public void setIdioma(String idioma) {
        this.idioma = idioma;
    }

    public void setDescargas(int descargas) {
        this.descargas = descargas;
    }

    // Método toString para mostrar los datos de forma legible
    @Override
    public String toString() {
        return ""+
                "titulo='" + titulo + '\'' +
                ", autor='" + autor + '\'' +
                ", idioma='" + idioma + '\'' +
                ", descargas=" + descargas +
                '"';
    }
}
