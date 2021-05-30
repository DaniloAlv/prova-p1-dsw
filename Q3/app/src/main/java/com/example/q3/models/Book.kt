package com.example.q3.models

import com.example.q3.interfaces.IBook
import java.util.*
import kotlin.collections.ArrayList

class Book : IBook, Document{
    private var title: String = ""

    constructor(title: String, date: Date, authors: ArrayList<String>): super(authors, date){
        this.title = title
    }

    override fun getTitle(): String {
        return this.title
    }
}
