package com.example.q1.controllers

import android.util.Log
import androidx.lifecycle.ViewModel
import kotlin.random.Random

class ViewModel : ViewModel(){

    fun listRandomValues() : List<Int> {

        return List<Int>(1000){
            Random.nextInt(0, 10000)
        }
    }

}