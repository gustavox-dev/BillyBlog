package com.example.BillyBlog.service;

import com.example.BillyBlog.entities.Plataforma;
import com.example.BillyBlog.repository.RepositorioPlataforma;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PlataformaService {

    private final RepositorioPlataforma repo;

    public Plataforma criarPlataforma(String nome) {
        Plataforma plataforma = Plataforma.builder()
                .nome(nome)
                .build();

        return repo.save(plataforma);
    }

    public Plataforma atualizarPlataforma(Integer id, String nome) {
        Plataforma plataforma = buscarPlataformaPorID(id);
        plataforma.setNome(nome);

        return repo.save(plataforma);
    }

    public Plataforma buscarPlataformaPorID(Integer id) {
        return repo.findById(id).get();
    }

    public List<Plataforma> buscaTodasAsPlataformas() {
        return repo.findAll();
    }

    public void deletaPlataforma(Integer id) {
        Plataforma plataforma = buscarPlataformaPorID(id);
        repo.delete(plataforma);
    }



}
