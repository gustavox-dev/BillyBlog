package com.example.BillyBlog.repository;

import com.example.BillyBlog.entities.Post;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RepositorioPost extends JpaRepository<Post, Integer> {
}
