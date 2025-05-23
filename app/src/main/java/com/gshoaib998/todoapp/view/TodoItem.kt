package com.gshoaib998.todoapp.view

import android.view.LayoutInflater
import android.view.ViewGroup
import com.gshoaib998.todoapp.R
import com.gshoaib998.todoapp.databinding.TaskItemViewBinding
import com.gshoaib998.todoapp.model.Todo
import com.mikepenz.fastadapter.binding.AbstractBindingItem

class TodoItem(override val type: Int = R.id.main, val todo: Todo, override var isSelected: Boolean = false) : AbstractBindingItem<TaskItemViewBinding>() {

    override fun createBinding(inflater: LayoutInflater, parent: ViewGroup?): TaskItemViewBinding {
        return TaskItemViewBinding.inflate(inflater,parent,false)
    }

    override fun bindView(binding: TaskItemViewBinding, payloads: List<Any>) {
        super.bindView(binding, payloads)
        binding.todo=todo
        binding.radioButton.isChecked = isSelected
    }

    override fun unbindView(binding: TaskItemViewBinding) {
        super.unbindView(binding)
        binding.todo=null
    }

}