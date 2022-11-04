package com.example.BillyBlog.dto.mapper;

import com.example.BillyBlog.dto.ComentarioDTO;
import com.example.BillyBlog.entities.Comentario;

public class ComentarioMapper {

    public static ComentarioDTO fromEntityToRest(Comentario comentario) {
        return ComentarioDTO.builder()
                .idPost(comentario.getPost().getId())
                .idUsuario(comentario.getUsuario().getId())
                .comentario(comentario.getComentario())
                .build();
    }
}
