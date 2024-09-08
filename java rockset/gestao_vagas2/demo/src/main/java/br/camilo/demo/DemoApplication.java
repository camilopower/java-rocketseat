package br.camilo.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import br.camilo.expections.ErrorMessageDTO;
import br.camilo.module.camilo.controllers.CamiloController;

@SpringBootApplication

@ComponentScan(basePackageClasses = CamiloController.class )
@ComponentScan(basePackageClasses = ErrorMessageDTO.class)
public class DemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}

}
