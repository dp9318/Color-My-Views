package com.dp.colormyviews

import android.graphics.Color
import android.os.Bundle
import android.view.View
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setListeners()
    }
    private fun setListeners(){
        val clickableViews: List<View> = listOf(
            findViewById(R.id.box_1_text),
            findViewById(R.id.box_2_text),
            findViewById(R.id.box_3_text),
            findViewById(R.id.box_4_text),
            findViewById(R.id.box_5_text),
            findViewById(R.id.constraint_layout),
            findViewById(R.id.red_button),
            findViewById(R.id.green_button),
            findViewById(R.id.yellow_button)
        )
        for (item in clickableViews){
            item.setOnClickListener{makeColor(it)}
        }
    }
    private fun makeColor(view: View){
        when(view.id){
            R.id.box_1_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_2_text -> view.setBackgroundColor(Color.DKGRAY)
            R.id.box_3_text -> view.setBackgroundResource(android.R.color.holo_green_light)
            R.id.box_4_text -> view.setBackgroundResource(android.R.color.holo_green_dark)
            R.id.box_5_text -> view.setBackgroundResource(android.R.color.holo_green_light)

            R.id.red_button -> findViewById<View>(R.id.box_3_text).setBackgroundResource(R.color.my_red)
            R.id.green_button -> findViewById<View>(R.id.box_4_text).setBackgroundResource(R.color.my_green)
            R.id.yellow_button -> findViewById<View>(R.id.box_5_text).setBackgroundResource(R.color.my_yellow)

            else -> view.setBackgroundColor(Color.LTGRAY)
        }
    }
}