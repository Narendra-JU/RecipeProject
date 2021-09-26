package com.example.recipeproject.view

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.GridLayoutManager
import com.example.recipeproject.R
import com.example.recipeproject.model.RecipeModel
import com.example.recipeproject.model.util.ItemOffsetDecoration
import com.example.recipeproject.viewmodel.MainActivityViewModel
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
	private lateinit var viewModel:MainActivityViewModel
	private lateinit var adapter: RecyclerAdapter
	override fun onCreate(savedInstanceState: Bundle?) {
		super.onCreate(savedInstanceState)
		setContentView(R.layout.activity_main)
		viewModel=ViewModelProvider(this).get(MainActivityViewModel::class.java)
		viewModel.refresh("italian", 30)
		recyclerView.layoutManager=GridLayoutManager(this, 2)
		val itemDecoration = ItemOffsetDecoration(this, R.dimen.my_value)
		recyclerView.addItemDecoration(itemDecoration)

		observeViewModel("italian", 30)
		materialButton.setOnClickListener {
			editText.text.toString().let {
				observeViewModel(it, 30)
			}
		}
	}
	private fun observeViewModel(foodType: String, no: Int){
		viewModel.refresh(foodType, no)
		viewModel.recipeList.observe(
			this,
			Observer { getRecipies ->
				getRecipies.hits.let {
					adapter = RecyclerAdapter(this, it as MutableList<RecipeModel.Hit>)
					recyclerView.adapter = adapter
				}

			}
		)
	}
}