package com.example.exercise_one

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_main.view.*
import kotlinx.android.synthetic.main.activity_main.view.player1
import kotlinx.android.synthetic.main.activity_main.view.player2
//import kotlinx.android.synthetic.main.activity_main.view.name_text

class MainActivity : AppCompatActivity(),View.OnClickListener {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // buat/set event listener
        tekan_button.setOnClickListener(this)

    }

    // cara manual / cara kedua
    override fun onClick(v: View?) {
        when(v){
            tekan_button -> SecondActivity()
        }
    }

    fun SecondActivity(){
        val intent = Intent(this,SecondActivity::class.java)
        intent.putExtra("Player_1",player1.text.toString())
        intent.putExtra("Player_2",player2.text.toString())
        startActivity(intent)
    }

//    fun showName(){
//        val name = input_name.text.toString()
//        name_text.text = name
//    }

    // cara yg pertama 1
    //    fun handlePencet(view: View) {
//        println("INI ADALAH VIEW NYA: $view")
//        val name = input_name.text.toString()
//        name_text.text = name
//    }
}
