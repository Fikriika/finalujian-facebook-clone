package com.example.fikri_facebookclone

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.TextView
import com.example.fikri_facebookclone.R


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val tmblprofile = findViewById<View>(R.id.Profile)
        val textprofile = findViewById<TextView>(R.id.txtprofile)


        tmblprofile.setOnClickListener {
            val context = it.context
            val intent = Intent(context, ProfileActivity::class.java)
            intent.putExtra("profile", textprofile.text)
            context.startActivity(intent)
        }

        val tmblposts = findViewById<TextView>(R.id.txtpost)

        tmblposts.setOnClickListener {
            val context = it.context
            val intent = Intent(context, PostsActivity::class.java)
            intent.putExtra("posts", tmblposts.text)
            context.startActivity(intent)
        }

        val tmblmyfriend = findViewById<TextView>(R.id.txtmyfriend)

        tmblmyfriend.setOnClickListener {
            val context = it.context
            val intent = Intent(context, MyFriendActivity::class.java)
            intent.putExtra("tweets", tmblmyfriend.text)
            context.startActivity(intent)
        }
    }
}