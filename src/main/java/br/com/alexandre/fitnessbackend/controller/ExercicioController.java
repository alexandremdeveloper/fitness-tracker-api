package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.model.Exercicio;
import br.com.alexandre.fitnessbackend.service.ExercicioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/exercicios")
public class ExercicioController {

    @Autowired
    private ExercicioService service;

    @GetMapping
    public List<Exercicio> listar() {
        return service.listarTodos();
    }

    @PostMapping
    public Exercicio salvar(@RequestBody Exercicio exercicio) {
        return service.salvar(exercicio);
    }
}