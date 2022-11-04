package com.example.BillyBlog.controller;

import com.example.BillyBlog.entities.Plataforma;
import io.swagger.annotations.Api;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
// == /api/plataforma
@Api(tags = "Plataforma")
public interface IPlataformaController {

    @PostMapping(value = "/plataforma")
    Plataforma criarPlataforma(@RequestParam String nome);

    @PostMapping(value = "/plataforma/{id}")
    Plataforma atualizarPlataforma(@PathVariable Integer id, @RequestParam String nome);

    @GetMapping(value = "/plataforma/{id}")
    Plataforma buscarPlataformaPorID(@PathVariable Integer id);

    @GetMapping(value = "/plataforma/all")
    List<Plataforma> buscaTodasAsPlataformas();

    @DeleteMapping(value = "/plataforma/{id}")
    void deletaPlataforma(Integer id);
}
