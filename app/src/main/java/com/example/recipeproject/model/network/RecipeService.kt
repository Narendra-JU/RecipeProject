package com.example.recipeproject.model.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.create

object RecipeService {
    private val BASE_URL="https://api.edamam.com/"

    fun getRecipeWeatherService():RecipeApi{
        return Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(RecipeApi::class.java)
    }

}