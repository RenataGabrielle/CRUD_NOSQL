package com.example.gerenciamentotarefas.repository;


import com.example.gerenciamentotarefas.model.Tarefa;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TarefaRepository extends MongoRepository<Tarefa, String> {
}

