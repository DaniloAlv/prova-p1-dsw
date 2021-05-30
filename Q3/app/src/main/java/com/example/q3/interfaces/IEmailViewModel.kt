package com.example.q3.interfaces

import com.example.q3.models.Email

interface IEmailViewModel {
    fun payloadForList(): ArrayList<Email>
}