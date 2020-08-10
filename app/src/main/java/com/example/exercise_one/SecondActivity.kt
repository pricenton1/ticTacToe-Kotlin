package com.example.exercise_one

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_second.*

class SecondActivity : AppCompatActivity(){

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)

        val player1Name: String? = intent.getStringExtra("Player_1")
//        val player2Name: String? = intent.getStringExtra("Player_2")
        playerName.text = "$player1Name's Turn"

    }
    var player = 1

    fun playGame(view: View) {
        val player1Name: String? = intent.getStringExtra("Player_1")
        val player2Name: String? = intent.getStringExtra("Player_2")

        var buttonList = arrayOf(button1,button2,button3,button4,button5,button6,button7,button8,button9)
        for(button in buttonList){
            if(button.tag == view.tag){
                if(player==1){
                    player = 2
                    button.text = "X"
                    button.isEnabled = false
                    playerName.text = "$player2Name's Turn"
                }else{
                    player = 1
                    button.text = "O"
                    button.isEnabled = false
                    playerName.text = "$player1Name's Turn"
                }
            }
        }
    }

}
