package com.example.recipeproject.view

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.recipeproject.R
import com.example.recipeproject.model.Nutrient
import kotlinx.android.synthetic.main.item_nutrition_value.view.*


class MyIngredientNutritionViewHolder(itemView: View):RecyclerView.ViewHolder(itemView){

}

class IngredientNutritionRecyclerAdapter(var totalNutrition: MutableList<Nutrient?>?,
                                         var dailyNutrition: MutableList<Nutrient?>?)
	: RecyclerView.Adapter<MyIngredientNutritionViewHolder>() {
	override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyIngredientNutritionViewHolder {
		val view= LayoutInflater.from(parent.context).inflate(R.layout.item_nutrition_value,parent,false)
		return MyIngredientNutritionViewHolder(view)
	}

	override fun onBindViewHolder(holder: MyIngredientNutritionViewHolder, position: Int) {
		holder.itemView.textLabel.text= totalNutrition?.get(position)?.label
		holder.itemView.tvTotalNutrition.text= "${totalNutrition?.get(position)?.quantity?.toInt().toString()} ${totalNutrition?.get(position)?.unit}"
		holder.itemView.tvDailyNutrition.text= "${dailyNutrition?.get(position)?.quantity?.toInt().toString()} ${dailyNutrition?.get(position)?.unit}"
	}

	override fun getItemCount(): Int {
		return totalNutrition!!.size
	}
}