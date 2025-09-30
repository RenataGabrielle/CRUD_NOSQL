package com.example.gerenciamentotarefas.service;

import com.example.gerenciamentotarefas.model.Tarefa;
import com.example.gerenciamentotarefas.repository.TarefaRepository;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class TarefaService {

    private final TarefaRepository tarefaRepository;

    public TarefaService(TarefaRepository tarefaRepository) {
        this.tarefaRepository = tarefaRepository;
    }

    public Tarefa criarTarefa(Tarefa tarefa) {
        tarefa.setDataCriacao(LocalDateTime.now()); // Salva data e hora da criação
        return tarefaRepository.save(tarefa);
    }

    public List<Tarefa> listarTarefas() {
        return tarefaRepository.findAll();
    }

    public Tarefa buscarPorId(String id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    public Tarefa atualizarTarefa(String id, Tarefa tarefaAtualizada) {
        tarefaAtualizada.setId(id);
        return tarefaRepository.save(tarefaAtualizada);
    }

    public void deletarTarefa(String id) {
        tarefaRepository.deleteById(id);
    }
}
