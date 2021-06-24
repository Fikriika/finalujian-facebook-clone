package com.example.fikri_facebookclone

import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.RecyclerView
import com.example.fikri_facebookclone.Model.Posts
import com.example.fikri_facebookclone.Network.ApiClient
import com.example.fikri_facebookclone.R
import kotlinx.coroutines.Dispatchers

class PostsActivity: AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_posts)

        val header = findViewById<TextView>(R.id.hd_posts)
        val posts =intent.getStringExtra("posts")
        header.setText(posts)


        var listtweet : List<Posts> = listOf()
        lifecycleScope.launchWhenCreated {
            with (Dispatchers.IO) {
                val response: List<Posts> = ApiClient.getApiService().getPosts()

                listtweet = response
                println(("checksize ${listtweet.size}"))

                val adapterposts = PostsAdapter(listtweet)

                val rvposts =findViewById<RecyclerView>(R.id.rv_posts)
                rvposts.adapter = adapterposts
            }
        }
    }
}