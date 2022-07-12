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
import com.google.android.gms.analytics.ecommerce.Product

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val itemsList = mutableListOf<ItemsModel>()
    private val categoriesList = mutableListOf<CategoriesModel>()

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var itemsAdapter: ItemsAdapter

    var selectedProductsList = mutableListOf<Product>()
    val selectedCategoriesList = mutableListOf<Filters.Category>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initItems()
        initCategories()

    }



    private fun initItems(){
        itemsAdapter = ItemsAdapter().apply {

            populateItemsData()
            updateAll(itemsList)

        }

        binding.rvItems.layoutManager =
            GridLayoutManager(this,2,VERTICAL,false)
        binding.rvItems.adapter = itemsAdapter
    }

    private fun initCategories(){
        categoriesAdapter = CategoriesAdapter().apply {

            setOnItemCLickListener { category: CategoriesModel, i: Int ->

//                if(category.categoryName == "misho")

                Toast.makeText(this@MainActivity, "${category.categoryName} deleted", Toast.LENGTH_SHORT).show()
                populateItemsData()

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
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24,
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
                R.drawable.ic_baseline_30fps_select_24,
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
                R.drawable.ic_baseline_3p_24,
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
                android.R.drawable.ic_input_add,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24,
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
                R.drawable.ic_baseline_30fps_select_24,
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
                R.drawable.ic_baseline_3p_24,
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
                android.R.drawable.ic_input_add,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24,
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
                R.drawable.ic_baseline_30fps_select_24,
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
                R.drawable.ic_baseline_3p_24,
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
                android.R.drawable.ic_input_add,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24,
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
                R.drawable.ic_baseline_30fps_select_24,
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
                R.drawable.ic_baseline_3p_24,
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
                android.R.drawable.ic_input_add,
                listOf(
                    Filters.Category.BOTTOM
                )
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24,
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
                R.drawable.ic_baseline_30fps_select_24,
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
                R.drawable.ic_baseline_3p_24,
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
                android.R.drawable.ic_input_add,
                listOf(
                    Filters.Category.BOTTOM
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