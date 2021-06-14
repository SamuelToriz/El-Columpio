package com.example.elcolumpio

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.android.volley.RequestQueue
import com.android.volley.Response
import com.android.volley.toolbox.StringRequest
import com.android.volley.toolbox.Volley
import com.example.elcolumpio.databinding.ActivityMenuBinding

class MenuActivity : AppCompatActivity()
{
    private lateinit var binding : ActivityMenuBinding
    private lateinit var queue : RequestQueue
    private val url = "http://192.168.0.14:80/api/Product"


    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMenuBinding.inflate(layoutInflater)
        setContentView(binding.root)

        queue = Volley.newRequestQueue(this)

        val stringRequest = StringRequest(Request.Method, url,
                Response.Listener<String>{response ->

                    Log.d("UdelP", "Response is: $response ")
                    binding.

                }


        )
    }
}