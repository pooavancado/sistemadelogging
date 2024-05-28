package com.example.todo;

/**
 * Representa uma tarefa com uma descrição e um status de conclusão.
 */
public class Task {
    private String description;
    private boolean completed;

    /**
     * Constrói uma nova Task com a descrição fornecida.
     *
     * @param description a descrição da tarefa
     */
    public Task(String description) {
        this.description = description;
        this.completed = false;
    }

    /**
     * Obtém a descrição da tarefa.
     *
     * @return a descrição da tarefa
     */
    public String getDescription() {
        return description;
    }

    /**
     * Verifica se a tarefa está concluída.
     *
     * @return true se a tarefa estiver concluída, false caso contrário
     */
    public boolean isCompleted() {
        return completed;
    }

    /**
     * Marca a tarefa como concluída.
     */
    public void complete() {
        this.completed = true;
    }

    @Override
    public String toString() {
        return "Task{" +
                "description='" + description + '\'' +
                ", completed=" + completed +
                '}';
    }
}
