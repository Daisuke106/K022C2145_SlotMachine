package com.example.k022c2145_slotmachine

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button

class GameClear : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_game_clear)

        val btnClearReplay: Button = findViewById(R.id.btnClearReplay)

        btnClearReplay.setOnClickListener {
            //アクティビティ画面の終了
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}