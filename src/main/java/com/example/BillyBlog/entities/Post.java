package com.example.BillyBlog.entities;

import lombok.*;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "posts")
@Builder
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Post {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @ManyToOne
    private Plataforma plataforma;

    @ManyToOne
    private Usuario usuario;

    @ManyToOne
    private Categoria categoria;

    private String titulo;

    private String conteudo;

    private LocalDateTime publicacaoPost;

}
