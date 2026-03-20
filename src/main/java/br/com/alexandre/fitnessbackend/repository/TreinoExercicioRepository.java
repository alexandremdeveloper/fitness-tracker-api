package br.com.alexandre.fitnessbackend.repository;

import br.com.alexandre.fitnessbackend.model.TreinoExercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TreinoExercicioRepository extends JpaRepository<TreinoExercicio, Long> {
}