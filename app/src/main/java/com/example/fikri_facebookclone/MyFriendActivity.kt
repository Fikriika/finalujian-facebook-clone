package com.example.fikri_facebookclone

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.RecyclerView
import com.example.fikri_facebookclone.Model.Friends
import com.example.fikri_facebookclone.R


class MyFriendActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContentView(R.layout.activity_myfriends)
        var friendlist= listOf(
            Friends("Budi","25"),
            Friends("Adam","30"),
            Friends("Tendi","10")

            )
        val friendadapter = MyFriendAdapter(friendlist)

        val rv =findViewById<RecyclerView>(R.id.rv_friends)
        rv.adapter =friendadapter
    }
}