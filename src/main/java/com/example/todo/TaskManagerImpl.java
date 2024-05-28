package com.example.todo;

import java.util.ArrayList;
import java.util.List;

/**
 * Implementação da interface {@link TaskManager}.
 * Gerencia uma lista de tarefas, permitindo a adição, conclusão e listagem de tarefas.
 */
public class TaskManagerImpl implements TaskManager {
    private final List<Task> tasks = new ArrayList<>();

    /**
     * Adiciona uma nova tarefa com a descrição fornecida.
     *
     * @param description a descrição da tarefa a ser adicionada
     */
    @Override
    public void addTask(String description) {
        tasks.add(new Task(description));
        System.out.println("Task added: " + description);
    }

    /**
     * Marca a tarefa no índice fornecido como concluída.
     *
     * @param index o índice da tarefa a ser concluída
     */
    @Override
    public void completeTask(int index) {
        if (index >= 0 && index < tasks.size()) {
            tasks.get(index).complete();
            System.out.println("Task completed: " + tasks.get(index).getDescription());
        } else {
            System.out.println("Invalid task index");
        }
    }

    /**
     * Lista todas as tarefas, mostrando suas descrições e status de conclusão.
     */
    @Override
    public void listTasks() {
        for (int i = 0; i < tasks.size(); i++) {
            System.out.println(i + ": " + tasks.get(i));
        }
    }
}
