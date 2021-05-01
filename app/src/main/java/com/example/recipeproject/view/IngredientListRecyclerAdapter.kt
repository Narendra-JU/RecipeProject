package com.example.recipeproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import coil.load
import coil.transform.CircleCropTransformation
import com.example.recipeproject.R
import com.example.recipeproject.model.RecipeModel
import kotlinx.android.synthetic.main.item_recipe_ingredient.view.*

class MyIngredientViewHolder(itemview:View):RecyclerView.ViewHolder(itemview){
	private val image=itemview.iv_food_ingredients
	private val ingredientTitle=itemview.tv_ingredient_name
	private val ingredientCategory=itemview.tv_ingredient_category
	fun bind(recipeModelIngredient:RecipeModel.Hit.Recipe.Ingredient){
		image.load(recipeModelIngredient.image){
			crossfade(true)
			crossfade(600)
			transformations(CircleCropTransformation())
		}
		ingredientTitle.text=recipeModelIngredient.text
		ingredientCategory.text=recipeModelIngredient.foodCategory
	}

}

class IngredientListRecyclerAdapter(var recipeIngredientList:MutableList<RecipeModel.Hit.Recipe.Ingredient>)
	: RecyclerView.Adapter<MyIngredientViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyIngredientViewHolder {
		val view= LayoutInflater.from(parent.context).inflate(R.layout.item_recipe_ingredient,parent,false)

		return MyIngredientViewHolder(view)
	}

	override fun onBindViewHolder(holder: MyIngredientViewHolder, position: Int) {
		val ingredientItem= recipeIngredientList[position]
		holder.bind(ingredientItem)

	}

	override fun getItemCount(): Int {
		return recipeIngredientList.size
	}
}