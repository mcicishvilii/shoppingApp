package com.example.shoppingapp.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingapp.DataModels.ItemsModel
import com.example.shoppingapp.databinding.ItemsLayoutBinding

class ItemsAdapter : RecyclerView.Adapter<ItemsAdapter.UsersViewHolder>() {

    private val itemsList = mutableListOf<ItemsModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val binding =
            ItemsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UsersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bindData(itemsList[position])
    }

    override fun getItemCount(): Int {
        return itemsList.size
    }

    fun updateAll(list: List<ItemsModel>) {
        itemsList.clear()
        itemsList.addAll(list)
        notifyItemRangeChanged(0,itemsList.size)
    }


    class UsersViewHolder(val binding: ItemsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
            fun bindData(itemsModel: ItemsModel){
                binding.tvTitle.text = itemsModel.title
                binding.tvPrice.text = "$${itemsModel.price}"
                binding.ivImage.setImageResource(itemsModel.Image)
            }

    }
}