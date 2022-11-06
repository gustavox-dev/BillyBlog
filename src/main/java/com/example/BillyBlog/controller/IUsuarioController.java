package com.example.BillyBlog.controller;

import com.example.BillyBlog.entities.Usuario;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Usuario")
public interface IUsuarioController {

    @ApiOperation("Registra usuario")
    @PostMapping(value = "/usuario")
    Usuario criarUsuario(@RequestParam String name);

    @ApiOperation("Atualiza Usuário")
    @PutMapping(value = "/usuario/{id}")
    Usuario atualizarUsuario(@PathVariable Integer id, @RequestParam String nome);

    @ApiOperation("Busca Usuario por ID")
    @GetMapping(value = "/usuario/{id}")
    Usuario buscarUsuario(@PathVariable Integer id);

    @ApiOperation("Busca todos os Usuários")
    @GetMapping(value = "/usuario")
    List<Usuario> buscarTodosOsUsuarios();

    @ApiOperation("Deleta Usuário")
    @DeleteMapping(value = "/usuario/{id}")
    void deletaUsuario(@PathVariable Integer id);

}
