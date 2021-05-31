package com.example.q4.interfaces

import com.example.q4.models.Book

interface IBookController {

    fun loadBooks(): ArrayList<Book>
}