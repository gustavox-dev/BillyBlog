package com.example.BillyBlog.entities;

import lombok.*;

import javax.persistence.*;

@Entity
@Builder
@Table(name = "categorias")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Categoria {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String nome;

}
