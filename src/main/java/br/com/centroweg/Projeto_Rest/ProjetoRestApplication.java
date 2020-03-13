package br.com.centroweg.Projeto_Rest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
@CrossOrigin(origins = "*")
public class ProjetoRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProjetoRestApplication.class, args);
	}

}
