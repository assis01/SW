package br.Configuracao;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.cache.annotation.EnableCaching;



@EnableCaching
@SpringBootApplication
public class Configuracao extends SpringBootServletInitializer {
	    @Override
	    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
	        return application.sources(Configuracao.class);
	    }

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Configuracao.class, args);
	}
}
