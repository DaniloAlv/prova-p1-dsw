package com.example.q3.interfaces

import com.example.q3.models.Book

interface IBookViewModel {
    fun payloadForListBooks(): ArrayList<Book>
}