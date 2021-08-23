package com.github.LeandroAlcantara1997.Controle_de_ponto.model;


import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Ocorrencia {
    @Id
    private long id;
    private String nome;
    private String descricao;

}
