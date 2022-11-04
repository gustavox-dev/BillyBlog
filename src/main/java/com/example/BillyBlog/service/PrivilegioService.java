package com.example.BillyBlog.service;

import com.example.BillyBlog.entities.Privilegio;
import com.example.BillyBlog.repository.RepositorioPrivilegio;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class PrivilegioService {

    private final RepositorioPrivilegio repo;

    public Privilegio criarPrivilegio(String tipoPrivilegio) {
        Privilegio privilegio = Privilegio.builder()
                .tipoPrivilegio(tipoPrivilegio)
                .build();

        return repo.save(privilegio);
    }

    public Privilegio atualizarPrivilegio(Integer id, String tipoPrivilegio) {
       Privilegio privilegio = buscarPrivilegioPorID(id);
       privilegio.setTipoPrivilegio(tipoPrivilegio);

       return repo.save(privilegio);
    }

    public Privilegio buscarPrivilegioPorID(Integer id) {
        return repo.findById(id).get();
    }

    public List<Privilegio> buscaTodosOsPrivilegios() {
        return repo.findAll();
    }

    public void deletaPrivilegio(Integer id) {
        Privilegio privilegio = buscarPrivilegioPorID(id);
        repo.delete(privilegio);
    }
}
