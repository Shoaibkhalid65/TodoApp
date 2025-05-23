package com.gshoaib998.todoapp.viewmodel

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.gshoaib998.todoapp.model.Todo
import com.gshoaib998.todoapp.model.TodoRepository
import kotlinx.coroutines.launch

class MainViewModel(private val repository: TodoRepository):ViewModel(){
    fun addTodo(todo: Todo){
        viewModelScope.launch {
            repository.addTodo(todo)
        }
    }
    fun updateTodo(todo: Todo){
        viewModelScope.launch {
            repository.updateTodo(todo)
        }
    }
    fun deleteTodo(todo: Todo){
        viewModelScope.launch {
            repository.deleteTodo(todo)
        }
    }
    fun getAllTodos():LiveData<List<Todo>> = repository.getAllTodos()


}