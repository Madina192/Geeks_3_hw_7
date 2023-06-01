package com.example.geeks_3_practice_7.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.appcompat.view.menu.MenuView.ItemView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.example.geeks_3_practice_7.Laptop
import com.example.geeks_3_practice_7.databinding.ItemLaptopsBinding

class LaptopsAdapter(private val arrayList: ArrayList<Laptop>, var onClick : (Laptop) -> Unit) : RecyclerView.Adapter<LaptopsAdapter.LaptopsViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): LaptopsViewHolder {
        return LaptopsViewHolder(ItemLaptopsBinding.inflate(LayoutInflater.from(parent.context), parent, false))
    }

    override fun getItemCount(): Int {
        return arrayList.size
    }

    override fun onBindViewHolder(holder: LaptopsViewHolder, position: Int) {
        holder.onBind(arrayList[position])
        holder.itemView.setOnClickListener{
            onClick(arrayList[position])
        }
    }

    inner class LaptopsViewHolder(private val binding: ItemLaptopsBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(laptop : Laptop) {
            binding.textViewTitle.text = laptop.title
            binding.textViewDescr.text = laptop.descr
            binding.textViewColor.text = laptop.color
            binding.textViewPrice.text = laptop.price
            Glide.with(binding.imageViewImage).load(laptop.image).into(binding.imageViewImage)
        }
    }
}

