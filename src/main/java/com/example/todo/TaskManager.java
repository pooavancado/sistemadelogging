package com.example.todo;

import com.example.logging.Loggable;

/**
 * Interface para gerenciar tarefas, permitindo a adição, conclusão e listagem de tarefas.
 */
public interface TaskManager {
    /**
     * Adiciona uma nova tarefa com a descrição fornecida.
     *
     * @param description a descrição da tarefa a ser adicionada
     */
    @Loggable
    void addTask(String description);

    /**
     * Marca a tarefa no índice fornecido como concluída.
     *
     * @param index o índice da tarefa a ser concluída
     */
    @Loggable
    void completeTask(int index);

    /**
     * Lista todas as tarefas, mostrando suas descrições e status de conclusão.
     */
    @Loggable
    void listTasks();
}
