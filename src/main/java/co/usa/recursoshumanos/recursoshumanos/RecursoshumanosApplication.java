package co.usa.recursoshumanos.recursoshumanos;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
@EntityScan(basePackages = {"co.usa.recursoshumanos.recursoshumanos.model"})
@SpringBootApplication
public class RecursoshumanosApplication {

	public static void main(String[] args) {
		SpringApplication.run(RecursoshumanosApplication.class, args);
	}

}
