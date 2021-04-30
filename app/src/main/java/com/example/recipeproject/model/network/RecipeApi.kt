package com.example.recipeproject.model.network

import com.example.recipeproject.model.RecipeModel
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface RecipeApi {
    @GET("search")
    suspend fun getRecipeData(@Query("q")foodType:String,
                              @Query("app_id")appId:String,
                              @Query("app_key")appKey:String,
                              @Query("from")from:Int,
                              @Query("to")to:Int)
    :Response<RecipeModel>
}