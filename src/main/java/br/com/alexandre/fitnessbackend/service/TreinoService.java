package br.com.alexandre.fitnessbackend.service;

import br.com.alexandre.fitnessbackend.model.Treino;
import br.com.alexandre.fitnessbackend.dto.TreinoDTO;
import br.com.alexandre.fitnessbackend.repository.TreinoRepository;
import br.com.alexandre.fitnessbackend.exception.ResourceNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TreinoService {

    @Autowired
    private TreinoRepository treinoRepository;

    public List<TreinoDTO> listarTodos() {
        return treinoRepository.findAll()
        .stream()
        .map(treino -> new TreinoDTO(
                treino.getId(), 
                treino.getNome(), 
                treino.getDescricao() 
        ))
        .collect(Collectors.toList());
    }

    public Treino salvar(Treino treino) {
        return treinoRepository.save(treino);
    }

    public List<Treino> buscarPorAluno(Long alunoId) {
        return treinoRepository.findByAlunoId(alunoId);
    }

    public Treino buscarPorId(Long id) {
        return treinoRepository.findById(id)
        .orElseThrow(() -> new ResourceNotFoundException("Treino não encontrado"));
    }
}