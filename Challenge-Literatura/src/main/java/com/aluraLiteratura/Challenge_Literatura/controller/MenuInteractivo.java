package com.aluraLiteratura.Challenge_Literatura.controller;

import com.aluraLiteratura.Challenge_Literatura.service.LibroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Scanner;

@Component
public class MenuInteractivo {

    @Autowired
    private LibroService libroService;

    public void iniciarMenu() {
        Scanner scanner = new Scanner(System.in);
        int opcion = 0;

        while (opcion != 6) { // Opción 6 para salir
            System.out.println("Elija la opción a través de su número:");
            System.out.println("1- Buscar libro por título");
            System.out.println("2- Lista libros registrados");
            System.out.println("3- Lista autores registrados");
            System.out.println("4- Lista autores vivos en un determinado año");
            System.out.println("5- Lista libros por idioma");
            System.out.println("6- Salir");

            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    System.out.println("Ingrese el título del libro:");
                    String titulo = scanner.nextLine();
                    libroService.guardarLibroPorTitulo(titulo);
                    System.out.println("Libro buscado y guardado en la base de datos si se encontró en la API.");
                    break;
                case 2:
                    libroService.listarLibrosRegistrados().forEach(System.out::println);
                    break;
                case 3:
                    libroService.listarAutoresRegistrados().forEach(System.out::println);
                    break;
                case 4:
                    System.out.println("Ingrese el año para buscar autores vivos:");
                    int año = scanner.nextInt();
                    scanner.nextLine();
                    libroService.listarAutoresVivosPorAnio(año).forEach(System.out::println);
                    break;
                case 5:
                    System.out.println("Ingrese el idioma para buscar los libros:");
                    String idioma = scanner.nextLine();
                    libroService.listarLibrosPorIdioma(idioma).forEach(System.out::println);
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción inválida, intente nuevamente.");
                    break;
            }
        }

        scanner.close();
    }
}
