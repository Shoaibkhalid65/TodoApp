package com.gshoaib998.todoapp.viewmodel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.gshoaib998.todoapp.model.TodoRepository

@Suppress("UNCHECKED_CAST")
class MainViewModelFactory(private val repository: TodoRepository):ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return if(modelClass.isAssignableFrom(MainViewModel::class.java))
              MainViewModel(repository) as T
        else{
            throw IllegalArgumentException("Unknown viewmodel class ${modelClass.name}")
        }
    }

}