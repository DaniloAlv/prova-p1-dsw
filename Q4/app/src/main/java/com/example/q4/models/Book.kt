package com.example.q4.models

import com.example.q4.interfaces.IBook

class Book : IBook {
    private var _title: String = ""
    private val _authors: ArrayList<String> = arrayListOf()

    override fun getTitle(): String {
        return _title
    }

    override fun setTitle(title: String) {
        _title = title
    }

    override fun getAuthors(): ArrayList<String> {
        return _authors
    }

    override fun addAuthor(author: String) {
        _authors.add(author)
    }
}