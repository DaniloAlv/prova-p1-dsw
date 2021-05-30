package com.example.q3.controllers

import com.example.q3.interfaces.IBookViewModel
import com.example.q3.models.Book
import java.util.*
import kotlin.collections.ArrayList

class BookViewModel : IBookViewModel{

    private var listBooks: ArrayList<Book> = arrayListOf()

    override fun payloadForListBooks(): ArrayList<Book>{

        listBooks.addAll(
                arrayListOf(
                        Book("Percy Jackson e a Batalha do Labirinto", Date(2008, 5, 6), arrayListOf("Rick Riordan")),
                        Book("Sapiens: Uma história da Humanidade", Date(2011, 0, 0), arrayListOf("Yuval Noah Harari")),
                        Book("H.P. Lovecraft - Medo Clássico", Date(2017, 12, 14), arrayListOf("H.P. Lovecraft"))
                )
        )

        return listBooks
    }
}