package com.example.q4.interfaces

interface IBook {
    fun getTitle(): String
    fun setTitle(title: String)
    fun getAuthors(): ArrayList<String>
    fun addAuthor(author: String)
}