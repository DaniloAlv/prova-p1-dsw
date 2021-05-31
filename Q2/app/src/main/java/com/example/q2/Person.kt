package com.example.q2

import java.util.*
import kotlin.collections.ArrayList

open class Person(){

    private var _name: String = ""
    private var _birthDate: Date = Date()
    private var owns: ArrayList<Book> = arrayListOf()

    fun setName(name: String){
        _name = name
    }

    fun getName(): String {
        return _name
    }

    fun isBirthday(date: Date): Boolean{
        return date == Calendar.getInstance().time
    }

    open fun addLivro(book: Book){
        owns.add(book)
    }

    fun getBooksOfTheReader(): ArrayList<Book>{
        return owns
    }
}
