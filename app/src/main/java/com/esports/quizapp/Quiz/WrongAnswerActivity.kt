package com.esports.quizapp.Quiz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.esports.quizapp.Data.LocalDataSource
import com.esports.quizapp.databinding.ActivityWrongAnswerBinding
import com.esports.quizapp.recyleView.Adapter

class WrongAnswerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWrongAnswerBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWrongAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val wrongAnswerList = intent.getIntegerArrayListExtra("wrongAnswerList") ?: arrayListOf()

        Log.d("WrongAnswerActivity", "Wrong Answer List: $wrongAnswerList")

        val wrongQuestions = wrongAnswerList.map { index ->
            LocalDataSource.questions[index]
        }

        Log.d("TAG", "Wrong = $wrongQuestions ")


        adapter = Adapter(wrongQuestions)
        binding.rvLayout.adapter = adapter
    }
}
