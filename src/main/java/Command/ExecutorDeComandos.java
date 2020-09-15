package Command;

import java.util.Stack;

public class ExecutorDeComandos {
	private Stack<Command> feitos;
	private Stack<Command> desfeitos;

	public ExecutorDeComandos() {
		this.feitos = new Stack<Command>();
		this.desfeitos = new Stack<Command>();
	}

	public String fazer(Command command) {
		feitos.push(command);
		desfeitos.clear();
		return command.fazer();
	}

	public String desfazer() {
		if (feitos.isEmpty())
			return " ";

		Command command = feitos.pop();
		desfeitos.push(command);
		return command.fazer();
	}

	public String refazer() {
		if (desfeitos.isEmpty())
			return "Nao à comandos para refazer!";

		Command command = desfeitos.pop();
		feitos.push(command);
		return command.fazer();
	}
}
