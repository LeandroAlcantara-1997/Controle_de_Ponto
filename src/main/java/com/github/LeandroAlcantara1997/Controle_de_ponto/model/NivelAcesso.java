package com.github.LeandroAlcantara1997.Controle_de_ponto.model;


import lombok.*;
import org.hibernate.envers.Audited;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
@Audited
public class NivelAcesso {
    @Id
    private long id;
    private String descricao;
}
