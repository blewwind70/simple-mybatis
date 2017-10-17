package com.sample.todo.service;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoService {

	void addNewTodo(Todo todo);
	List<Todo> getAllTodoList();
	void updateTodo(Todo todo);
	Todo getTodoByTodoNo(int todoNo);
}
