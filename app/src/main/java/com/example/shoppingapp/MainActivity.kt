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


    private fun populateItemsData()
    {
        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                1,
                "Party",
                R.drawable.cisperi,
            )
        )

        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                2,
                "Party",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                3,
                "All",
                R.drawable.yviteli,
            )
        )

        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                3,
                "Camping",
                R.drawable.yviteli,
            )
        )
        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                3,
                "Camping",
                R.drawable.yviteli,
            )
        )
        itemsList.add(
            ItemsModel(
                "Belt suit blazer",
                3,
                "Party",
                R.drawable.yviteli,
            )
        )




    }

    private fun populateCategoriesData()
    {
        categoriesList.add(
            CategoriesModel(
                "Party",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "Camping",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "All",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "Summer",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "Winter",
            )
        )
    }
}



