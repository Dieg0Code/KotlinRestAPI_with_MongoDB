package com.dieg0code.kotlinserarchmongoDB.models

import org.springframework.data.annotation.Id
import org.springframework.data.mongodb.core.mapping.Document

@Document
class Product {

    @Id
    var id = ""

    var title = ""

    var description = ""

    var image = ""

    var price = 0
}