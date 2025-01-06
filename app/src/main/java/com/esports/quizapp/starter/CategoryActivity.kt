package com.esports.quizapp.starter

import android.content.Intent
import android.os.Bundle
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.esports.quizapp.Data.Category
import com.esports.quizapp.Data.LocalDataSource
import com.esports.quizapp.Quiz.QuizActivity
import com.esports.quizapp.R
import com.esports.quizapp.databinding.ActivityCategoryBinding
import com.esports.quizapp.recyleView.Adapter2

class CategoryActivity : AppCompatActivity(), Adapter2.HandleUserClick {
    private lateinit var binding: ActivityCategoryBinding
    private lateinit var adapter2: Adapter2
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityCategoryBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val listOfImage = listOf(
            R.drawable.math,
            R.drawable.physics,
            R.drawable.chemistry,
            R.drawable.economics,
            R.drawable.computerscience,
            R.drawable.cricket,
            R.drawable.football,
            R.drawable.movies,
            R.drawable.programming,
        )

        val category = listOf<Category>(
            Category(
                "Mathematics",
                LocalDataSource.questionsMathematics.size,
                listOfImage[0],
                "math"
            ),
            Category("Physics", LocalDataSource.questionsPhysics.size, listOfImage[1], "physics"),
            Category(
                "Chemistry",
                LocalDataSource.questionsChemistry.size,
                listOfImage[2],
                "chemistry"
            ),
            Category(
                "Economics",
                LocalDataSource.questionsEconomics.size,
                listOfImage[3],
                "economics"
            ),
            Category(
                "Computer Science",
                LocalDataSource.questionsComputerScience.size,
                listOfImage[4],
                "computerScience"
            ),
            Category("Cricket", LocalDataSource.questionsCricket.size, listOfImage[5], "cricket"),
            Category(
                "Football",
                LocalDataSource.questionsFootball.size,
                listOfImage[6],
                "football"
            ),
            Category("Movies", LocalDataSource.questionsMovies.size, listOfImage[7], "movies"),
            Category(
                "Programming",
                LocalDataSource.questionsProgramming.size,
                listOfImage[8],
                "programming"
            ),
        )

        adapter2 = Adapter2(category, this@CategoryActivity)
        binding.rvLayout.adapter = adapter2


        /*binding.mathCv.setOnClickListener {
            val mathIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            mathIntent.putExtra("name", "math")
            startActivity(mathIntent)
        }

        binding.physicsCv.setOnClickListener {
            val physicsIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            physicsIntent.putExtra("name", "physics")
            startActivity(physicsIntent)
        }

        binding.chemistryCv.setOnClickListener {
            val chemistryIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            chemistryIntent.putExtra("name", "chemistry")
            startActivity(chemistryIntent)
        }

        binding.economicsCv.setOnClickListener {
            val economicsIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            economicsIntent.putExtra("name", "economics")
            startActivity(economicsIntent)
        }

        binding.computerScienceCv.setOnClickListener {
            val computerIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            computerIntent.putExtra("name", "computerScience")
            startActivity(computerIntent)
        }
        binding.cricketCv.setOnClickListener {
            val cricketIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            cricketIntent.putExtra("name", "cricket")
            startActivity(cricketIntent)
        }

        binding.footballCv.setOnClickListener {
            val footballIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            footballIntent.putExtra("name", "football")
            startActivity(footballIntent)
        }

        binding.moviesCv.setOnClickListener {
            val moviesIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            moviesIntent.putExtra("name", "movies")
            startActivity(moviesIntent)
        }

        binding.programmingCv.setOnClickListener {
            val programmingIntent = Intent(this@CategoryActivity, QuizActivity::class.java)
            programmingIntent.putExtra("name", "programming")
            startActivity(programmingIntent)
        }*/
    }

    override fun selectQuiz(category: String) {
        val intent = Intent(this@CategoryActivity, QuizActivity::class.java)
        intent.putExtra("name", category)
        startActivity(intent)
    }
}