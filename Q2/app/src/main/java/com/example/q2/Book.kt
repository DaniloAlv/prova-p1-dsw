package com.example.q2

class Book(){

    private var _title: String = ""
    private var authors: ArrayList<String> = ArrayList<String>()

    constructor(title: String, authors: ArrayList<String>) : this(){
        _title = title
        this.authors = authors
    }

    fun getTitle(): String{
        return _title
    }

    fun addTitle(title: String){
        _title = title
    }

    fun getAuthors(): List<String> {
        return authors
    }

    fun addAuthor(name: String) {
        authors.add(name)
    }
}