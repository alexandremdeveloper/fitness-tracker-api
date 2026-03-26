package br.com.alexandre.fitnessbackend.service;

import br.com.alexandre.fitnessbackend.model.Aluno;
import br.com.alexandre.fitnessbackend.repository.AlunoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AlunoService {

    private final AlunoRepository alunoRepository;

    // 🔥 Injeção via construtor (melhor prática)
    public AlunoService(AlunoRepository alunoRepository) {
        this.alunoRepository = alunoRepository;
    }

    // Criar aluno
    public Aluno salvar(Aluno aluno) {
        if (aluno.getId() == null) {
            if (alunoRepository.existsByCpf(aluno.getCpf())) {
                throw new RuntimeException("CPF já cadastrado");
            }

            if (alunoRepository.existsByEmail(aluno.getEmail())) {
                throw new RuntimeException("Email já cadastrado");
            }
        }
        
        return alunoRepository.save(aluno);
    }

    // Listar todos
    public List<Aluno> listarTodos() {
        return alunoRepository.findAll();
    }

    // Buscar por ID
    public Optional<Aluno> buscarPorId(Long id) {
        return alunoRepository.findById(id);
    }

    // Deletar
    public void deletar(Long id) {
        alunoRepository.deleteById(id);
    }

    // Verificar existência
    public boolean existePorId(Long id) {
        return alunoRepository.existsById(id);
    }
}