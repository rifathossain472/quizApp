package com.esports.quizapp.Data

import java.io.Serializable

data class Quiz(
    val questionNumber: String,
    val questionName: String,
    val options: List<String>,
    val correctAnswer: Int
): Serializable
