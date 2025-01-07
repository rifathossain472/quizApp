package com.esports.quizapp.Quiz

import android.annotation.SuppressLint
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.esports.quizapp.Data.Quiz
import com.esports.quizapp.databinding.ActivityScoreBinding

@Suppress("DEPRECATION")
class ScoreActivity : AppCompatActivity() {
    private lateinit var binding: ActivityScoreBinding
    @SuppressLint("SetTextI18n")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityScoreBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val score = intent.getIntExtra("score", 0)
        val rightAnswer = intent.getIntExtra("right", 0)
        val wrongAnswer = intent.getIntExtra("wrong", 0)
        val wrongQuestions = intent.getSerializableExtra("wrongAnswerList") as? ArrayList<Quiz>


        Log.d("ScoreActivity", "Wrong Answer List: $wrongQuestions")

        binding.apply {
            scoreTv.text = "Your Score is: $score"
            rightAnswerTv.text = "Right Answer: $rightAnswer"
            wrongAnswerTv.text = "Wrong Answer: $wrongAnswer"
        }

        binding.btnCheckWrongAnswer.setOnClickListener {
            val intent = Intent(this@ScoreActivity, WrongAnswerActivity::class.java)
            intent.putExtra("wrongAnswerList", wrongQuestions)
            startActivity(intent)
        }



    }
}