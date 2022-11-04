package com.example.BillyBlog.controller;

import com.example.BillyBlog.dto.ComentarioDTO;
import com.example.BillyBlog.entities.Comentario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Comentarios")
public interface IComentarioController {

    @ApiOperation("Criar Comentario")
    @PostMapping(value = "/comentario")
    ComentarioDTO criarComentario(@RequestBody ComentarioDTO comentarioDTO);

    @ApiOperation("Atualizar Comentario")
    @PostMapping(value = "/comentario/{id}")
    ComentarioDTO atualizarComentario(@PathVariable Integer id, @RequestBody ComentarioDTO comentarioDTO);

    @ApiOperation("Buscar Comentario por ID")
    @GetMapping(value = "/comentario/{id}")
    Comentario buscarComentarioPorID(@PathVariable Integer id);

    @ApiOperation("Buscar todos os comentários")
    @GetMapping(value = "/comentario/all")
    List<Comentario> buscaTodosOsComentarios();

    @ApiOperation("Criar Comentario")
    @DeleteMapping(value = "/comentario/{id}")
    void deletaComentario(@PathVariable Integer id);
}
