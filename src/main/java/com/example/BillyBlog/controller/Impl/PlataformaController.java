package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.IPlataformaController;
import com.example.BillyBlog.entities.Plataforma;
import com.example.BillyBlog.service.PlataformaService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PlataformaController implements IPlataformaController {

    private final PlataformaService service;

    @Override
    public Plataforma criarPlataforma(String nome) {
        return service.criarPlataforma(nome);
    }

    @Override
    public Plataforma atualizarPlataforma(Integer id, String nome) {
        return service.atualizarPlataforma(id, nome);
    }

    @Override
    public Plataforma buscarPlataformaPorID(Integer id){
        return service.buscarPlataformaPorID(id);
    }

    @Override
    public List<Plataforma> buscaTodasAsPlataformas(){
        return service.buscaTodasAsPlataformas();
    }

    @Override
    public void deletaPlataforma(Integer id){
        service.deletaPlataforma(id);
    }
}
