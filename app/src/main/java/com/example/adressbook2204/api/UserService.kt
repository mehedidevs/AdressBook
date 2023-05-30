package com.example.adressbook2204.api

import com.example.adressbook2204.models.User
import retrofit2.Call
import retrofit2.http.GET

interface UserService {

    @GET("users")
    fun getAllUsers(): Call<List<User>>


}