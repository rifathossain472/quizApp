package com.esports.quizapp

import java.io.Serializable

data class Quiz(
    val questionNumber: String,
    val questionName: String,
    val options: List<String>,
    val correctAnswer: Int
): Serializable
