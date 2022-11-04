package com.example.BillyBlog.service;

import com.example.BillyBlog.dto.PostDTO;
import com.example.BillyBlog.dto.mapper.PostMapper;
import com.example.BillyBlog.entities.Post;
import com.example.BillyBlog.repository.RepositorioPost;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
@AllArgsConstructor
public class PostService {

    public final RepositorioPost repo;

    public final PlataformaService plataformaService;

    public final UsuarioService usuarioService;

    public final CategoriaService categoriaService;

    public PostDTO criarPost(PostDTO postDTO) {

        Post post = Post.builder()
                .plataforma(plataformaService.buscarPlataformaPorID(postDTO.getIdPlataforma()))
                .usuario(usuarioService.buscarUsuario(postDTO.getIdUsuario()))
                .categoria(categoriaService.buscarCategoriaPorID(postDTO.getIdCategoria()))
                .titulo(postDTO.getTitulo())
                .conteudo(postDTO.getConteudo())
                .publicacaoPost(LocalDateTime.now())
                .build();

        repo.save(post);
        return PostMapper.fromEntityToRest(post);
    }

    public PostDTO atualizaPost(Integer id, PostDTO postDTO) {
        Post post = buscaPostPorId(id);
        if(post != null) {
            post.setPlataforma(plataformaService.buscarPlataformaPorID(postDTO.getIdPlataforma()));
            post.setUsuario(usuarioService.buscarUsuario(postDTO.getIdUsuario()));
            post.setCategoria(categoriaService.buscarCategoriaPorID(postDTO.getIdCategoria()));
            post.setTitulo(postDTO.getTitulo());
            post.setConteudo(postDTO.getConteudo());
            repo.save(post);
        }
        return PostMapper.fromEntityToRest(post);
    }

    public Post buscaPostPorId(Integer id) {
        return repo.findById(id).get();
    }

    public List<Post> buscaTodosOsPosts() {
        return repo.findAll();
    }

    public void deletaPost(Integer id) {
        Post post = buscaPostPorId(id);
        repo.delete(post);
    }

}
