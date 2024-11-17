package com.aluraLiteratura.Challenge_Literatura.controller;

import com.aluraLiteratura.Challenge_Literatura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LibroController {

    @Autowired
    private LibroService libroService;

    @PostMapping("/buscarYGuardarLibro")
    public String buscarYGuardarLibro(@RequestParam String titulo) {
        return libroService.guardarLibroPorTitulo(titulo);
    }
}
