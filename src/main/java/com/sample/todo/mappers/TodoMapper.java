package com.sample.todo.mappers;

import java.util.List;

import com.sample.todo.vo.Todo;

public interface TodoMapper {

	void addTodo(Todo todo);
	List<Todo> getAllTodo();
	void updateTodo(Todo todo);
	Todo getTodoByNo(int todoNo);
}
