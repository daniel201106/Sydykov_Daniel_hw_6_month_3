package com.gekss.sydykov_daniel_hw_6_month_3

import android.view.LayoutInflater
import android.view.ViewGroup
import android.widget.Adapter
import androidx.recyclerview.widget.RecyclerView
import com.gekss.sydykov_daniel_hw_6_month_3.databinding.ItemCarsBinding

class CarsAdapter (private var carsList: List<Cars>):
    RecyclerView.Adapter<CarsAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        return ViewHolder(ItemCarsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount() = carsList.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(carsList[position])
    }

    inner class ViewHolder(private val binding: ItemCarsBinding) : RecyclerView.ViewHolder(binding.root){
        fun bind(cars: Cars){
            binding.apply {
                cars.apply {
                    tvNameCars.text = name
                    imgCars.loadImage(img)
                }
            }
        }
    }
}
