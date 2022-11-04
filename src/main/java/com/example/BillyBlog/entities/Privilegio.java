package com.example.BillyBlog.entities;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "privilegios")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
public class Privilegio {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String tipoPrivilegio;

    @OneToMany
    private List<Usuario> usuarios;

}
