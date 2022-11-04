package com.example.BillyBlog.dto.mapper;

import com.example.BillyBlog.dto.PostDTO;
import com.example.BillyBlog.entities.Post;

public class PostMapper {

    public static PostDTO fromEntityToRest(Post post) {
        return PostDTO.builder()
                .idPlataforma(post.getPlataforma().getId())
                .idUsuario(post.getUsuario().getId())
                .idCategoria(post.getCategoria().getId())
                .titulo(post.getTitulo())
                .conteudo(post.getConteudo())
                .build();
    }
}
