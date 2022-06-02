package com.co.linadev.webspringboot;

import com.co.linadev.webspringboot.models.Curso;
import com.co.linadev.webspringboot.repositories.CursoRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.stream.Stream;

@Slf4j
@SpringBootApplication
public class WebSpringBootApplication {

    public static void main(String[] args) {
        SpringApplication.run(WebSpringBootApplication.class, args);
    }

    @Bean
    CommandLineRunner runner (CursoRepository cursoRepository){
        return args -> Stream.of(
                new Curso("html"),
                new Curso("css"),
                new Curso("Java"),
                new Curso("Javascript"),
                new Curso("React")
        ).forEach(cursoRepository::save);
    }
}
