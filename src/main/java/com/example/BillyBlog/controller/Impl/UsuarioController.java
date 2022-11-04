package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.IUsuarioController;
import com.example.BillyBlog.entities.Usuario;
import com.example.BillyBlog.service.UsuarioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class UsuarioController implements IUsuarioController {

    private final UsuarioService service;

    @Override
    public Usuario criarUsuario(String nome) {
        return service.criarUsuario(nome);
    }

    @Override
    public Usuario atualizarUsuario(Integer id, String nome) {
        return service.atualizarUsuario(id, nome);
    }

    @Override
    public Usuario buscarUsuario(Integer id) {
        return service.buscarUsuario(id);
    }

    @Override
    public List<Usuario> buscarTodosOsUsuarios() {
        return service.buscarTodosOsUsuarios();
    }

    @Override
    public void deletaUsuario(Integer id) {
        service.deletaUsuario(id);
    }
}
