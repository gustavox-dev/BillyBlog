package com.example.BillyBlog.service;

import com.example.BillyBlog.entities.Usuario;
import com.example.BillyBlog.repository.RepositorioUsuario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class UsuarioService {

    private final RepositorioUsuario repo;

    public Usuario criarUsuario(String nome) {
        Usuario usuario = Usuario.builder()
                .nome(nome)
                .build();
        return repo.save(usuario);
    }

    public Usuario atualizarUsuario(Integer id, String nome) {
        Usuario usuario = buscarUsuario(id);
        usuario.setNome(nome);

        return repo.save(usuario);
    }

    public Usuario buscarUsuario(Integer id) {
        return repo.findById(id).get();
    }

    public List<Usuario> buscarTodosOsUsuarios() {
        return repo.findAll();
    }

    public void deletaUsuario(Integer id) {
        Usuario usuario = buscarUsuario(id);
        repo.delete(usuario);
    }


}
