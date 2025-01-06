package com.esports.quizapp.recyleView

import android.annotation.SuppressLint
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.esports.quizapp.Data.Quiz
import com.esports.quizapp.databinding.WronganswerlistBinding

class Adapter(private val quizList: List<Quiz>) : RecyclerView.Adapter<Adapter.ViewHolder>() {

        class ViewHolder(val binding: WronganswerlistBinding) : RecyclerView.ViewHolder(binding.root) {
        @SuppressLint("SetTextI18n")
        fun bind(quiz: Quiz) {
            binding.apply {
                questionNumberTv.text = quiz.questionNumber
                questionNameTv.text = quiz.questionName

                option1Tv.text = "1. ${quiz.options[0]}"
                option2Tv.text = "2. ${quiz.options[1]}"
                option3Tv.text = "3. ${quiz.options[2]}"
                option4Tv.text = "4. ${quiz.options[3]}"
                correctAnswerTv.text = "Correct Answer: ${quiz.options[quiz.correctAnswer]}"
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val binding = WronganswerlistBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = quizList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(quizList[position])
    }
}
