package com.github.LeandroAlcantara1997.Controle_de_ponto.model;

import lombok.*;

import javax.management.ConstructorParameters;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class JornadaTrabalho {
    @Id
    private Long id;
    private String descricao;

}
