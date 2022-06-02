package com.co.linadev.webspringboot.repositories;

import com.co.linadev.webspringboot.models.Curso;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.stereotype.Repository;

@RepositoryRestResource(path = "cursos", collectionResourceRel = "cursos")
@Repository
public interface CursoRepository extends JpaRepository<Curso, Integer> {
}
