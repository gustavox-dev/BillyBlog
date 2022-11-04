package com.example.BillyBlog.controller.Impl;

import com.example.BillyBlog.controller.IPrivilegioController;
import com.example.BillyBlog.entities.Privilegio;
import com.example.BillyBlog.service.PrivilegioService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@AllArgsConstructor
public class PrivilegioController implements IPrivilegioController {

    private final PrivilegioService service;

    @Override
    public Privilegio criarPrivilegio(String tipoPrivilegio) {
        return service.criarPrivilegio(tipoPrivilegio);
    }

    @Override
    public Privilegio atualizarPrivilegio(Integer id, String tipoPrivilegio) {
        return service.atualizarPrivilegio(id, tipoPrivilegio);
    }

    @Override
    public Privilegio buscarPrivilegioPorID(Integer id) {
        return service.buscarPrivilegioPorID(id);
    }

    @Override
    public List<Privilegio> buscaTodosOsPrivilegios() {
        return service.buscaTodosOsPrivilegios();
    }

    @Override
    public void deletaPrivilegio(Integer id) {
        service.deletaPrivilegio(id);
    }
}
