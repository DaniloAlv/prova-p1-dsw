package com.example.q1.views

import com.example.q1.controllers.ViewModel

fun main(){
    for(value in ViewModel().listRandomValues()){
        print(value.toString() + "\n")
    }
}