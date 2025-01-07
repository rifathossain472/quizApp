package com.esports.quizapp.Quiz

import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.esports.quizapp.Data.Quiz
import com.esports.quizapp.databinding.ActivityWrongAnswerBinding
import com.esports.quizapp.recyleView.Adapter

class WrongAnswerActivity : AppCompatActivity() {

    private lateinit var binding: ActivityWrongAnswerBinding
    private lateinit var adapter: Adapter
    private lateinit var wrongQuestions: MutableList<Quiz>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityWrongAnswerBinding.inflate(layoutInflater)
        setContentView(binding.root)


        wrongQuestions = intent.getSerializableExtra("wrongQuestions") as MutableList<Quiz>


        Log.d("WrongAnswerActivity", "Wrong Answer List: $wrongQuestions")

       // val wrong = LocalDataSource.questions

        /*val wrongQuestions = wrongAnswerList.map { index ->
            LocalDataSource.questions[index]
        }*/

        Log.d("TAG", "Wrong = $wrongQuestions ")


        adapter = Adapter(wrongQuestions)
        binding.rvLayout.adapter = adapter
    }
}
