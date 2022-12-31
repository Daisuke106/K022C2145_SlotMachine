package com.example.k022c2145_slotmachine

import android.annotation.SuppressLint
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.*
import androidx.appcompat.app.AlertDialog
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    @SuppressLint("MissingInflatedId", "ResourceType")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        //Viewの取得
        var score1: ImageView = findViewById(R.id.Score1)
        var score2: ImageView = findViewById(R.id.Score2)
        var score3: ImageView = findViewById(R.id.Score3)

        var btnScore1: ImageView = findViewById(R.id.btnScore1)
        var btnScore2: ImageView = findViewById(R.id.btnScore2)
        var btnScore3: ImageView = findViewById(R.id.btnScore3)

        val btnReplay: Button = findViewById(R.id.btnReplay)
        val btnStart: Button = findViewById(R.id.btnStart)

        val et: EditText = findViewById(R.id.et)

        val Zankin: TextView = findViewById(R.id.Zankin)
        val kaitou: TextView = findViewById(R.id.Kaitosu)

        //回数カウン０クリア
        var num: Int = 0
        var zankinda: Int

        //スタートボタンを押したら
        btnStart.setOnClickListener {

            //数が入力されていない場合
            if (et.text.toString().equals("")) {
                Toast.makeText(this, "所持金を入力してください", Toast.LENGTH_LONG).show()
                //アラート　ダイアログ
                AlertDialog.Builder(this)
                    .setTitle("K022C2145 エラー発生")
                    .setMessage("スロットに使う金額を入力してください")
                    .setPositiveButton("閉じる", null)
                    .show()

            } else {
                if (num >= 0) {
                    zankinda = et.text.toString().toInt()

                    Zankin.text = zankinda.toString()

                    //回数のカウントアップと表示
                    num++ //インクリメント（値を１ずつ増やす）num = num + 1と同じ
                    kaitou.text = "回答数\n" + num + "回目"
                }
            }

            if (num == 10) { //Sooreが-５になったときの画面遷移
                val intent = Intent(this, GameOver::class.java)
                startActivity(intent)
                finish()
            }
        }
        btnScore1.setOnClickListener {

            //数が入力されていない場合
            if (et.text.toString().equals("")) {
                Toast.makeText(this, "所持金を入力してください", Toast.LENGTH_LONG).show()
                //アラート　ダイアログ
                AlertDialog.Builder(this)
                    .setTitle("K022C2145 エラー発生")
                    .setMessage("スロットに使う金額を入力してください")
                    .setPositiveButton("閉じる", null)
                    .show()

            } else {

                btnScore1.setImageResource(R.drawable.push_button_blk)

                val Slot: Array<String> = arrayOf("1", "2", "3", "4", "5", "6")
                val num = Random.nextInt(Slot.count())

                if (num == 0) {
                    score1.setImageResource(R.drawable.slot01)
                    zankinda = (Zankin.text.toString().toInt() - 100)

                    Zankin.text = zankinda.toString()
                }

                if (num == 1) {
                    score1.setImageResource(R.drawable.slot02)
                    zankinda = (Zankin.text.toString().toInt() - 200)

                    Zankin.text = zankinda.toString()
                }

                if (num == 2) {
                    score1.setImageResource(R.drawable.slot03)
                    zankinda = (Zankin.text.toString().toInt() - 300)

                    Zankin.text = zankinda.toString()
                }

                if (num == 3) {
                    score1.setImageResource(R.drawable.slot04)
                    zankinda = (Zankin.text.toString().toInt() - 300)

                    Zankin.text = zankinda.toString()
                }

                if (num == 4) {
                    score1.setImageResource(R.drawable.slot05)
                    zankinda = (Zankin.text.toString().toInt() - 600)

                    Zankin.text = zankinda.toString()
                }

                if (num == 5) {
                    score1.setImageResource(R.drawable.slot06)
                    zankinda = (Zankin.text.toString().toInt() + 1000)

                    Zankin.text = zankinda.toString()
                }

                if (num == 15) { //Sooreが５になったときの画面遷移
                    val intent = Intent(this, GameClear::class.java)
                    startActivity(intent)
                    finish()
                }
                zankinda = Zankin.text.toString().toInt()
                if (zankinda <= 0) {

                    val intent = Intent(this, GameOver::class.java)
                    startActivity(intent)
                    finish()
                }
            }
        }


        btnScore2.setOnClickListener {

            //数が入力されていない場合
            if (et.text.toString().equals("")) {
                Toast.makeText(this, "所持金を入力してください", Toast.LENGTH_LONG).show()
                //アラート　ダイアログ
                AlertDialog.Builder(this)
                    .setTitle("K022C2145 エラー発生")
                    .setMessage("スロットに使う金額を入力してください")
                    .setPositiveButton("閉じる", null)
                    .show()

            } else {

                btnScore2.setImageResource(R.drawable.push_button_blk)

                val Slot: Array<String> = arrayOf("1", "2", "3", "4", "5", "6")
                var num = Random.nextInt(Slot.count())



                if (num == 0) {
                    score2.setImageResource(R.drawable.slot01)
                    zankinda = (Zankin.text.toString().toInt() - 100)

                    Zankin.text = zankinda.toString()
                }

                if (num == 1) {
                    score2.setImageResource(R.drawable.slot02)
                    zankinda = (Zankin.text.toString().toInt() - 200)

                    Zankin.text = zankinda.toString()
                }

                if (num == 2) {
                    score2.setImageResource(R.drawable.slot03)
                    zankinda = (Zankin.text.toString().toInt() - 300)

                    Zankin.text = zankinda.toString()
                }

                if (num == 3) {
                    score2.setImageResource(R.drawable.slot04)
                    zankinda = (Zankin.text.toString().toInt() - 300)

                    Zankin.text = zankinda.toString()
                }

                if (num == 4) {
                    score2.setImageResource(R.drawable.slot05)
                    zankinda = (Zankin.text.toString().toInt() - 600)

                    Zankin.text = zankinda.toString()
                }

                if (num == 5) {
                    score2.setImageResource(R.drawable.slot06)
                    zankinda = (Zankin.text.toString().toInt() + 1000)

                    Zankin.text = zankinda.toString()
                }

                if (num == 15) { //Sooreが５になったときの画面遷移
                    val intent = Intent(this, GameClear::class.java)
                    startActivity(intent)
                    finish()
                }
                zankinda = Zankin.text.toString().toInt()
                if (zankinda <= 0) { //Sooreが-５になったときの画面遷移
                    val intent = Intent(this, GameOver::class.java)
                    startActivity(intent)
                    finish()

                }

            }
            btnScore3.setOnClickListener {

                //数が入力されていない場合
                if (et.text.toString().equals("")) {
                    Toast.makeText(this, "所持金を入力してください", Toast.LENGTH_LONG).show()
                    //アラート　ダイアログ
                    AlertDialog.Builder(this)
                        .setTitle("K022C2145 エラー発生")
                        .setMessage("スロットに使う金額を入力してください")
                        .setPositiveButton("閉じる", null)
                        .show()
                } else {


                    btnScore3.setImageResource(R.drawable.push_button_blk)


                    val Slot: Array<String> = arrayOf("1", "2", "3", "4", "5", "6")
                    var num = Random.nextInt(Slot.count())


                    if (num == 0) {
                        score3.setImageResource(R.drawable.slot01)
                        zankinda = (Zankin.text.toString().toInt() - 100)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 1) {
                        score3.setImageResource(R.drawable.slot02)
                        zankinda = (Zankin.text.toString().toInt() - 200)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 2) {
                        score3.setImageResource(R.drawable.slot03)
                        zankinda = (Zankin.text.toString().toInt() - 300)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 3) {
                        score3.setImageResource(R.drawable.slot04)
                        zankinda = (Zankin.text.toString().toInt() - 300)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 4) {
                        score3.setImageResource(R.drawable.slot05)
                        zankinda = (Zankin.text.toString().toInt() - 600)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 5) {
                        score3.setImageResource(R.drawable.slot06)
                        zankinda = (Zankin.text.toString().toInt() + 1000)

                        Zankin.text = zankinda.toString()
                    }

                    if (num == 15) { //Sooreが５になったときの画面遷移
                        val intent = Intent(this, GameClear::class.java)
                        startActivity(intent)
                        finish()
                    }
                    zankinda = Zankin.text.toString().toInt()

                    if (zankinda <= 0) { //Sooreが-５になったときの画面遷移
                        val intent = Intent(this, GameOver::class.java)
                        startActivity(intent)
                        finish()
                    }
                }
            }
            btnReplay.setOnClickListener {

                //数が入力されていない場合
                if (et.text.toString().equals("")) {
                    Toast.makeText(this, "所持金を入力してください", Toast.LENGTH_LONG).show()
                    //アラート　ダイアログ
                    AlertDialog.Builder(this)
                        .setTitle("K022C2145 エラー発生")
                        .setMessage("スロットに使う金額を入力してください")
                        .setPositiveButton("閉じる", null)
                        .show()
                } else {

                    //回数のカウントアップと表示
                    num++ //インクリメント（値を１ずつ増やす）num = num + 1と同じ
                    kaitou.text = "回答数\n" + num + "回目"


                    btnScore1.setImageResource(R.drawable.push_button_red)
                    btnScore2.setImageResource(R.drawable.push_button_red)
                    btnScore3.setImageResource(R.drawable.push_button_red)

                    if (num == 15) { //Sooreが５になったときの画面遷移
                        val intent = Intent(this, GameClear::class.java)
                        startActivity(intent)
                        finish()
                    }
                    }
                }
            }
        }
        }

