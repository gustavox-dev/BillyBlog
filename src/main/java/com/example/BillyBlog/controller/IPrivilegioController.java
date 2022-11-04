package com.example.BillyBlog.controller;

import com.example.BillyBlog.entities.Privilegio;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api")
@Api(tags = "Privilegio")
public interface IPrivilegioController {

    @ApiOperation("Cria privilegio")
    @PostMapping(value = "/privilegio")
    Privilegio criarPrivilegio(String tipoPrivilegio);

    @ApiOperation("Atualiza privilegio")
    @PostMapping(value = "/privilegio/{id}")
    Privilegio atualizarPrivilegio(@PathVariable Integer id, @RequestParam String tipoPrivilegio);

    @ApiOperation("Busca privilegio por ID")
    @GetMapping(value = "/privilegio/{id}")
    Privilegio buscarPrivilegioPorID(Integer id);

    @ApiOperation("Busca todos os privilegios")
    @GetMapping("/privilegios")
    List<Privilegio> buscaTodosOsPrivilegios();

    @ApiOperation("Deleta privilegio")
    @DeleteMapping(value = "/privilegio/{id}")
    void deletaPrivilegio(Integer id);
}
