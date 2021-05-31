package com.example.q4.controllers

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.example.q4.R
import com.example.q4.interfaces.IBookController
import com.example.q4.models.Book

class BookController(private var book: Book) : IBookController, RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    constructor(){
        book = Book()
    }

    override fun loadBooks(): ArrayList<Book> {

        val firstBook = book
        firstBook.setTitle("Volta ao mundo em 80 dias")
        firstBook.addAuthor("Julio Verne")

        val secondBook = book
        secondBook.setTitle("Mitologia Nórdica")
        secondBook.addAuthor("Neil Gaiman")

        val thirdBook = book
        thirdBook.setTitle("A Garota do Lago")
        thirdBook.addAuthor("Charlie Donlea")

        val fourthBook = book
        fourthBook.setTitle("A Guerra dos Tronos")
        fourthBook.addAuthor("George R.R. Martin ")

        val fifthBook = book
        fifthBook.setTitle("Sombra e Ossos")
        fifthBook.addAuthor("Leigh Bardugo")

        return arrayListOf<Book>(
            firstBook, secondBook, thirdBook, fourthBook, fifthBook
        )
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.books, parent, false)

        return ViewHolder(view)
    }

    override fun getItemCount(): Int {
        loadBooks().size
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.itemView.bookTitle = loadBooks()[position].getTitle()
        holder.itemView.bookAuthor = loadBooks()[position].getAuthors()
    }
}