SISTEMA DE LOGGING
Aplicação de Gerenciamento de Tarefas
Descrição
O Sistema de Logging é uma aplicação de gerenciamento de tarefas que demonstra o uso de logging em Java, utilizando componentes como proxies dinâmicos, reflection e anotações customizadas.

Funcionalidades Principais
Adicionar Tarefa (addTask): Permite adicionar uma nova tarefa com uma descrição.
Completar Tarefa (completeTask): Marca uma tarefa como concluída utilizando o índice da tarefa na lista.
Listar Tarefas (listTasks): Exibe todas as tarefas com suas descrições e status de conclusão.
Estrutura do Projeto
Task.java: Representa uma tarefa com descrição e status.
TaskManager.java: Interface para gerenciar tarefas.
TaskManagerImpl.java: Implementação da interface TaskManager.
Main.java: Classe principal para executar a aplicação.

Detalhes da Implementação
Proxy Dinâmico e Logging: Utiliza proxies dinâmicos para adicionar logs às chamadas de métodos anotados com @Loggable.
Componentes:
Main: Configura o TaskManager e cria proxies dinâmicos para adicionar funcionalidade de logging.
Task: Representa uma tarefa com descrição e status de conclusão.
TaskManager: Define métodos para adicionar, completar e listar tarefas.
TaskManagerImpl: Implementa os métodos de gerenciamento de tarefas.
LoggingHandler: Intercepta chamadas de método em proxies e adiciona logs para métodos anotados.
@Loggable: Anotação customizada para marcar métodos com logging.
Funcionamento
Ao chamar métodos anotados com @Loggable, uma mensagem de log é exibida, mostrando que o método foi chamado.
O proxy dinâmico adiciona logs para métodos anotados, antes de delegar a chamada ao método real.
