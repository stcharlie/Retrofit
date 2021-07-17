package com.benjamin.retrofit

import retrofit2.Call
import retrofit2.http.GET


interface TodoService {
    @GET("todos")
    suspend fun getAllTodos(): /*Call*/ List<Todo>
}