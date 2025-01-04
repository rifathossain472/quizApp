package com.esports.quizapp

import android.util.Log
import androidx.lifecycle.ViewModel

class PlayViewModel : ViewModel() {
    private var score: Int = 0
    private var currentIndex = 0
    private var wrongAnswer = 0
    private val quizList = LocalDataSource.questions
    private var wrongAnswerList = mutableListOf<Int>()

    fun getCurrentQuestion(): Quiz {
        return quizList[currentIndex]
    }

    fun getNextQuestion(): Quiz? {
        currentIndex++
        return if (currentIndex < quizList.size) {
            quizList[currentIndex]
        } else {
            null
        }
    }

    fun checkAnswer(selectAnswer: Int) {
        val currentQuiz = quizList[currentIndex]
        if (selectAnswer == currentQuiz.correctAnswer) {
            score++
        } else {
            wrongAnswer++
            wrongAnswerList.add(currentIndex)
            Log.d("TAG", "checkAnswer: $wrongAnswerList")
        }
    }

    fun retrieveScore(): Int {
        return score
    }

    fun getWrongAnswer(): Int {
        return wrongAnswer
    }

    fun getRightAnswer(): Int{
        return (quizList.size - wrongAnswer)
    }

    fun getWrongAnswerList(): MutableList<Int> {
        return wrongAnswerList
    }


}