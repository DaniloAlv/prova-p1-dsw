package com.example.q3.models

import java.util.*
import kotlin.collections.ArrayList

open class Document{
    private var authors: ArrayList<String> = arrayListOf()
    private var date: Date = Date()

    constructor(authors: ArrayList<String>, date: Date){
        this.authors = authors
        this.date = date
    }

    fun getDate(): Date{
        return date
    }

    fun getAuthors(): ArrayList<String>{
        return authors
    }

    fun addAuthor(author: String){
        authors.add(author)
    }
}