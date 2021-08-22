package com.github.LeandroAlcantara1997.Controle_de_ponto.model;

import lombok.*;

import javax.management.ConstructorParameters;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
public class JornadaTrabalho {
    private Long id;
    private String descricao;

}
