package com.thorito.omnilauncher.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.thorito.omnilauncher.R
import com.thorito.omnilauncher.models.GroupModel
import com.thorito.omnilauncher.models.ItemsModel

class GroupRecyclerViewAdapter(private val groupList: MutableList<GroupModel>):
    RecyclerView.Adapter<GroupRecyclerViewAdapter.ViewHolder>() {

    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val titleGroup: TextView = view.findViewById(R.id.group_title)
        val subtitleGroup: TextView = view.findViewById(R.id.group_subtitle)
        val recyclerViewItems: RecyclerView = view.findViewById(R.id.items_recyclerview)
    }

    override fun getItemCount() = groupList.size

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ViewHolder {

        val view = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.group_recyclerview_items, viewGroup, false)

        return ViewHolder(view)
    }

    override fun onBindViewHolder(viewHolder: ViewHolder, position: Int) {

        val group = groupList[position]
        val title = group.title
        val subtitle = group.subtitle

        title?.let {
            viewHolder.titleGroup.text = it
            viewHolder.titleGroup.visibility = View.VISIBLE
        }

        subtitle?.let {
            viewHolder.subtitleGroup.text = it
            viewHolder.subtitleGroup.visibility = View.VISIBLE
        }

        setAdapter(viewHolder, group)
    }

    private fun setAdapter(
        viewHolder: ViewHolder,
        group: GroupModel
    ) {

        viewHolder.recyclerViewItems.layoutManager =
            LinearLayoutManager(viewHolder.itemView.context, LinearLayoutManager.HORIZONTAL, false)
        viewHolder.recyclerViewItems.setHasFixedSize(true)
        val listItems = getItemsGroup(group.id)
        val adapterItems = ItemRecyclerViewAdapter(listItems)
        viewHolder.recyclerViewItems.adapter = adapterItems
    }

    private fun getItemsGroup(id: Int): MutableList<ItemsModel> {

        return when (id) {
            1 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.tv_1, name = "TVE 1"),
                ItemsModel(idImageResource = R.drawable.tv_2, name = "TVE 2"),
                ItemsModel(idImageResource = R.drawable.tv_3, name = "TVG"),
                ItemsModel(idImageResource = R.drawable.tv_4, name = "Antena 3"),
                ItemsModel(idImageResource = R.drawable.tv_5, name = "Tele 5"))

            2 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.contacto_1, name = "Lucía"),
                ItemsModel(idImageResource = R.drawable.contacto_2, name = "Juan"),
                ItemsModel(idImageResource = R.drawable.contacto_3, name = "Manuel"),
                ItemsModel(idImageResource = R.drawable.contacto_4, name = "Noemi"),
                ItemsModel(idImageResource = R.drawable.contacto_5, name = "Keanu Reeves"))

            3 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.fotos_1, name = "Puesta de sol"),
                ItemsModel(idImageResource = R.drawable.fotos_2, name = "Santorini mirador"),
                ItemsModel(idImageResource = R.drawable.fotos_3, name = "Santorini desde dron"),
                ItemsModel(idImageResource = R.drawable.fotos_4, name = "Postal Santorini"),
                ItemsModel(idImageResource = R.drawable.fotos_5, name = "Partenón"))

            4 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.ajustes_1, name = "Ajustes generales OMNI"))

            5 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.tv_1, name = "TVE 1"),
                ItemsModel(idImageResource = R.drawable.tv_2, name = "TVE 2"),
                ItemsModel(idImageResource = R.drawable.tv_3, name = "TVG"),
                ItemsModel(idImageResource = R.drawable.tv_4, name = "Antena 3"),
                ItemsModel(idImageResource = R.drawable.tv_5, name = "Tele 5"))

            6 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.contacto_1, name = "Lucía"),
                ItemsModel(idImageResource = R.drawable.contacto_2, name = "Juan"),
                ItemsModel(idImageResource = R.drawable.contacto_3, name = "Manuel"),
                ItemsModel(idImageResource = R.drawable.contacto_4, name = "Noemi"),
                ItemsModel(idImageResource = R.drawable.contacto_5, name = "Keanu Reeves"))

            7 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.fotos_1, name = "Puesta de sol"),
                ItemsModel(idImageResource = R.drawable.fotos_2, name = "Santorini mirador"),
                ItemsModel(idImageResource = R.drawable.fotos_3, name = "Santorini desde dron"),
                ItemsModel(idImageResource = R.drawable.fotos_4, name = "Postal Santorini"),
                ItemsModel(idImageResource = R.drawable.fotos_5, name = "Partenón"))

            8 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.ajustes_1, name = "Ajustes generales OMNI"))

            9 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.tv_1, name = "TVE 1"),
                ItemsModel(idImageResource = R.drawable.tv_2, name = "TVE 2"),
                ItemsModel(idImageResource = R.drawable.tv_3, name = "TVG"),
                ItemsModel(idImageResource = R.drawable.tv_4, name = "Antena 3"),
                ItemsModel(idImageResource = R.drawable.tv_5, name = "Tele 5"))

            10 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.contacto_1, name = "Lucía"),
                ItemsModel(idImageResource = R.drawable.contacto_2, name = "Juan"),
                ItemsModel(idImageResource = R.drawable.contacto_3, name = "Manuel"),
                ItemsModel(idImageResource = R.drawable.contacto_4, name = "Noemi"),
                ItemsModel(idImageResource = R.drawable.contacto_5, name = "Keanu Reeves"))

            11 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.fotos_1, name = "Puesta de sol"),
                ItemsModel(idImageResource = R.drawable.fotos_2, name = "Santorini mirador"),
                ItemsModel(idImageResource = R.drawable.fotos_3, name = "Santorini desde dron"),
                ItemsModel(idImageResource = R.drawable.fotos_4, name = "Postal Santorini"),
                ItemsModel(idImageResource = R.drawable.fotos_5, name = "Partenón"))

            12 -> mutableListOf(
                ItemsModel(idImageResource = R.drawable.ajustes_1, name = "Ajustes generales OMNI"))

            else -> mutableListOf()
        }
    }
}