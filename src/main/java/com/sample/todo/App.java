package com.sample.todo;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;

import com.sample.todo.service.TodoService;
import com.sample.todo.vo.Todo;

public class App {

	@SuppressWarnings("resource")
	public static void main(String[] args) {

		String resource = "classpath:/META-INF/spring/app-context.xml";
		ApplicationContext context = new GenericXmlApplicationContext(resource);
		
		TodoService service = context.getBean(TodoService.class);
		
		List<Todo> todos = service.getAllTodoList();
		for(Todo forTodo : todos) {
			System.out.println(forTodo.getNo() + "번 게시글 : " + forTodo.getContents());
		}
		
/*		Todo todo = new Todo();
		todo.setTitle("영화보기");
		todo.setDates("2017-10-20");
		todo.setContents("지오스톰 보러가기");
		
		service.addNewTodo(todo);*/
		
		Todo todo = service.getTodoByTodoNo(22);
		System.out.println(todo.getContents());
		
		todo.setContents("대장김창수 보러가기");
		service.updateTodo(todo);
		System.out.println(todo.getContents());

	}

}
