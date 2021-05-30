package com.example.q3.models

import com.example.q3.interfaces.IEmail
import java.util.*
import kotlin.collections.ArrayList

class Email : IEmail, Document{
    private var _subject: String = ""
    private var _to: ArrayList<String> = arrayListOf()

    constructor(subject: String, to: ArrayList<String>, date: Date, authors: ArrayList<String>) : super(authors, date){
        _subject = subject
        _to = to
    }

    override fun getSubject(): String {
        return _subject
    }

    override fun getTo(): ArrayList<String> {
        return _to
    }
}
