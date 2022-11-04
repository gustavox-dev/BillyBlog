package com.example.BillyBlog.entities;

import lombok.*;

import javax.persistence.*;


@Entity
@Builder
@Table(name = "plataformas")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Plataforma {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nome;

}
