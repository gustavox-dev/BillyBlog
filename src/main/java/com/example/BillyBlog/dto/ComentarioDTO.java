package com.example.BillyBlog.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Data
@Builder
public class ComentarioDTO {

    private Integer idPost;
    private Integer idUsuario;
    private String comentario;

}
