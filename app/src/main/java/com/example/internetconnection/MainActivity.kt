package com.example.internetconnection

import android.content.Context
import android.net.ConnectivityManager
import android.net.Network
import android.net.NetworkCapabilities
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.internetconnection.databinding.ActivityMainBinding
import com.example.internetconnection.isNetwork.NetworkHelper

class MainActivity : AppCompatActivity() {
    private val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    lateinit var activeNetwork: NetworkHelper
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        activeNetwork = NetworkHelper(this)

        binding.root.setOnClickListener {
            if (activeNetwork.isNetworkConnected()){
            binding.tvName.text = "Intenet bor"
            }else{
            binding.tvName.text = "Internet yo'q"
            }
        }
    }
//    private fun isNetworkConnected():Boolean{
//        // Tarmoq jarayoni
//        val connectivityManager = getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager
//        val actionNetwork = connectivityManager.activeNetwork
//        //Jarayonda bo'lgan tarmoqlarni qucvvatini olvolyapmiz
//        val networkCapabilities = connectivityManager.getNetworkCapabilities(actionNetwork)
//        return networkCapabilities != null && networkCapabilities.hasCapability(NetworkCapabilities.NET_CAPABILITY_INTERNET)
//    }
}