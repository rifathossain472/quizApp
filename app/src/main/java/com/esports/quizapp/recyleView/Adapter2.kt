package com.esports.quizapp.recyleView

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esports.quizapp.Data.Category
import com.esports.quizapp.databinding.ItemLayoutBinding

class Adapter2 (val category: List<Category> , private var handleUserClick: HandleUserClick ,): RecyclerView.Adapter<Adapter2.ViewHolder>(){
    class ViewHolder(val binding: ItemLayoutBinding): RecyclerView.ViewHolder(binding.root)

    interface HandleUserClick{
        fun selectQuiz(category: String)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = ItemLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = category.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val category = category[position]
        holder.binding.apply {
            categoryTv.text = category.categoryName
            categoryNumberTv.text = category.questionNumber.toString()
            categoryIv.setImageResource(category.categoryImage)

            root.setOnClickListener {
                handleUserClick.selectQuiz(category.categoryType)
            }


        }
    }

}