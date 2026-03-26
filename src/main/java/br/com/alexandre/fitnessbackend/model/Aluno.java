package br.com.alexandre.fitnessbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.*;
import jakarta.validation.constraints.*;
import java.time.LocalDate;

@Entity
@Table(name = "alunos")
public class Aluno {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "O nome é obrigatório")
    private String nome;

    @NotBlank(message = "O CPF é obrigatório")
    @Column(unique = true)
    private String cpf;

    @NotBlank(message = "O email é obrigatório")
    @Email(message = "Email inválido")
    @Column(unique = true)
    private String email;

    private String telefone;

    private LocalDate dataNascimento;

    @DecimalMin(value = "1.0", message = "O peso inicial deve ser maior que 0")
    private Double pesoInicial;

    @DecimalMin(value = "1.0", message = "O peso atual deve ser maior que 0")
    private Double pesoAtual;

    private Integer treinosPorSemana;

    private Boolean anamnesePreenchida;

    private LocalDate dataInicio;

    private String tipoTreino;

    // Construtor vazio
    public Aluno() {}

    // Getters e Setters

    public Long getId() { return id; }

    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }

    public String getCpf() { return cpf; }
    public void setCpf(String cpf) { this.cpf = cpf; }

    public String getEmail() { return email; }
    public void setEmail(String email) { this.email = email; }

    public String getTelefone() { return telefone; }
    public void setTelefone(String telefone) { this.telefone = telefone; }

    public LocalDate getDataNascimento() { return dataNascimento; }
    public void setDataNascimento(LocalDate dataNascimento) { this.dataNascimento = dataNascimento; }

    public Double getPesoInicial() { return pesoInicial; }
    public void setPesoInicial(Double pesoInicial) { this.pesoInicial = pesoInicial; }

    public Double getPesoAtual() { return pesoAtual; }
    public void setPesoAtual(Double pesoAtual) { this.pesoAtual = pesoAtual; }

    public Integer getTreinosPorSemana() { return treinosPorSemana; }
    public void setTreinosPorSemana(Integer treinosPorSemana) { this.treinosPorSemana = treinosPorSemana; }

    public Boolean getAnamnesePreenchida() { return anamnesePreenchida; }
    public void setAnamnesePreenchida(Boolean anamnesePreenchida) { this.anamnesePreenchida = anamnesePreenchida; }

    public LocalDate getDataInicio() { return dataInicio; }
    public void setDataInicio(LocalDate dataInicio) { this.dataInicio = dataInicio; }

    public String getTipoTreino() { return tipoTreino; }
    public void setTipoTreino(String tipoTreino) { this.tipoTreino = tipoTreino; }
}