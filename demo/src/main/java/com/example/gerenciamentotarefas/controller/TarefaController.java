package com.example.gerenciamentotarefas.controller;

import com.example.gerenciamentotarefas.model.Tarefa;
import com.example.gerenciamentotarefas.repository.TarefaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tarefas")
public class TarefaController {

    @Autowired
    private TarefaRepository tarefaRepository;

    @GetMapping
    public List<Tarefa> listarTodas() {
        return tarefaRepository.findAll();
    }

    @PostMapping
    public Tarefa criar(@RequestBody Tarefa tarefa) {
        return tarefaRepository.save(tarefa);
    }

    @GetMapping("/{id}")
    public Tarefa buscarPorId(@PathVariable String id) {
        return tarefaRepository.findById(id).orElse(null);
    }

    @PutMapping("/{id}")
    public Tarefa atualizar(@PathVariable String id, @RequestBody Tarefa tarefa) {
        tarefa.setId(id);
        return tarefaRepository.save(tarefa);
    }

    @DeleteMapping("/{id}")
    public void deletar(@PathVariable String id) {
        tarefaRepository.deleteById(id);
    }
}
