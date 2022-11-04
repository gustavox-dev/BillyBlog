package com.example.BillyBlog.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class PostDTO {

    private Integer idPlataforma;
    private Integer idUsuario;
    private Integer idCategoria;
    private String titulo;
    private String conteudo;

}
