package com.dieg0code.kotlinserarchmongoDB.repositories

import com.dieg0code.kotlinserarchmongoDB.models.Product
import org.springframework.data.domain.Pageable
import org.springframework.data.mongodb.repository.MongoRepository
import org.springframework.data.mongodb.repository.Query

interface ProductRepository : MongoRepository<Product, String> {

    @Query("{\$or: [{'title': {\$regex: ?0, \$options: 'i'}}, {'description': {\$regex: ?0, \$options: 'i'}}]}")
    fun search(s: String, pageable: Pageable): List<Product>

    @Query(
        "{\$or: [{'title': {\$regex: ?0, \$options: 'i'}}, {'description': {\$regex: ?0, \$options: 'i'}}]}",
        count = true
    )
    fun countSearch(s: String): Int
}