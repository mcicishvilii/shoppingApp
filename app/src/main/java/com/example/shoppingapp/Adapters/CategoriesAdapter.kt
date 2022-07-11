package com.example.shoppingapp.Adapters

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.shoppingapp.DataModels.CategoriesModel
import com.example.shoppingapp.DataModels.ItemsModel
import com.example.shoppingapp.databinding.ItemsLayoutBinding

class CategoriesAdapter : RecyclerView.Adapter<CategoriesAdapter.UsersViewHolder>() {

    private val categoriesList = mutableListOf<CategoriesModel>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): UsersViewHolder {
        val binding =
            ItemsLayoutBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return UsersViewHolder(binding)
    }

    override fun onBindViewHolder(holder: UsersViewHolder, position: Int) {
        holder.bindData(categoriesList[position])

    }

    override fun getItemCount(): Int {
        return categoriesList.size
    }


    fun updateAll(list: List<CategoriesModel>) {
        categoriesList.clear()
        categoriesList.addAll(list)
        notifyDataSetChanged()
    }


    class UsersViewHolder(private val binding: ItemsLayoutBinding) :
        RecyclerView.ViewHolder(binding.root) {
        fun bindData(categoriesModel: CategoriesModel) {

        }
    }
}