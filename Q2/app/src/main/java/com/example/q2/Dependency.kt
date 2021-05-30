package com.example.q2

class Dependency : Person(){

    private val readers: ArrayList<Person> = arrayListOf()
    private val books: ArrayList<Book> = arrayListOf()

    fun payloadForAssociation(): ArrayList<Person>{

        getBooks()

        val firstReader: Person = Person()
        val secondReader: Person = Person()
        val thirdReader: Person = Person()

        firstReader.setName("Esther Gonçalvez")
        secondReader.setName("Magda Arantes")
        thirdReader.setName("Lorenna Mattos")

        firstReader.addLivro(books[0])
        secondReader.addLivro(books[0])

        secondReader.addLivro(books[1])

        thirdReader.addLivro(books[2])
        firstReader.addLivro(books[2])

        secondReader.addLivro(books[3])

        secondReader.addLivro(books[4])
        thirdReader.addLivro(books[4])

        readers.addAll(arrayListOf(firstReader, secondReader, thirdReader))
        return readers
    }

    private fun getBooks(): ArrayList<Book>{

        val firstBook: Book = Book()
        val secondBook: Book = Book()
        val thirdBook: Book = Book()
        val fourthBook: Book = Book()
        val fifthBook: Book = Book()

        firstBook.addAuthor("J.K. Rowling")
        firstBook.addTitle("Harry Potter e o Prisioneiro de Azkaban")

        secondBook.addTitle("A Divina Comédia")
        secondBook.addAuthor("Dante Alighieri")

        thirdBook.addTitle("O Homem de Giz")
        thirdBook.addAuthor("C.J. Tudor")

        fourthBook.addTitle("A Maldição do Espelho")
        fourthBook.addAuthor("Agatha Christie")

        fifthBook.addTitle("A Revolução dos Bichos")
        fifthBook.addAuthor("George Orwell")

        books.addAll(arrayListOf(
                firstBook,
                secondBook,
                thirdBook,
                fourthBook,
                fifthBook
        ))

        return books
    }

    fun hasRead(book: Book): Boolean{
        return books.contains(book)
    }
}

fun main(){

    val dependency = Dependency()
    val readers = dependency.payloadForAssociation()

    for (reader in readers){
        println("${reader.getName()} já leu os seguintes livros:")
        for (book in reader.getBooksOfTheReader()){
            if(dependency.hasRead(book))
                println(book.getTitle())
        }
        println()
    }
}