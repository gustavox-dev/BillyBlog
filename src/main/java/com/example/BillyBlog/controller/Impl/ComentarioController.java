package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.IComentarioController;
import com.example.BillyBlog.dto.ComentarioDTO;
import com.example.BillyBlog.entities.Comentario;
import com.example.BillyBlog.service.ComentarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class ComentarioController implements IComentarioController {

    private ComentarioService service;

    @Override
    public ComentarioDTO criarComentario(ComentarioDTO comentarioDTO) {
        return service.criarComentario(comentarioDTO);
    }

    @Override
    public ComentarioDTO atualizarComentario(Integer id, ComentarioDTO comentarioDTO) {
        return service.atualizarComentario(id, comentarioDTO);
    }

    @Override
    public Comentario buscarComentarioPorID(Integer id) {
        return service.buscarComentarioPorID(id);
    }

    @Override
    public List<Comentario> buscaTodosOsComentarios() {
        return service.buscaTodosOsComentarios();
    }

    @Override
    public void deletaComentario(Integer id) {
        service.deletaComentario(id);
    }
}
