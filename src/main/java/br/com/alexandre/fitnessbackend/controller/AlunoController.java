package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.model.Aluno;
import br.com.alexandre.fitnessbackend.repository.AlunoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;

import java.util.List;

@RestController
@RequestMapping("/alunos")
public class AlunoController {

    private final AlunoRepository alunoRepository;

    public AlunoController(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    // Listar todos os alunos
    @GetMapping
    public List<Aluno> getAllAlunos() {
        return alunoRepository.findAll();
    }

    // Buscar aluno por ID
    @GetMapping("/{id}")
    public ResponseEntity<Aluno> getAlunoById(@PathVariable Long id) {
        return alunoRepository.findById(id)
                .map(aluno => ResponseEntity.ok().body(aluno))
                .orElse(ResponseEntity.notFound().build());
    }

    // Criar novo aluno
    @PostMapping
    public Aluno createAluno(@Valid @RequestBody Aluno aluno) {
        return alunoRepository.save(aluno);
    }

    // Atualizar aluno
    @PutMapping("/{id}")
    public ResponseEntity<Aluno> updateAluno(
        @PathVariable Long id, 
        @Valid @RequestBody Aluno alunoDetails) {
        
        return alunoRepository.findById(id)
                .map(aluno => {
                    aluno.setNome(alunoDetails.getNome());
                    aluno.setTipoTreino(alunoDetails.getTipoTreino());
                    aluno.setIdade(alunoDetails.getIdade());
                    aluno.setPeso(alunoDetails.getPeso());
                    Aluno atualizado = alunoRepository.save(aluno);
                    return ResponseEntity.ok().body(atualizado);
                })
                .orElse(ResponseEntity.notFound().build());

        

        return alunoRepository.save(aluno);
    }

    // Deletar aluno
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteAluno(@PathVariable Long id) {
        if (!alunoRepository.existsById(id)) {
            return ResponseEntity.notFound().build();
        }
        alunoRepository.deleteById(id);
        return ResponseEntity.noContent().build();
    }
}