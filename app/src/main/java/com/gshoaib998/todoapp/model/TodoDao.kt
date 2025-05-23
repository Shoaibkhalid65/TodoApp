package com.gshoaib998.todoapp.model

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import androidx.room.Update

@Dao
interface TodoDao {
    @Insert
    suspend fun addTodo(todo: Todo)
    @Update
    suspend fun updateTodo(todo: Todo)
    @Delete
    suspend fun deleteTodo(todo: Todo)
    @Query("Select * from todo_table order by id Desc")
    fun getAllTodo():LiveData<List<Todo>>

}