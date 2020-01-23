package com.example.myapp1fuel

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.github.kittinunf.fuel.Fuel
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        buttonClickMe.setOnClickListener{
              Fuel.get("https://jsonplaceholder.typicode.com/posts")
                  .response { request, response, result ->
//                    println(request)
                    println(response)
                    val (bytes, error) = result
                    if (bytes != null) {
                        println("[response bytes] ${String(bytes)}")
                    }
                }
        }


    }

    override fun onResume() {
        super.onResume()
//
    }




}


