package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.model.TreinoExercicio;
import br.com.alexandre.fitnessbackend.service.TreinoExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/treino-exercicios")
public class TreinoExercicioController {

    @Autowired
    private TreinoExercicioService service;

    @GetMapping
    public List<TreinoExercicio> listar() {
        return service.listarTodos();
    }


    @PostMapping
    public TreinoExercicio salvar(@RequestBody TreinoExercicio te) {
        return service.salvar(te);
    }
}