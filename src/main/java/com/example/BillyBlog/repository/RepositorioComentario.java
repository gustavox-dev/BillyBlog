package com.example.BillyBlog.repository;

import com.example.BillyBlog.entities.Comentario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioComentario extends JpaRepository<Comentario, Integer> {
}
