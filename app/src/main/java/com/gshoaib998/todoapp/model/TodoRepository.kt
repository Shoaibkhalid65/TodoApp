package com.gshoaib998.todoapp.model

import androidx.lifecycle.LiveData

class TodoRepository(private val todoDao: TodoDao){
    suspend fun addTodo(todo: Todo){
        todoDao.addTodo(todo)
    }
    suspend fun updateTodo(todo: Todo){
        todoDao.updateTodo(todo)
    }
    suspend fun deleteTodo(todo: Todo){
        todoDao.deleteTodo(todo)
    }
    fun getAllTodos():LiveData<List<Todo>>{
        return todoDao.getAllTodo()
    }
}