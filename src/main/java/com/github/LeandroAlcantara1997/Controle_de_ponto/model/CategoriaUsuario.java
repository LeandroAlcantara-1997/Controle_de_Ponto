package com.github.LeandroAlcantara1997.Controle_de_ponto.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class CategoriaUsuario {
    private Long id;
    private String descricao;
}
