package com.sample.todo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sample.todo.mappers.TodoMapper;
import com.sample.todo.vo.Todo;

@Service
public class TodoServiceImpl implements TodoService {

	@Autowired
	private TodoMapper todoMapper;
	
	public void addNewTodo(Todo todo) {
		if(todo.getTitle() == null) {
			throw new RuntimeException("제목을 입력하지 않았습니다.");
		}
		if(todo.getContents() == null) {
			throw new RuntimeException("내용을 입력하지 않았습니다.");
		}
		if(todo.getDates() == null) {
			throw new RuntimeException("종료일을 입력하지 않았습니다.");
		}
		
		todoMapper.addTodo(todo);
	}

	public List<Todo> getAllTodoList() {
		List<Todo> todoList = todoMapper.getAllTodo();
		if(todoList.isEmpty()) {
			throw new RuntimeException("조회 결과가 존재하지 않습니다.");
		}
		return todoList;
	}

	public void updateTodo(Todo todo) {
		if(todo.getTitle() == null) {
			throw new RuntimeException("제목을 입력하지 않았습니다.");
		}
		if(todo.getContents() == null) {
			throw new RuntimeException("내용을 입력하지 않았습니다.");
		}
		if(todo.getDates() == null) {
			throw new RuntimeException("종료일을 입력하지 않았습니다.");
		}
		
		todoMapper.updateTodo(todo);
	}

	public Todo getTodoByTodoNo(int todoNo) {
		Todo todo = todoMapper.getTodoByNo(todoNo);
		if(todo == null) {
			throw new RuntimeException("존재하지 않는 번호입니다.");
		}
		return todo;
	}
	
}
