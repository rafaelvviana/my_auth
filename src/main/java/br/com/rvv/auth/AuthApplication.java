package br.com.rvv.auth;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * API para autenticação utilizando Spring Boot; Spring Data JPA; Spring Security
 * API para consulta: "/dados"
 * Usuário: "user"
 * Senha: "123"
 * 
 * @author rvviana
 *
 */

@SpringBootApplication
public class AuthApplication {

	public static void main(String[] args) {
		SpringApplication.run(AuthApplication.class, args);
	}

}
