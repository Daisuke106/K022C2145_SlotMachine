package com.example.k022c2145_slotmachine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameOver : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_over)

        //viewの取得
        val btnOverReplay: Button = findViewById(R.id.btnOverReplay)

        btnOverReplay.setOnClickListener {
            //アクティビティ画面の終了
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}