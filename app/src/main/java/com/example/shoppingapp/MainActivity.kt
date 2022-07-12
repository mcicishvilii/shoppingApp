package com.example.shoppingapp

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
import com.example.shoppingapp.DataModels.Filters
import com.example.shoppingapp.DataModels.ItemsModel
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val itemsList = mutableListOf<ItemsModel>()
    private val categoriesList = mutableListOf<CategoriesModel>()
    private var selectedProductsList = mutableListOf<ItemsModel>()

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var itemsAdapter: ItemsAdapter




    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initItems(itemsList)
        initCategories()

    }



    private fun initItems(list: MutableList<ItemsModel>){
        itemsAdapter = ItemsAdapter().apply {

            populateItemsData()
            updateAll(list)

        }

        binding.rvItems.layoutManager =
            GridLayoutManager(this,2,VERTICAL,false)
        binding.rvItems.adapter = itemsAdapter
    }

    private fun initCategories(){
        categoriesAdapter = CategoriesAdapter().apply {

            setOnItemCLickListener { category: CategoriesModel, i: Int ->

                    Toast.makeText(this@MainActivity, "${category.categoryName} seelected", Toast.LENGTH_SHORT).show()
                    itemsList.removeAt(0)
                    initItems(itemsList)

            }
            populateCategoriesData()
            updateAll(categoriesList)
        }

        binding.rvCategories.layoutManager =
            LinearLayoutManager(this, HORIZONTAL,false)
        binding.rvCategories.adapter = categoriesAdapter
    }




    private fun populateItemsData(){
        itemsList.add(
            ItemsModel(
                "witeli maika",
                241,
                "bebruli",
                R.drawable.cisperi,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.yviteli,
                listOf(
                    Filters.Category.SUMMER
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.shavi,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )
        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.shavi,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.shavi,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.witeli,
                listOf(
                    Filters.Category.SALE
                )
            )
        )
    }
    private fun populateCategoriesData(){
        categoriesList.add(
            CategoriesModel(
                "All",
            )
        )

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
                "pants",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "tshirts",
            )
        )
        categoriesList.add(
            CategoriesModel(
                "Category3",
            )
        )

    }
}