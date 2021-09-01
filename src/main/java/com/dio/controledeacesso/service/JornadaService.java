package com.dio.controledeacesso.service;

import com.dio.controledeacesso.model.JornadaTrabalho;
import com.dio.controledeacesso.repository.JornadaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class JornadaService {

    JornadaRepository jornadaRepository;
    @Autowired// Força a inicialização sem precisar criar um objeto
    //Por padrao hoje, se faz necessario criar um construtor
    public JornadaService(JornadaRepository jornadaRepository) {
        this.jornadaRepository = jornadaRepository;
    }

    // criando nossos metodos crud de inserir

    public JornadaTrabalho saveJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public JornadaTrabalho updatesJornada(JornadaTrabalho jornadaTrabalho){
        return jornadaRepository.save(jornadaTrabalho);
    }

    public List<JornadaTrabalho> readJornada(){
        return jornadaRepository.findAll() ;
    }

    public Optional<JornadaTrabalho> readJornadaId(Long idJornada) {
        return jornadaRepository.findById(idJornada);
    }

    public void dltJornada(Long idJornada){
         jornadaRepository.deleteById(idJornada);
    }

}
