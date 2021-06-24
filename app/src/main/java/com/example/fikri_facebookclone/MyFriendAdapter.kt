package com.example.fikri_facebookclone

import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.fikri_facebookclone.Model.Friends
import com.example.fikri_facebookclone.R

class MyFriendAdapter(private val list: List<Friends>) : RecyclerView.Adapter<MyFriendAdapter.ViewHolder>() {

    inner class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val context = parent.context
        val inflater = LayoutInflater.from(context)
        val view = inflater.inflate(R.layout.item_myfriends,parent, false)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val nama = holder.itemView.findViewById<TextView>(R.id.dt_nm)
        val jmlmutual = holder.itemView.findViewById<TextView>(R.id.jumlah)


        nama.text = list[position].nama
        jmlmutual.text = list[position].mutual



        nama.setOnClickListener {
            val context= it.context
            val intent = Intent(context, dt_friends_Activity::class.java )
            intent.putExtra("namanya", list[position].nama)
            context.startActivity(intent)
        }




    }

    override fun getItemCount(): Int {
        return list.size
    }


}
