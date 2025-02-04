package com.esports.quizapp.Quiz

import android.content.Intent
import android.os.Bundle
import android.util.Log
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.esports.quizapp.databinding.ActivityResultBinding
import androidx.activity.viewModels
import com.esports.quizapp.Data.LocalDataSource
import com.esports.quizapp.Data.LocalDataSource.questionsMathematics
import com.esports.quizapp.Data.Quiz
import com.esports.quizapp.ViewModel.PlayViewModel


class QuizActivity : AppCompatActivity() {

    private val viewModel: PlayViewModel by viewModels()

    private lateinit var binding: ActivityResultBinding

    private lateinit var subjectName: String
    private lateinit var quizList: MutableList<Quiz>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityResultBinding.inflate(layoutInflater)
        setContentView(binding.root)

        subjectName = intent.getStringExtra("name").toString()

        Log.d("TAG", "onCreate: success $subjectName")

        quizList = when (subjectName) {
            "math" -> questionsMathematics
            "physics" -> {
                LocalDataSource.questionsPhysics
            }
            "chemistry" -> {
                LocalDataSource.questionsChemistry
            }
            "economics" -> {
                LocalDataSource.questionsEconomics
            }
            "computerScience" -> {
                LocalDataSource.questionsComputerScience
            }
            "cricket" -> {
                LocalDataSource.questionsCricket
            }
            "football" -> {
                LocalDataSource.questionsFootball
            }
            "movies" -> {
                LocalDataSource.questionsMovies
            }
            "programming" -> {
                LocalDataSource.questionsProgramming
            }

            else -> {
                LocalDataSource.questions
            }
        }


        showCurrentQuestion()

        binding.btnNextQuestion.setOnClickListener {
            val selectIndex = binding.radioGroup.indexOfChild(
                findViewById(binding.radioGroup.checkedRadioButtonId)
            )
            if (selectIndex != -1) {
                viewModel.checkAnswer(selectIndex, quizList)
                Log.d("TAG", "select: $quizList")
                setNextQuestion()
            } else {
                Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
            }
        }

    }


    private fun setNextQuestion() {
        val nextQuestion = viewModel.getNextQuestion(quizList)
        if (nextQuestion != null) {
            showCurrentQuestion()
        } else {
            val wrongAnswerList = ArrayList(viewModel.getWrongAnswerList())

            val wrongQuestions = wrongAnswerList.map { index ->
                quizList[index]
            } as ArrayList<Quiz>

            Log.d("wrongAnswerList", "Final wrong answer list: $wrongAnswerList")
            Log.d("wrongAnswerListff", "Final wrong answer list: $wrongQuestions")
            val scoreIntent = Intent(this@QuizActivity, ScoreActivity::class.java)
            scoreIntent.putExtra("score", viewModel.retrieveScore())
            scoreIntent.putExtra("right", viewModel.getRightAnswer(quizList))
            scoreIntent.putExtra("wrong", viewModel.getWrongAnswer())
            scoreIntent.putExtra("wrongAnswerList", wrongQuestions)
            startActivity(scoreIntent)
        }
    }

    private fun showCurrentQuestion() {
        val currentQuiz = viewModel.getCurrentQuestion(quizList)

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