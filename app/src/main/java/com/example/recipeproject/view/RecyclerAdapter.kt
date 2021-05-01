package com.example.recipeproject.view

import android.app.Activity
import android.app.ActivityOptions
import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import androidx.core.graphics.drawable.toBitmap
import androidx.lifecycle.LiveData
import androidx.palette.graphics.Palette
import androidx.recyclerview.widget.RecyclerView
import coil.ImageLoader
import coil.load
import coil.request.ImageRequest
import coil.request.SuccessResult
import coil.size.Scale
import coil.transform.BlurTransformation
import coil.transform.CircleCropTransformation
import coil.transform.RoundedCornersTransformation
import com.example.recipeproject.R
import com.example.recipeproject.model.RecipeModel
import com.google.gson.Gson
import kotlinx.android.synthetic.main.item_recipe_recycler.view.*
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import java.io.Serializable


class RecyclerAdapter(var activity:Activity,var recipeList: MutableList<RecipeModel.Hit>): RecyclerView.Adapter<RecyclerAdapter.MyHolder>() {
    class MyHolder(itemView:View):RecyclerView.ViewHolder(itemView)
    {
        private val image: ImageView =itemView.iv_foodImage
        private val imageTitle=itemView.etFoodTitle
        private val imageAuthor=itemView.et_foodAuthor

        fun bind(recipeModelHit: RecipeModel.Hit){
            image.load(recipeModelHit.recipe?.image){
                crossfade(true)
                crossfade(1000)
                transformations(CircleCropTransformation())

            }
            imageTitle.text=recipeModelHit.recipe?.label
            imageAuthor.text=recipeModelHit.recipe?.source
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyHolder {
        val view=LayoutInflater.from(parent.context).inflate(R.layout.item_recipe_recycler,parent,false)

        return MyHolder(view)
    }

    override fun onBindViewHolder(holder: MyHolder, position: Int) {
        var recipelst=recipeList.get(position)

        holder.bind(recipelst)
        val coroutineScopeMain= CoroutineScope(Dispatchers.Main)
        coroutineScopeMain.launch {
            val imageLoader=ImageLoader.Builder(holder.itemView.context)
                .build()
            val request = ImageRequest.Builder(holder.itemView.context)
                .data(recipelst.recipe?.image)
                .allowHardware(false) // Disable hardware bitmaps.
                .build()
            var palette:Palette?=null
            val drawable = (imageLoader.execute(request) as SuccessResult).drawable
            withContext(Dispatchers.IO){
                palette=Palette.Builder(drawable.toBitmap()).generate()
        }
            withContext(Dispatchers.Main){
                val colorsOuter=palette?.lightMutedSwatch
                holder.itemView.constraint_recycler.setBackgroundColor(colorsOuter?.rgb?:R.color.black)
            }

        }
        holder.itemView.mainPageCardView.setOnClickListener{
            val options=ActivityOptions.makeSceneTransitionAnimation(activity)
            val gson= Gson()
            val intent=Intent(holder.itemView.context,FoodDetailPage::class.java)
            intent.putExtra("recipeListObject",gson.toJson(recipelst) )
            holder.itemView.context.startActivity(intent,options.toBundle())

        }





    }

    override fun getItemCount(): Int {
        return recipeList.size
    }
}