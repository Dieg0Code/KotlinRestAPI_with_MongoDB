package com.dieg0code.kotlinserarchmongoDB.dtos

class PaginatedResponse(
    val data: List<Any>,
    val total: Int,
    val page: Int,
    val last_page: Int,
) {
}