package com.github.LeandroAlcantara1997.Controle_de_ponto.model;


import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;

import javax.persistence.*;
import java.math.BigDecimal;
import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Builder
@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Cat_Usuario")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private CategoriaUsuario categoriaUsuario;
    private String nome;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Empresa")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private Empresa empresa;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_NivelAcesso")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private NivelAcesso nivelAcesso;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "id_Jornada_Trabalho")
    @JsonProperty(access = JsonProperty.Access.WRITE_ONLY)
    private JornadaTrabalho jornadaTrabalho;
    private BigDecimal tolerancia;
    private LocalDateTime inicioJornada;
    private LocalDateTime finalJornada;

}
