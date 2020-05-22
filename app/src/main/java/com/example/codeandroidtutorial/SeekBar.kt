package com.example.codeandroidtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.SeekBar
import android.widget.TextView
import kotlinx.android.synthetic.main.activity_seek_bar.*

class SeekBar : AppCompatActivity() {


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_seek_bar)

        nextRV.setOnClickListener {
            val intent = Intent(this, Main2Activity::class.java)
            startActivity(intent)
        }

        next.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        val slider = sbSlider
        val result = tvResult
        slider.setOnSeekBarChangeListener(object : SeekBar.OnSeekBarChangeListener{
            override fun onProgressChanged(seekBar: SeekBar?, progress: Int, fromUser: Boolean) {
                result.text= progress.toString()
            }

            override fun onStartTrackingTouch(seekBar: SeekBar) {
                result.text= seekBar.progress.toString()
            }

            override fun onStopTrackingTouch(seekBar: SeekBar) {
                result.text=  seekBar.progress.toString()
            }
        })



    }
}
