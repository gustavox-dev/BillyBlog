package com.example.BillyBlog.repository;

import com.example.BillyBlog.entities.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioUsuario extends JpaRepository<Usuario, Integer> {
}
