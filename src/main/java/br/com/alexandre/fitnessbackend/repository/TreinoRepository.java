package br.com.alexandre.fitnessbackend.repository;

import br.com.alexandre.fitnessbackend.model.Treino;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface TreinoRepository extends JpaRepository<Treino, Long> {

    List<Treino> findByAlunoId(Long usuarioId);
}