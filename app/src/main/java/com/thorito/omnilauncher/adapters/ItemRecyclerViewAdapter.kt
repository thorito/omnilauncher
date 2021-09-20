package com.thorito.omnilauncher.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.thorito.omnilauncher.R
import com.thorito.omnilauncher.models.ItemsModel

class ItemRecyclerViewAdapter(private val itemsList: MutableList<ItemsModel>):
    RecyclerView.Adapter<ItemRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val imageView: ImageView = view.findViewById(R.id.item_image)
        val textViewName: TextView = view.findViewById(R.id.item_name)
    }

    override fun getItemCount() = itemsList.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.recyclerview_items, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val item = itemsList[position]
        val imageResourceId = item.idImageResource
        val name = item.name

        viewHolder.imageView.setImageResource(imageResourceId)
        viewHolder.textViewName.text = name

        viewHolder.itemView.setOnClickListener {
            Toast.makeText(viewHolder.itemView.context,
                "Click en $name", Toast.LENGTH_SHORT).show()
        }
    }
}