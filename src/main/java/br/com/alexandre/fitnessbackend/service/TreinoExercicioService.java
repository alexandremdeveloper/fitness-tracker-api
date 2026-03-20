package br.com.alexandre.fitnessbackend.service;

import br.com.alexandre.fitnessbackend.model.TreinoExercicio;
import br.com.alexandre.fitnessbackend.model.Treino;
import br.com.alexandre.fitnessbackend.repository.TreinoExercicioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TreinoExercicioService {

    @Autowired
    private TreinoExercicioRepository repository;

    public List<TreinoExercicio> listarTodos() {
        return repository.findAll();
    }

    public TreinoExercicio salvar(TreinoExercicio te) {
        return repository.save(te);
    }

}