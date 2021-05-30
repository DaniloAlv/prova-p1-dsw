package com.example.q3.views

import com.example.q3.controllers.BookViewModel
import com.example.q3.controllers.EmailViewModel

fun main(){

    var lstEmails = EmailViewModel().payloadForList()
    var lstBooks = BookViewModel().payloadForListBooks()

    println("E-mails:\n")
    for (email in lstEmails){
        println("Assunto: ${email.getSubject()}\nDestinatários: ${email.getTo()}\nHorário: ${email.getDate()}\nRemetentes: ${email.getAuthors()}\n")
    }

    println()

    println("Livros:\n")
    for (book in lstBooks){
        println("Título: ${book.getTitle()}\nData de Lançamento: ${book.getDate()}\nAutor: ${book.getAuthors()}\n")
    }
}
