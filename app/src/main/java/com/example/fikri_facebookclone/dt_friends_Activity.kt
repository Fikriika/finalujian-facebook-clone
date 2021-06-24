package com.example.fikri_facebookclone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.example.fikri_facebookclone.R

class dt_friends_Activity: AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_dt_myfriends)


        val namafriends = findViewById<TextView>(R.id.fullname)
        val header = findViewById<TextView>(R.id.hd_dt_myfriend)

        val headernama = intent.getStringExtra("namanya")
        header.setText(headernama)
        val datanama = intent.getStringExtra("namanya")
        namafriends.setText(datanama)


    }

}