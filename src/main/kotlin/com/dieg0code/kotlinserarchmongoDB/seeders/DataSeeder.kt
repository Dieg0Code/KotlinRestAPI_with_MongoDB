package com.dieg0code.kotlinserarchmongoDB.seeders

import com.dieg0code.kotlinserarchmongoDB.models.Product
import com.dieg0code.kotlinserarchmongoDB.repositories.ProductRepository
import org.springframework.boot.ApplicationArguments
import org.springframework.boot.ApplicationRunner
import org.springframework.stereotype.Component
import kotlin.random.Random
/*
@Component
class DataSeeder(private val productRepository: ProductRepository) : ApplicationRunner {
    override fun run(args: ApplicationArguments?) {
        for (i in 1..50) {
            val product = Product()
            product.title = "Title #" + i
            product.description = "Description #" + (i + 1)
            product.image = "http://lorempixel.com/200/200?" + Random.nextInt(10000)
            product.price = Random.nextInt(10, 100)
            this.productRepository.save(product)
        }
    }
}   */