package com.esports.quizapp

object LocalDataSource {
    val questions = mutableListOf<Quiz>(
        Quiz(
            "Question Number- 0",
            "বাংলাদেশের রাজধানীর নাম কি?",
            listOf("ঢাকা", "বরিশাল", "সিলেট", "রংপুর"),
            0
        ),
        Quiz(
            "Question Number- 1",
            "What is the sum of 1+1 in binary?",
            listOf(
                "Sum = 2 & Carry = 0",
                "Sum = 1 & Carry = 0",
                "Sum = 0 & Carry = 1",
                "None of above"
            ),
            2
        ),
        Quiz(
            "Question Number- 2",
            "What is the decimal equivalent of binary 1010?",
            listOf("8", "9", "10", "11"),
            2
        ),
        Quiz("Question Number- 3",
            "What is 5 AND 3 in binary?",
            listOf("1", "3", "5", "7"),
            1
        ),
        Quiz(
            "Question Number- 4",
            "Which number system uses base 16?",
            listOf("Binary", "Octal", "Hexadecimal", "Decimal"),
            2
        ),
        Quiz(
            "Question Number- 5",
            "What is the largest digit in hexadecimal?",
            listOf("7", "9", "F", "15"),
            2
        ),
        Quiz(
            "Question Number- 6",
            "What is the 2's complement of binary 1010?",
            listOf("0101", "0110", "1010", "0111"),
            2
        ),
        Quiz(
            "Question Number- 7",
            "What does LSB stand for?",
            listOf(
                "Last Significant Bit",
                "Least Significant Bit",
                "Lower Small Bit",
                "Lowest Sub Bit"
            ),
            1
        ),
        Quiz(
            "Question Number- 8",
            "What is the binary equivalent of the decimal number 15?",
            listOf("1111", "1010", "1110", "1001"),
            0
        ),
        Quiz(
            "Question Number- 9",
            "Which logic gate outputs 1 only if both inputs are 1?",
            listOf("OR", "AND", "XOR", "NOT"),
            1
        ),
        Quiz(
            "Question Number- 10",
            "Which gate is used to invert a binary value?",
            listOf("AND", "OR", "XOR", "NOT"),
            3
        )

    )

}