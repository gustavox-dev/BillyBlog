package com.example.BillyBlog.service;

import com.example.BillyBlog.dto.ComentarioDTO;
import com.example.BillyBlog.dto.mapper.ComentarioMapper;
import com.example.BillyBlog.entities.Comentario;
import com.example.BillyBlog.repository.RepositorioComentario;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class ComentarioService {

    private final RepositorioComentario repo;

    private final PostService postService;

    private final UsuarioService usuarioService;
    public ComentarioDTO criarComentario(ComentarioDTO comentarioDTO) {

        Comentario comentario = Comentario.builder()
                .post(postService.buscaPostPorId(comentarioDTO.getIdPost()))
                .usuario(usuarioService.buscarUsuario(comentarioDTO.getIdUsuario()))
                .comentario(comentarioDTO.getComentario())
                .publicacaoComentario(LocalDateTime.now())
                .build();

        repo.save(comentario);
        return ComentarioMapper.fromEntityToRest(comentario);
    }

    public ComentarioDTO atualizarComentario(Integer id, ComentarioDTO comentarioDTO) {
        Comentario comentario = buscarComentarioPorID(id);

        if(comentario != null) {
            comentario.setPost(postService.buscaPostPorId(comentarioDTO.getIdPost()));
            comentario.setUsuario(usuarioService.buscarUsuario(comentarioDTO.getIdUsuario()));
            comentario.setComentario(comentarioDTO.getComentario());
            comentario.setPublicacaoComentario(LocalDateTime.now());
            repo.save(comentario);
        }

        return ComentarioMapper.fromEntityToRest(comentario);
    }

    public Comentario buscarComentarioPorID(Integer id) {
        return repo.findById(id).get();
    }

    public List<Comentario> buscaTodosOsComentarios() {
        return repo.findAll();
    }

    public void deletaComentario(Integer id) {
        Comentario comentario = buscarComentarioPorID(id);
        repo.delete(comentario);
    }
}
