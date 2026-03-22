package br.com.alexandre.fitnessbackend.controller;

import br.com.alexandre.fitnessbackend.model.Meal;
import br.com.alexandre.fitnessbackend.repository.MealRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/meals")
public class MealController {

    private final MealRepository mealRepository;

    public MealController(MealRepository mealRepository) {
        this.mealRepository = mealRepository;
    }

    // Listar todas as refeições
    @GetMapping
    public List<Meal> getAllMeals() {
        return mealRepository.findAll();
    }

    // Adicionar nova refeição
    @PostMapping
    public Meal createMeal(@RequestBody Meal meal) {
        return mealRepository.save(meal);
    }
}