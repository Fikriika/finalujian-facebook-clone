package com.example.fikri_facebookclone.Model

import com.google.gson.annotations.SerializedName

data class Posts (
    @SerializedName("sender")
    var sender: String,

    @SerializedName("post")
    var post: String,

    @SerializedName("date")
    var date: String,

    @SerializedName("likes")
    var likes: String,

    @SerializedName("comments")
    var comment: String,

    @SerializedName("first_comment")
    var comment_first: String,

    @SerializedName("first_comment_sender")
    var sender_first_comment: String
)
