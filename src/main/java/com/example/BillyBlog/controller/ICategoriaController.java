package com.example.BillyBlog.controller;

import com.example.BillyBlog.entities.Categoria;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Categoria")
public interface ICategoriaController {

    @ApiOperation("Cria categoria")
    @PostMapping(value = "/categoria")
    Categoria criarCategoria(@RequestParam String nome);

    @ApiOperation("Atualiza a categoria")
    @PostMapping(value = "/categoria/{id}")
    Categoria atualizarCategoria(@PathVariable Integer id, @RequestParam String nome);

    @ApiOperation("Busca categoria por ID")
    @GetMapping(value = "/categoria/{id}")
    Categoria buscarCategoriaPorID(@PathVariable Integer id);

    @ApiOperation("Busca todas as categorias")
    @GetMapping(value = "/categoria/all")
    List<Categoria> buscaTodasAsCategorias();

    @ApiOperation("Deleta a categoria")
    @DeleteMapping(value = "/categoria/{id}")
    void deletaCategoria(@PathVariable Integer id);
}
