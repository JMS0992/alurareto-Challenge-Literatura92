package com.aluraLiteratura.Challenge_Literatura.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

public class LibroDto {

    private Long id;

    @JsonProperty("title")
    private String titulo;

    // Mapea el primer autor del arreglo de autores
    @JsonProperty("authors")
    private List<AutorDto> autores;

    // Mapea el primer idioma del arreglo de idiomas
    @JsonProperty("languages")
    private List<String> idiomas;

    // Ignora otros formatos en el JSON
    private int paginas; // Cambia según cómo obtengas este dato (no está en JSON)

    // Getters y setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public List<AutorDto> getAutores() {
        return autores;
    }

    public void setAutores(List<AutorDto> autores) {
        this.autores = autores;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }
}

