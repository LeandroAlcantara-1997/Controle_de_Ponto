package com.github.LeandroAlcantara1997.Controle_de_ponto.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Localidade {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_NivelAcesso")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private NivelAcesso nivelAcesso;
    private String descricao;
}
