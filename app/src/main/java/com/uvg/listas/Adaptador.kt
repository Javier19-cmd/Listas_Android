package com.uvg.listas

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class Adaptador: RecyclerView.Adapter<Adaptador.ItemsViewMolder>() {

    //Creando lista.
    private var items: MutableList<String> = mutableListOf()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ItemsViewMolder {
        TODO("Not yet implemented")
    }

    override fun onBindViewHolder(holder: ItemsViewMolder, position: Int) {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return items.size //Retornando el tamaño de la lista.
    }

    class ItemsViewMolder(itemView: View) : RecyclerView.ViewHolder(itemView)
}