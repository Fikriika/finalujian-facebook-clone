package com.example.fikri_facebookclone

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fikri_facebookclone.Model.Friends
import com.example.fikri_facebookclone.Model.Posts
import com.example.fikri_facebookclone.R


class PostsAdapter(private val list: List<Posts>) : RecyclerView.Adapter<PostsAdapter.ViewHolder>() {

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): PostsAdapter.ViewHolder {
        val context =parent.context
        val inflater = LayoutInflater.from(context)
        val view =inflater.inflate(R.layout.item_posts, parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: PostsAdapter.ViewHolder, position: Int) {
        val textuser = holder.itemView.findViewById<TextView>(R.id.nmsender)
        textuser.text = list[position].sender

        val txttanggal = holder.itemView.findViewById<TextView>(R.id.tglposts)
        txttanggal.text = list[position].date

        val isiposts = holder.itemView.findViewById<TextView>(R.id.isiposts)
        isiposts.text = list[position].post

        val jmllike = holder.itemView.findViewById<TextView>(R.id.like)
        jmllike.text = list[position].likes

        val jmlcomment = holder.itemView.findViewById<TextView>(R.id.comment)
        jmlcomment.text = list[position].comment

        val nmcomment = holder.itemView.findViewById<TextView>(R.id.nmfirstcomment)
        nmcomment.text = list[position].sender_first_comment

        val isicomment = holder.itemView.findViewById<TextView>(R.id.firstcomment)
        isicomment.text = list[position].comment_first
    }

    override fun getItemCount(): Int {
        return list.size
    }

}