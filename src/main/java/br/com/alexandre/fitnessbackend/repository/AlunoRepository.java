package br.com.alexandre.fitnessbackend.repository;

import br.com.alexandre.fitnessbackend.model.Aluno;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AlunoRepository extends JpaRepository<Aluno, Long> {
    
    boolean existsByCpf(String cpf);

    boolean existsByEmail(String email);
}