package com.aluraLiteratura.Challenge_Literatura.dto;

import java.util.List;

public class LibroResponseDto {

    // Este campo debe coincidir con la estructura de la respuesta de la API,
    // que contiene una lista de libros.
    private List<LibroDto> results;

    // Getters y setters

    public List<LibroDto> getResults() {
        return results;
    }

    public void setResults(List<LibroDto> results) {
        this.results = results;
    }
}
