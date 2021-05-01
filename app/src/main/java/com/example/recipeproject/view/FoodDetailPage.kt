package com.example.recipeproject.view

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.graphics.drawable.toBitmap
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import coil.ImageLoader
import coil.load
import coil.request.ImageRequest
import coil.request.SuccessResult
import coil.size.Scale
import coil.transform.RoundedCornersTransformation
import com.example.recipeproject.R
import com.example.recipeproject.model.RecipeModel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.activity_food_detail_page.*
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.item_recipe_recycler.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class FoodDetailPage : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_food_detail_page)
        val coroutineScopeMain= CoroutineScope(Dispatchers.Main)
        val gson = Gson()
        val yourObject = gson.fromJson(intent.getStringExtra("recipeListObject"), RecipeModel.Hit::class.java)
        iv_foodDescriptionImage.load(yourObject.recipe?.image){
            crossfade(true)
            crossfade(1000)
            transformations(RoundedCornersTransformation(24F))
            scale(Scale.FILL)
        }
        tv_foodTitle.text=yourObject.recipe?.label
        coroutineScopeMain.launch {
            val imageLoader= ImageLoader.Builder(applicationContext)
                .build()
            val request = ImageRequest.Builder(applicationContext)
                .data(yourObject.recipe?.image)
                .allowHardware(false) // Disable hardware bitmaps.
                .build()
            var palette: Palette?=null
            val drawable = (imageLoader.execute(request) as SuccessResult).drawable
            withContext(Dispatchers.IO){
                palette= Palette.Builder(drawable.toBitmap()).generate()
            }
            withContext(Dispatchers.Main){
                val colorsOuter=palette?.lightVibrantSwatch
                foodDetailCardview.setBackgroundColor(colorsOuter?.rgb?:R.color.black)

            }

        }


        rvFoodIngredients.layoutManager= LinearLayoutManager(this)
        rvFoodIngredients.adapter=IngredientListRecyclerAdapter(yourObject.recipe?.ingredients as MutableList<RecipeModel.Hit.Recipe.Ingredient>)

    }
}