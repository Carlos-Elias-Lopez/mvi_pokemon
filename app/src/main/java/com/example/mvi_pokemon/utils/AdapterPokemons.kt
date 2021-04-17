package com.example.mvi_pokemon.utils

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.mvi_pokemon.R
import com.example.mvi_pokemon.model.Pokemon
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.item_pokemons.view.*

class AdapterPokemons () : RecyclerView.Adapter<AdapterPokemons.ViewHolder>() {

    lateinit var items: ArrayList<Pokemon>

    override fun getItemCount(): Int {
        return if(::items.isInitialized){
            items.size
        }else{
            0
        }

    }
    fun setCats(items: List<Pokemon>) {
        this.items = items as ArrayList<Pokemon>
        notifyDataSetChanged()
    }

    // Inflates the item views
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_pokemons, parent, false))

    // Binds each item in the ArrayList to a view
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val model= items[position]
        holder.sizeInfo.text = model.name
        Picasso.get()
            .load(model.url)
            .into( holder.catImage)
    }
    class ViewHolder (view: View) : RecyclerView.ViewHolder(view) {
        // Holds the TextView that will add each picture to
        val catImage: ImageView = view.pokemon_image
        val sizeInfo: TextView = view.size_info
    }
}

