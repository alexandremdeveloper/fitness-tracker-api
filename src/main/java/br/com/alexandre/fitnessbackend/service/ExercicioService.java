package br.com.alexandre.fitnessbackend.service;

import br.com.alexandre.fitnessbackend.model.Exercicio;
import br.com.alexandre.fitnessbackend.repository.ExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ExercicioService {

    @Autowired
    private ExercicioRepository repository;

    public List<Exercicio> listarTodos() {
        return repository.findAll();
    }

    public Exercicio salvar(Exercicio exercicio) {
        return repository.save(exercicio);
    }
}