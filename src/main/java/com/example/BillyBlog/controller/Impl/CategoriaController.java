package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.ICategoriaController;
import com.example.BillyBlog.entities.Categoria;
import com.example.BillyBlog.service.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class CategoriaController implements ICategoriaController {

    private final CategoriaService service;

    @Override
    public Categoria criarCategoria(String nome) {
        return service.criarCategoria(nome);
    }

    @Override
    public Categoria atualizarCategoria(Integer id, String nome) {
        return service.atualizarCategoria(id, nome);
    }

    @Override
    public Categoria buscarCategoriaPorID(Integer id) {
        return service.buscarCategoriaPorID(id);
    }

    @Override
    public List<Categoria> buscaTodasAsCategorias() {
        return service.buscaTodasAsCategorias();
    }

    @Override
    public void deletaCategoria(Integer id) {
        service.deletaCategoria(id);
    }
}
