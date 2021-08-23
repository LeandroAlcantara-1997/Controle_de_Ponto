package com.github.LeandroAlcantara1997.Controle_de_ponto.repository;

import com.github.LeandroAlcantara1997.Controle_de_ponto.model.JornadaTrabalho;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface JornadaRepository extends JpaRepository<JornadaTrabalho, Long> {
}
