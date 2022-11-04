package com.example.BillyBlog.repository;

import com.example.BillyBlog.entities.Categoria;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioCategoria extends JpaRepository<Categoria, Integer> {
}
