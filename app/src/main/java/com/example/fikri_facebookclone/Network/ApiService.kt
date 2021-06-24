package com.example.fikri_facebookclone.Model




import retrofit2.http.GET
interface ApiService {
    @GET("nashihu/production_stuff/master/hlv_apr21/facebook.json")
    suspend fun getPosts(): List<Posts>
}