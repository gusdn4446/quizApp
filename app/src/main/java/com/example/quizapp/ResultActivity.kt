package com.example.quizapp

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        var tv_result = findViewById<TextView>(R.id.tv_result)
        var tv_name = findViewById<TextView>(R.id.tv_name)
        var tv_score = findViewById<TextView>(R.id.tv_score)
        var btn_finish = findViewById<Button>(R.id.btn_finish)

        val username = intent.getStringExtra(Constants.USER_NAME)
        tv_name.text = username
        val totalQuestions = intent.getIntExtra(Constants.TOTAL_QUESTIONS, 0)
        val correctAnswers = intent.getIntExtra(Constants.CORRECT_ANSWERS, 0)

        tv_score.text = "당신의 점수는 $correctAnswers / $totalQuestions 입니다 ^^"

        btn_finish.setOnClickListener {
            startActivity(Intent(this, MainActivity::class.java))
        }
    }
}