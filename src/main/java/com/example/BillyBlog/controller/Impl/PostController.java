package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.IPostController;
import com.example.BillyBlog.dto.PostDTO;
import com.example.BillyBlog.entities.Post;
import com.example.BillyBlog.service.PostService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PostController implements IPostController {

    private final PostService service;

    @Override
    public PostDTO criarPost(PostDTO postDTO) {
        return service.criarPost(postDTO);
    }

    @Override
    public PostDTO atualizaPost(Integer id, PostDTO postDTO) {
        return service.atualizaPost(id, postDTO);
    }

    @Override
    public Post buscaPostPorId(Integer id) {
        return service.buscaPostPorId(id);
    }

    @Override
    public List<Post> buscaTodosOsPosts() {
        return service.buscaTodosOsPosts();
    }

    @Override
    public void deletaPost(Integer id) {
        service.deletaPost(id);
    }
}
