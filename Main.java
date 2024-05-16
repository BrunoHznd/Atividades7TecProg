package fatecpg.TecProg.Atv.Main;

import fatecpg.TecProg.Atv.Model.*;

public class Main {

	public static void main(String[] args) {
		 ListaTarefa listaDeTarefas = new ListaTarefa();

	        Tarefa tarefa1 = new Tarefa("Fazer compras", "POO, POG");
	        Tarefa tarefa2 = new Tarefa("Estudar para a p2", "Java, PHP e C++");

	        listaDeTarefas.adicionarTarefa(tarefa1);
	        listaDeTarefas.adicionarTarefa(tarefa2);

	        listaDeTarefas.exibirTarefas();

	        listaDeTarefas.marcarTarefaComoConcluida(tarefa1);

	        listaDeTarefas.exibirTarefas();

	}

}
