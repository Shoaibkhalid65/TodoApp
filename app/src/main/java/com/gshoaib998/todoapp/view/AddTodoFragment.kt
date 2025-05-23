package com.gshoaib998.todoapp.view

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import com.google.android.material.bottomsheet.BottomSheetDialogFragment
import com.gshoaib998.todoapp.databinding.AddTaskFragmentBinding
import androidx.fragment.app.activityViewModels
import com.gshoaib998.todoapp.viewmodel.MainViewModel
import com.gshoaib998.todoapp.R
import com.gshoaib998.todoapp.model.Todo


class AddTodoFragment : BottomSheetDialogFragment() {

    private lateinit var binding: AddTaskFragmentBinding


    private val viewModel: MainViewModel by activityViewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DataBindingUtil.inflate(inflater, R.layout.add_task_fragment, container, false)
        return binding.root

    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.ivClose.setOnClickListener{dismiss()}
        val title=arguments?.getString("title")?:"New To-do"
        val edText=arguments?.getString("edText")?:""
        var isAlreadySaved=arguments?.getBoolean("isAlreadySaved")?:false
        val id=arguments?.getLong("id")?:-1
        binding.tvTitle.text = title
        binding.edText.setText(edText)
        binding.tvSave.setOnClickListener{
            val text=binding.edText.text.toString()
            if(text.isNotBlank()){
                if(isAlreadySaved){
                    viewModel.updateTodo(Todo(id,text))
                    isAlreadySaved=false
                }else{
                    viewModel.addTodo(Todo(text=text))
                }
                dismiss()
            }
        }
    }
}
