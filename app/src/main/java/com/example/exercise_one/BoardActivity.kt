package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_board.*
import kotlinx.android.synthetic.main.activity_main.*

class BoardActivity : AppCompatActivity() {
    val boardActivity = "BOARD_ACTIVITY"

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_board)
        println("$boardActivity ON_CREATE")
        val player1Name:String? = intent.getStringExtra("Player_1")
        val player2Name:String? = intent.getStringExtra("Player_2")
        textView.text = "$player1Name VS $player2Name"
    }
    override fun onStart() {
        super.onStart()
        println("$boardActivity ON_START")

    }

    override fun onResume() {
        super.onResume()
        println("$boardActivity ON_RESUME")

    }

    override fun onPause() {
        super.onPause()
        println("$boardActivity ON_PAUSE")

    }

    override fun onStop() {
        super.onStop()
        println("$boardActivity ON_STOP")
    }

    override fun onDestroy() {
        super.onDestroy()
        println("$boardActivity ON_DESTROY")
    }

    fun flip(view: View) {
        println(view.tag)
    }

    fun back(view: View) {
        // cara yang salah
//        val intent = Intent(this,MainActivity::class.java)
//        startActivity(intent)

        // cara pertama
//        finish()
        //cara kedua
        onBackPressed()
    }


}
