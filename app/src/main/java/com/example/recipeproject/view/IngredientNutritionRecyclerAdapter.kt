package com.example.recipeproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeproject.R
import com.example.recipeproject.model.RecipeModel
import kotlinx.android.synthetic.main.item_nutrition_value.view.*


class MyIngredientNutritionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

}

class IngredientNutritionRecyclerAdapter(var totalNutrition:MutableList<RecipeModel.Hit.Recipe.TotalNutrients>,
                                         var dailyNutrition:MutableList<RecipeModel.Hit.Recipe.TotalDaily>)
	: RecyclerView.Adapter<MyIngredientNutritionViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyIngredientNutritionViewHolder {
		val view= LayoutInflater.from(parent.context).inflate(R.layout.item_nutrition_value,parent,false)
		return MyIngredientNutritionViewHolder(view)
	}

	override fun onBindViewHolder(holder: MyIngredientNutritionViewHolder, position: Int) {
TODO()
	}

	override fun getItemCount(): Int {
		TODO("Not yet implemented")
	}
}