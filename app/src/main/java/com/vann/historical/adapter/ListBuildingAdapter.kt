package com.vann.historical.adapter

import androidx.recyclerview.widget.RecyclerView
import android.view.View
import android.view.ViewGroup
import android.view.LayoutInflater
import com.bumptech.glide.Glide
import com.vann.historical.R
import com.vann.historical.model.Building
import kotlinx.android.synthetic.main.item_cardview_buildings.view.*

class ListBuildingAdapter(val listBuilding: ArrayList<Building>) :
    RecyclerView.Adapter<ListBuildingAdapter.ListBuildingViewHolder>() {

    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnItemClickCallback(
        onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }

    override fun onCreateViewHolder(viewGroup: ViewGroup, viewType: Int): ListBuildingViewHolder {
        val view: View = LayoutInflater.from(viewGroup.context)
            .inflate(R.layout.item_cardview_buildings, viewGroup, false)
        return ListBuildingViewHolder(view)
    }

    override fun getItemCount(): Int = listBuilding.size

    override fun onBindViewHolder(holder: ListBuildingViewHolder, position: Int) {
        holder.bind(listBuilding[position])
        holder.itemView.setOnClickListener() {
            onItemClickCallback.onItemClick(listBuilding[holder.adapterPosition])
        }
    }

    class ListBuildingViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {
        fun bind(building: Building) {
            with(itemView) {
                tv_building_name.text = building.name
                tv_building_location.text = building.location
                Glide.with(this).load(building.photo).into(img_item_photo)
                tv_building_description.text = building.description
            }
        }
    }

    interface OnItemClickCallback {
        fun onItemClick(listBuilding: Building)
    }
}