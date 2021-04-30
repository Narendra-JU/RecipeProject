package com.example.recipeproject.viewmodel

import android.app.Application
import android.util.Log
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.MutableLiveData
import com.example.recipeproject.model.RecipeModel
import com.example.recipeproject.model.network.RecipeService
import kotlinx.coroutines.*

class MainActivityViewModel(application: Application):AndroidViewModel(application) {
    private val coroutineScope=CoroutineScope(Dispatchers.IO)

    val APP_ID="edc75da0"
    val APP_KEY="dd25f1fdacd7080799029b44ca775a01"
    val INITIAL_VALUE=0
    val recipeService=RecipeService.getRecipeWeatherService()

    var recipeList=MutableLiveData<RecipeModel>()

    fun refresh(foodType: String,noOfItems: Int){
        fetchRecipe(foodType, noOfItems)
    }

    private fun fetchRecipe(foodType:String,noOfItems:Int){
        CoroutineScope(Dispatchers.IO).launch {
            val response=recipeService.getRecipeData(foodType,APP_ID,APP_KEY,INITIAL_VALUE,noOfItems)
            withContext(Dispatchers.Main){
                if (response.isSuccessful){
                    recipeList.value= response.body()
                    Log.d("Narendra", "fetchRecipe: ${recipeList.value}")
                }
            }
        }
    }





}