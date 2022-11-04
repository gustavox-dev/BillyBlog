package com.example.BillyBlog.controller;

import com.example.BillyBlog.entities.Plataforma;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
// == /api/plataforma
@Api(tags = "Plataforma")
public interface IPlataformaController {

    @PostMapping(value = "/plataforma")
    @ApiOperation("Cria plataforma")
    Plataforma criarPlataforma(@RequestParam String nome);

    @ApiOperation("Atualiza a plataforma")
    @PostMapping(value = "/plataforma/{id}")
    Plataforma atualizarPlataforma(@PathVariable Integer id, @RequestParam String nome);

    @ApiOperation("Busca uma plataforma por ID")
    @GetMapping(value = "/plataforma/{id}")
    Plataforma buscarPlataformaPorID(@PathVariable Integer id);

    @ApiOperation("Busca todas as categorias")
    @GetMapping(value = "/plataforma/all")
    List<Plataforma> buscaTodasAsPlataformas();

    @ApiOperation("Deleta a plataforma")
    @DeleteMapping(value = "/plataforma/{id}")
    void deletaPlataforma(Integer id);
}
