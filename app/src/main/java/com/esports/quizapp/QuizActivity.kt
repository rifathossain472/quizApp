package com.esports.quizapp

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.esports.quizapp.databinding.ActivityResultBinding
import androidx.activity.viewModels


class QuizActivity : AppCompatActivity() {

    private val viewModel: PlayViewModel by viewModels()

    private lateinit var binding: ActivityResultBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        showCurrentQuestion()

        binding.btnNextQuestion.setOnClickListener {
            val selectIndex = binding.radioGroup.indexOfChild(
                findViewById(binding.radioGroup.checkedRadioButtonId)
            )
            if (selectIndex != -1) {
                viewModel.checkAnswer(selectIndex)
                setNextQuestion()
            } else {
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }
        /*val aa = viewModel.getWrongAnswerList()
        Log.d("wrong", "wrong answer = $aa")*/


    }

    private fun setNextQuestion() {
        val nextQuestion = viewModel.getNextQuestion()
        if (nextQuestion != null) {
            showCurrentQuestion()
        } else {
            val wrongAnswerList = ArrayList(viewModel.getWrongAnswerList())
            Log.d("wrong", "Final wrong answer list: $wrongAnswerList")
            val scoreIntent = Intent(this@QuizActivity, ScoreActivity::class.java)
            scoreIntent.putExtra("score", viewModel.retrieveScore())
            scoreIntent.putExtra("right", viewModel.getRightAnswer())
            scoreIntent.putExtra("wrong", viewModel.getWrongAnswer())
            scoreIntent.putIntegerArrayListExtra("wrongAnswerList", wrongAnswerList)
            startActivity(scoreIntent)
        }
    }

    private fun showCurrentQuestion() {
        val currentQuiz = viewModel.getCurrentQuestion()

        binding.apply {
            questionNumberTv.text = currentQuiz.questionNumber
            questionNameTv.text = currentQuiz.questionName
            option0.text = currentQuiz.options[0]
            option1.text = currentQuiz.options[1]
            option2.text = currentQuiz.options[2]
            option3.text = currentQuiz.options[3]
            radioGroup.clearCheck()
        }
    }

}