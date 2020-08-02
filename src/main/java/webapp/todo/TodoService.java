package webapp.todo;

import java.util.ArrayList;

public class TodoService {
	
	private static ArrayList<Todo> todos = new ArrayList<Todo>();
	static {
		todos.add(new Todo("Learn MVC"));  
		todos.add(new Todo("Learn SpringBoot"));
		todos.add(new Todo("Learn HTML"));
	}
	
	public ArrayList<Todo> retrieveTodos(){
		return todos;
	}
	
	public void addTodo(String addingTodo) {
		todos.add(new Todo(addingTodo));
	}
	
	public void deleteTodo(Todo todo) {
		todos.remove(todo);
	}
}
