package com.esports.quizapp

data class Quiz(
    val questionNumber: Int,
    val questionName: String,
    val options: List<String>,
    val correctAnswer: Int
)
