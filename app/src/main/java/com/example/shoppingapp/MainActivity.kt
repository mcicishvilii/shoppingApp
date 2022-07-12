package com.example.shoppingapp

import android.content.ClipData
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
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

    private fun initCategories()
    {
        categoriesAdapter = CategoriesAdapter().apply {

            setOnItemCLickListener { category: CategoriesModel, i: Int ->

                Toast.makeText(
                    this@MainActivity,
                    "${category.categoryName} seelected",
                    Toast.LENGTH_SHORT
                ).show()
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

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                4,
                "Jempri",
                R.drawable.shavi,
            )
        )
        itemsList.add(
            ItemsModel(
                "lurji jempri",
                5,
                "Jempri",
                R.drawable.shavi,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                6,
                "Maika",
                R.drawable.shavi,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                7,
                "Maika",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                8,
                "Maika",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                9,
                "Maika",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                10,
                "Maika",
                R.drawable.witeli,
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                11,
                "Jempri",
                R.drawable.witeli,
            )
        )
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



