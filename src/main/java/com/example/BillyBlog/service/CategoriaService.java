package com.example.BillyBlog.service;

import com.example.BillyBlog.entities.Categoria;
import com.example.BillyBlog.repository.RepositorioCategoria;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaService {

    private RepositorioCategoria repo;

    public Categoria criarCategoria(String nome) {
        Categoria categoria = Categoria.builder()
                .nome(nome)
                .build();

        return repo.save(categoria);
    }

    public Categoria atualizarCategoria(Integer id, String nome){
        Categoria categoria = buscarCategoriaPorID(id);
        categoria.setNome(nome);

        return repo.save(categoria);
    }

    public Categoria buscarCategoriaPorID(Integer id) {
        return repo.findById(id).get();
    }

    public List<Categoria> buscaTodasAsCategorias() {
        return repo.findAll();
    }

    public void deletaCategoria(Integer id) {
        Categoria categoria = buscarCategoriaPorID(id);
        repo.delete(categoria);
    }
}
