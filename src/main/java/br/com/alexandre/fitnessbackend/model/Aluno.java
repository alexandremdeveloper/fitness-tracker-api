package br.com.alexandre.fitnessbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;


@Entity
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O tipo de treino é obrigatório")
    @Pattern(regexp = "iniciante|intermediário|avançado", flags = Pattern.Flag.CASE_INSENSITIVE,
        message = "O tipo de treino deve ser: iniciante, intermediário ou avançado")
    private String tipoTreino;

    @Min(value = 1, message = "A idade deve ser maior que 0")
    private Integer idade;

    @DecimalMin(value = "1.0", message = "O peso deve ser maior que 0")
    private Double peso;

    // Construtor vazio
    public Aluno() {}

    // Construtor completo
    public Aluno(String nome, String tipoTreino, Integer idade, Double peso) {
        this.nome = nome;
        this.tipoTreino = tipoTreino;
        this.idade = idade;
        this.peso = peso;
    }

    // Getters e Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getTipoTreino() { return tipoTreino; }
    public void setTipoTreino(String tipoTreino) { this.tipoTreino = tipoTreino; }

    public Integer getIdade() { return idade; }
    public void setIdade(Integer idade) { this.idade = idade; }

    public Double getPeso() { return peso; }
    public void setPeso(Double peso) { this.peso = peso; }
}