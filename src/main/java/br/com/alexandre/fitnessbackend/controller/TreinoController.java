package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.model.Treino;
import br.com.alexandre.fitnessbackend.dto.TreinoDTO;
import br.com.alexandre.fitnessbackend.service.TreinoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import jakarta.validation.Valid;

@RestController
@RequestMapping("/treinos")
public class TreinoController {

    private final TreinoService service;

    public TreinoController(TreinoService service) {
        this.service = service;
    }

    // Listar todos
    @GetMapping
    public List<TreinoDTO> listarTodos() {
        return service.listarTodos();
    }

    // Buscar por aluno
    @GetMapping("/aluno/{alunoId}")
    public List<Treino> listarPorAluno(@PathVariable Long alunoId) {
        return service.buscarPorAluno(alunoId);
    }

    // Salvar treino
    @PostMapping
    public Treino salvarTreino(@RequestBody @Valid Treino treino) {
        return service.salvar(treino);
    }
}