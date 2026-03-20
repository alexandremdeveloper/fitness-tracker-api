package br.com.alexandre.fitnessbackend.dto;

public class TreinoDTO {

    private Long id;
    private String nome;
    private String descricao;

    public TreinoDTO() {}

    public TreinoDTO(Long id, String nome, String descricao) {
        this.id = id;
        this.nome = nome;
        this.descricao = descricao;
    }

    public Long getId() { return id; }
    public String getNome() { return nome; }
    public String getDescricao() { return descricao; }
}