package com.example.q3.controllers

import com.example.q3.interfaces.IEmailViewModel
import com.example.q3.models.Email
import java.util.*
import kotlin.collections.ArrayList

class EmailViewModel : IEmailViewModel{

    private var listEmails: ArrayList<Email> = arrayListOf()

    override fun payloadForList(): ArrayList<Email>{

        listEmails = arrayListOf(
            Email(
                "Reunião 10h",
                arrayListOf(
                    "Pedro Loto",
                    "Gerson Gomes"
                ),
                    Calendar.getInstance().time,
                    arrayListOf(
                            "Geromel Arbusto",
                            "Lorenzetti Filho"
                    )
            ),
            Email(
                "Pedido em Analise",
                arrayListOf(
                    "Luiza Viccenzo",
                    "Luana Maia"
                ),
                    Calendar.getInstance().time,
                    arrayListOf(
                            "Walter Zauan",
                            "Felicia Neto"
                    )
            ),
            Email(
                "Fechamento do balanço semestral",
                arrayListOf(
                    "Fernanda Alves"
                ),
                    Calendar.getInstance().time,
                    arrayListOf(
                            "Junior Teimoso"
                    )
            ),
            Email(
                "Entrevista para Contratação Dev Pleno Kotlin",
                arrayListOf(
                    "Mariane Lemos",
                    "Junior Garcia"
                ),
                    Calendar.getInstance().time,
                    arrayListOf(
                            "Tamires Leito"
                    )
            )
        )

        return listEmails
    }
}