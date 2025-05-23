package com.gshoaib998.todoapp.view

import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.gshoaib998.todoapp.viewmodel.MainViewModel
import com.gshoaib998.todoapp.viewmodel.MainViewModelFactory
import com.gshoaib998.todoapp.R
import com.gshoaib998.todoapp.model.TodoDatabase
import com.gshoaib998.todoapp.model.TodoRepository
import com.gshoaib998.todoapp.databinding.ActivityMainBinding
import com.mikepenz.fastadapter.FastAdapter
import com.mikepenz.fastadapter.adapters.ItemAdapter
import com.mikepenz.fastadapter.listeners.ClickEventHook

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private lateinit var viewModel: MainViewModel
    private lateinit var fastAdapter: FastAdapter<TodoItem>
    private lateinit var itemAdapter: ItemAdapter<TodoItem>
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding=DataBindingUtil.setContentView(this, R.layout.activity_main)

        val todoDao= TodoDatabase.getDatabase(this).todoDao()
        val repository= TodoRepository(todoDao)
        val mainViewModelFactory= MainViewModelFactory(repository)
        viewModel=ViewModelProvider(this,mainViewModelFactory)[MainViewModel::class.java]

        itemAdapter= ItemAdapter()
        fastAdapter=FastAdapter.with(itemAdapter)
        viewModel.getAllTodos().observe(this) { todos->
            val todoItems=todos.map { TodoItem(todo=it, isSelected = false) }
            itemAdapter.set(todoItems)
        }
        binding.fab.setOnClickListener{
            val addTodoFragment= AddTodoFragment()
            addTodoFragment.show(supportFragmentManager,addTodoFragment.tag)
        }
        binding.recyclerView.layoutManager=LinearLayoutManager(this)
        binding.recyclerView.adapter=fastAdapter

        fastAdapter.addEventHook(object : ClickEventHook<TodoItem>() {
            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return viewHolder.itemView.findViewById(R.id.radio_button)
            }
            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<TodoItem>,
                item: TodoItem
            ) {
                viewModel.deleteTodo(item.todo)
            }
        })
        fastAdapter.addEventHook(object : ClickEventHook<TodoItem>() {
            override fun onBind(viewHolder: RecyclerView.ViewHolder): View? {
                return viewHolder.itemView.findViewById(R.id.cardView)
            }
            override fun onClick(
                v: View,
                position: Int,
                fastAdapter: FastAdapter<TodoItem>,
                item: TodoItem
            ) {
                val addTodoFragment = AddTodoFragment().apply {
                    arguments = Bundle().apply {
                        putString("title", "Edit To-do")
                        putString("edText", item.todo.text)
                        putBoolean("isAlreadySaved", true)
                        putLong("id", item.todo.id)
                    }
                }
                addTodoFragment.show(supportFragmentManager, addTodoFragment.tag)
            }
        })
    }
}