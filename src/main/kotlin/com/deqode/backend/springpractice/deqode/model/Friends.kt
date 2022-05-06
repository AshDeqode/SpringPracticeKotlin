package com.deqode.backend.springpractice.deqode.model

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document(collection = "friendInfo")
class Friends {
    @Id
    val id: Int? = null

    val firstName: String? = null

    val lastName: String? = null

    val city: String? = null

    val country: String? = null
}