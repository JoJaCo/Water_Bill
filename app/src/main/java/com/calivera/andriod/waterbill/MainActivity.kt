package com.calivera.andriod.waterbill

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    private var aAccountList : ArrayList<FakeAccounts>? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_FULLSCREEN
        //full screen no decor

        aAccountList = AccountInfo.getInfo()

        //Checks if user entered something
        btn_start.setOnClickListener(){
            if (account_number.text.toString().isEmpty()){
                Toast.makeText(
                    this,
                    "please enter your Account Number",
                    Toast.LENGTH_SHORT
                ).show()
            }else{
               val accNum = account_number.text.toString()
                val accNam = account_name.text.toString()

                checkInfo(accNum, accNam)
            }
        }


    }

    private fun checkInfo(number: String, name:String) {
        TODO("check if the name is in the data base")
    }
}