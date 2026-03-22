package br.com.alexandre.fitnessbackend.repository;

import br.com.alexandre.fitnessbackend.model.Exercicio;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExercicioRepository extends JpaRepository<Exercicio, Long> {
}