package com.example.q2

class Association : Person(){

    fun getReaders(): ArrayList<Person>{

        val books = getBooks()

        val firstReader = Person()
        firstReader.setName("Tiburcio Meireles")
        firstReader.addLivro(books[2])
        firstReader.addLivro(books[0])
        firstReader.addLivro(books[1])

        val secondReader = Person()
        secondReader.setName("Leticia Castro")
        secondReader.addLivro(books[3])
        secondReader.addLivro(books[1])

        val thirdReader = Person()
        thirdReader.setName("Marina Camargo")
        thirdReader.addLivro(books[2])
        thirdReader.addLivro(books[0])

        return arrayListOf(
                firstReader, secondReader, thirdReader
        )
    }

    private fun getBooks(): ArrayList<Book>{
        return arrayListOf<Book>(
                Book("Harry Potter e a Ordem da Fênix", arrayListOf(
                        "J.K. Rowling"
                )),
                Book("Viagem ao Centro da Terra", arrayListOf(
                        "Julio Verne"
                )),
                Book("O Iluminado", arrayListOf(
                        "Stephen King"
                )),
                Book("O Corvo", arrayListOf("Edgar Allan Poe"))
        )
    }
}

fun main(){

    val association = Association()

    for(reader in association.getReaders()){
        println("Livros que ${reader.getName()} já leu:\n")
        for (book in reader.getBooksOfTheReader()){
            println("Título: ${book.getTitle()}\nAutor: ${book.getAuthors()}\n")
        }
    }
}
