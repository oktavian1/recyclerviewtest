package com.raywenderlich.android.creatures.ui

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.raywenderlich.android.creatures.R
import com.raywenderlich.android.creatures.model.Creature
import kotlinx.android.synthetic.main.fragment_all.view.*
import kotlinx.android.synthetic.main.list_item_creature.view.*

class CreatureAdapter(private val creatures: List<Creature>): RecyclerView.Adapter<CreatureAdapter.ViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.list_item_creature, parent, false)
        return ViewHolder(view)
    }

    override fun getItemCount(): Int = creatures.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(creatures[position])
    }

    class ViewHolder(itemView : View): RecyclerView.ViewHolder(itemView) {
        private lateinit var creature: Creature

        fun bind(creature: Creature){
            this.creature = creature
            val context = itemView.context

            with(itemView){

                Glide.with(context)
                        .load(context.resources.getIdentifier(creature.uri, null, context.packageName))
                        .into(creatureImage)

                fullName.text = creature.fullName
                nickName.text = creature.nickname
            }

        }

    }
}