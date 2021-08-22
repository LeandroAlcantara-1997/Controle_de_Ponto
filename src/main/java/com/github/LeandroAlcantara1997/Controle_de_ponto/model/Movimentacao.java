package com.github.LeandroAlcantara1997.Controle_de_ponto.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Movimentacao {

    @AllArgsConstructor
    @NoArgsConstructor
    @EqualsAndHashCode
    @Embeddable
    public class MovimentacaoId implements Serializable{
        private Long id;
        private Long IdUsuario;
    }

    @EmbeddedId
    @Id
    @GeneratedValue
    private MovimentacaoId id;
    private LocalDateTime dataEntrada;
    private LocalDateTime dataSaida;
    private BigDecimal periodo;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Ocorrencia")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Ocorrencia ocorrencia;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Calendario")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Calendario calendario;

}
