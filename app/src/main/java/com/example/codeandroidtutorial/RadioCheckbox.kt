package com.example.codeandroidtutorial

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.view.View
import android.widget.RadioButton
import android.widget.RadioGroup
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.activity_radio_checkbox.*
import kotlinx.android.synthetic.main.activity_radio_checkbox.next

class RadioCheckbox : AppCompatActivity() {


    lateinit var rbMale: RadioButton
    lateinit var rbFemale: RadioButton
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_radio_checkbox)

        nameEditText.addTextChangedListener(object: TextWatcher{
            override fun afterTextChanged(s: Editable?) {

            }

            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {

            }

            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                nameTextView.text= s
            }
        } )

        submit.setOnClickListener (View.OnClickListener {
            var result= ""
            if (gender.checkedRadioButtonId != -1){
                    result += "Select Gender:"
                if (male.isChecked)
                    result += "male \n"
                else if(female.isChecked)
                    result += "female \n"
                else if(trans.isChecked)
                    result += "trans \n"
                else if(bisexual.isChecked)
                    result += "bisexual \n"
            }
            result += "language Known:  "

            if (english.isChecked)
                result += "english, "
            if(hausa.isChecked)
                result += "hausa, "
            if (yoruba.isChecked)
                result += "yoruba,"
            if (spanish.isChecked)
                result += "spanish"

            results.text= result
        })
    }
}
