package com.aluraLiteratura.Challenge_Literatura.service;
import com.aluraLiteratura.Challenge_Literatura.dto.LibroResponseDto;
import com.aluraLiteratura.Challenge_Literatura.dto.AutorDto;
import com.aluraLiteratura.Challenge_Literatura.dto.LibroDto;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class GutendexService {

    private final RestTemplate restTemplate = new RestTemplate();
    private static final String BASE_URL = "https://gutendex.com/books?search=";

    // Método para obtener una lista de libros desde la API
    public List<LibroDto> obtenerLibrosDesdeApi() {
        String url = BASE_URL;
        var response = restTemplate.getForObject(url, LibroResponseDto.class);

        if (response != null && !response.getResults().isEmpty()) {
            return response.getResults();
        } else {
            return List.of(); // Devuelve una lista vacía si no se encuentran resultados
        }
    }

    // Método existente para buscar un libro por título
    public LibroDto buscarLibroPorTitulo(String titulo) {
        String url = BASE_URL + titulo;
        var response = restTemplate.getForObject(url, LibroResponseDto.class);

        if (response != null && !response.getResults().isEmpty()) {
            return response.getResults().get(0); // Retorna el primer resultado
        } else {
            return null; // Si no encuentra resultados
        }
    }

    // Nuevo método para obtener autores desde la API
    public List<AutorDto> obtenerAutoresDesdeApi() {
        // Obtenemos libros desde la API como referencia para obtener los autores
        List<LibroDto> libros = obtenerLibrosDesdeApi();

        // Extraemos los autores de cada libro y los agregamos a una lista
        return libros.stream()
                .flatMap(libro -> libro.getAutores().stream()) // Accede a la lista de autores de cada libro
                .distinct() // Evita duplicados
                .collect(Collectors.toList());
    }
}