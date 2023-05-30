package com.example.adressbook2204

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.adressbook2204.api.RetrofitClient
import com.example.adressbook2204.models.User
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import kotlin.math.log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var call = RetrofitClient.service.getAllUsers()

        call.enqueue(object : Callback<List<User>> {
            override fun onFailure(call: Call<List<User>>, t: Throwable) {


                Log.i("TAG", "onFailure: ${t.message} ")

            }

            override fun onResponse(call: Call<List<User>>, response: Response<List<User>>) {
                var userList = response.body()

                userList?.forEach {

                    Log.i("TAG", "User : $it ")


                }


            }
        })


    }


}