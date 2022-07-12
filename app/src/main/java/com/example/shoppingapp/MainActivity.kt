package com.example.shoppingapp

import android.content.ClipData
import android.os.Build
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.example.shoppingapp.Adapters.CategoriesAdapter
import com.example.shoppingapp.Adapters.ItemsAdapter
import com.example.shoppingapp.DataModels.CategoriesModel
import com.example.shoppingapp.DataModels.ItemsModel
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity()
{
    private lateinit var binding: ActivityMainBinding
    private val itemsList = mutableListOf<ItemsModel>()
    private val categoriesList = mutableListOf<CategoriesModel>()
    private val filteredList = mutableListOf<String>()

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var itemsAdapter: ItemsAdapter


    @RequiresApi(Build.VERSION_CODES.N)
    override fun onCreate(savedInstanceState: Bundle?)
    {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        initItems()
        initCategories()



    }

    private fun initItems()
    {
        itemsAdapter = ItemsAdapter().apply {
            populateItemsData()
            updateAll(itemsList)
        }

        binding.rvItems.layoutManager =
            GridLayoutManager(this, 2, VERTICAL, false)
        binding.rvItems.adapter = itemsAdapter
    }


    @RequiresApi(Build.VERSION_CODES.N)
    private fun initCategories()

    {

        categoriesAdapter = CategoriesAdapter().apply {

            setOnItemCLickListener { category: CategoriesModel, i: Int ->

                itemsList.removeIf { it.categoryType != category.categoryName }
                Toast.makeText(this@MainActivity,itemsList.size.toString(),Toast.LENGTH_SHORT).show()
            }

            populateCategoriesData()
            updateAll(categoriesList)
        }

        binding.rvCategories.layoutManager =
            LinearLayoutManager(this, HORIZONTAL, false)
        binding.rvCategories.adapter = categoriesAdapter
    }


    private fun populateItemsData(): MutableList<ItemsModel>
    {
        itemsList.add(
            ItemsModel(
                "witeli maika",
                1,
                "Maika",
                R.drawable.cisperi,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                2,
                "Jempri",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                3,
                "Jempri",
                R.drawable.yviteli,
            )
        )



        return itemsList
    }

    private fun populateCategoriesData()
    {
        categoriesList.add(
            CategoriesModel(
                "Maika",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "Jempri",
            )
        )
    }
}



