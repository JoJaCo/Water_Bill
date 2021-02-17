package com.calivera.andriod.waterbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btn_start.setOnClickListener(){
            if (account_number.text.toString().isEmpty()){
                Toast.makeText(
                    this,
                    "please enter your Account Number",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
                Toast.makeText(this,
                "you entered ${account_number.text.toString()} as your Account Number",
                Toast.LENGTH_SHORT).show()
            }
        }


    }
}