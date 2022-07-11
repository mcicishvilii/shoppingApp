package com.example.shoppingapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager.HORIZONTAL
import androidx.recyclerview.widget.LinearLayoutManager.VERTICAL
import com.example.shoppingapp.Adapters.CategoriesAdapter
import com.example.shoppingapp.Adapters.ItemsAdapter
import com.example.shoppingapp.DataModels.CategoriesModel
import com.example.shoppingapp.DataModels.ItemsModel
import com.example.shoppingapp.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding
    private val itemsList = mutableListOf<ItemsModel>()
    private val categoriesList = mutableListOf<CategoriesModel>()

    private lateinit var categoriesAdapter: CategoriesAdapter
    private lateinit var itemsAdapter: ItemsAdapter


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
                R.drawable.ic_baseline_agriculture_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_30fps_select_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_3p_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                android.R.drawable.ic_input_add
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_30fps_select_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_3p_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                android.R.drawable.ic_input_add
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_30fps_select_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_3p_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                android.R.drawable.ic_input_add
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_30fps_select_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_3p_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                android.R.drawable.ic_input_add
            )
        )
        itemsList.add(
            ItemsModel(
                "witeli maika",
                245,
                "bebruli",
                R.drawable.ic_baseline_agriculture_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_30fps_select_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                R.drawable.ic_baseline_3p_24
            )
        )

        itemsList.add(
            ItemsModel(
                "lurji jempri",
                23,
                "bebruli",
                android.R.drawable.ic_input_add
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
                "Category1",
            )
        )

        categoriesList.add(
            CategoriesModel(
                "Category2",
            )
        )
        categoriesList.add(
            CategoriesModel(
                "Category3",
            )
        )

    }
}