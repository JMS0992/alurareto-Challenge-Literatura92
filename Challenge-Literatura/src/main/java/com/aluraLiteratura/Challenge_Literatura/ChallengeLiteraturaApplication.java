package com.aluraLiteratura.Challenge_Literatura;

import com.aluraLiteratura.Challenge_Literatura.controller.MenuInteractivo;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class ChallengeLiteraturaApplication implements CommandLineRunner {

	private final MenuInteractivo menuInteractivo;

	public ChallengeLiteraturaApplication(MenuInteractivo menuInteractivo) {
		this.menuInteractivo = menuInteractivo;
	}

	public static void main(String[] args) {
		SpringApplication.run(ChallengeLiteraturaApplication.class, args);
	}

	@Override
	public void run(String... args) {
		menuInteractivo.iniciarMenu();
	}
}
