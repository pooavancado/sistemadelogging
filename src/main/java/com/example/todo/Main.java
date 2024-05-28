package com.example.todo;

import com.example.logging.LoggingHandler;
import java.lang.reflect.Proxy;

/**
 * Classe principal para executar a aplicação de gerenciamento de tarefas.
 */
public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManagerImpl();
        TaskManager proxy = (TaskManager) Proxy.newProxyInstance(
                TaskManager.class.getClassLoader(),
                new Class[]{TaskManager.class},
                new LoggingHandler(taskManager)
        );

        proxy.addTask("Aprender java");
        proxy.addTask("Escrever código em java");
        proxy.listTasks();
        proxy.completeTask(0);
        proxy.listTasks();
    }
}
