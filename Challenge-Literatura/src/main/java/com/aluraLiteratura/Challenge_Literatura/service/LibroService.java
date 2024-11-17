package com.aluraLiteratura.Challenge_Literatura.service;

import com.aluraLiteratura.Challenge_Literatura.dto.AutorDto;
import com.aluraLiteratura.Challenge_Literatura.dto.LibroDto;
import com.aluraLiteratura.Challenge_Literatura.entity.Libro;
import com.aluraLiteratura.Challenge_Literatura.repository.LibroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class LibroService {

    @Autowired
    private LibroRepository libroRepository;

    @Autowired
    private GutendexService gutendexService;

    public void guardarLibrosDesdeApi() {
        // Implementación actual de guardar todos los libros desde la API
    }

    public String guardarLibroPorTitulo(String titulo) {
        LibroDto dto = gutendexService.buscarLibroPorTitulo(titulo);

        if (dto != null) {
            String primerIdioma = dto.getIdiomas().isEmpty() ? "Desconocido" : dto.getIdiomas().get(0);
            AutorDto primerAutor = dto.getAutores().isEmpty() ? null : dto.getAutores().get(0);

            Libro libro = new Libro(dto.getTitulo(),
                    primerAutor != null ? primerAutor.getNombre() : "Autor desconocido",
                    primerIdioma,
                    dto.getPaginas());

            libroRepository.save(libro);
            return "Libro '" + titulo + "' guardado en la base de datos.";
        } else {
            return "Libro '" + titulo + "' no encontrado en la API.";
        }
    }

    // Método para listar todos los libros por idioma
    public List<Libro> listarLibrosPorIdioma(String idioma) {
        return libroRepository.findAll().stream()
                .filter(libro -> libro.getIdioma().equalsIgnoreCase(idioma))
                .collect(Collectors.toList());
    }

    // Método para listar todos los autores registrados
    public List<String> listarAutoresRegistrados() {
        return libroRepository.findAll().stream()
                .map(Libro::getAutor)
                .distinct()
                .collect(Collectors.toList());
    }

    // Método para listar autores vivos en un año determinado
    public List<AutorDto> listarAutoresVivosEnAnio(int anio) {
        return gutendexService.obtenerAutoresDesdeApi().stream()
                .filter(autor -> autor.getBirthYear() <= anio && (autor.getDeathYear() == null || autor.getDeathYear() > anio))
                .collect(Collectors.toList());
    }

    public List<Libro> listarLibrosRegistrados() {
        return libroRepository.findAll(); // Obtiene todos los libros de la base de datos
    }

    public Iterable<Object> listarAutoresVivosPorAnio(int año) {
        // Obtén la lista de autores desde la API y filtra los que están vivos en el año especificado
        return gutendexService.obtenerAutoresDesdeApi().stream()
                .filter(autor -> autor.getBirthYear() <= año && (autor.getDeathYear() == null || autor.getDeathYear() > año))
                .collect(Collectors.toList());
    }

}
