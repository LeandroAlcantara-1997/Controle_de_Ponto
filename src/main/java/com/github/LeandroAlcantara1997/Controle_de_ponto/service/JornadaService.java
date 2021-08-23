package com.github.LeandroAlcantara1997.Controle_de_ponto.service;

import com.github.LeandroAlcantara1997.Controle_de_ponto.model.JornadaTrabalho;
import com.github.LeandroAlcantara1997.Controle_de_ponto.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;

    @Autowired
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    @PostMapping
    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    public List<JornadaTrabalho> findAll() {
        return   jornadaRepository.findAll();
    }

    @GetMapping
    public Optional<JornadaTrabalho> getById(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    @PutMapping
    public JornadaTrabalho updateJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);

    }

    @DeleteMapping
    public void deleteJornada(Long idJornada) {
        jornadaRepository.deleteById(idJornada);
    }
}
