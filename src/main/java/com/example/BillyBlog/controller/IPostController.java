package com.example.BillyBlog.controller;

import com.example.BillyBlog.dto.PostDTO;
import com.example.BillyBlog.entities.Post;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Posts")
public interface IPostController {

    @ApiOperation("Criar post")
    @PostMapping(value = "/post")
    PostDTO criarPost(@RequestBody PostDTO postDTO);

    @ApiOperation("Atualiza post")
    @PostMapping(value = "/post/{id}")
    PostDTO atualizaPost(@PathVariable Integer id, @RequestBody PostDTO postDTO);

    @ApiOperation("Busca post por ID")
    @GetMapping(value = "/post/{id}")
    Post buscaPostPorId(Integer id);

    @ApiOperation("Busca todos os Posts")
    @GetMapping(value = "/post/all")
    List<Post> buscaTodosOsPosts();

    @ApiOperation("Deleta post")
    @DeleteMapping(value = "/post/{id}")
    void deletaPost(Integer id);
}
