package com.miu.walmartlogin

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import com.miu.walmartlogin.databinding.ActivityElectronicsItemsBinding

class ElectronicsItemsActivity : AppCompatActivity(), ElectronicsAdapter.Callback {

    private lateinit var binding: ActivityElectronicsItemsBinding
    private val productList = mutableListOf(
        Product("HP Flyer Red 15.6 \" Laptop", "$435", "Red", R.drawable.laptop, 1236L, "Nice laptop Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("RCA Voyager 7\" 16GB android tablet", "$35", "Blue", R.drawable.tablet, 123L, "Nice tablet Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the "),
        Product("Vizio 70\" class 4K", "$235", "Black", R.drawable.tv, 1234L, "Nice TV Screen Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the ."),
        Product("EPSON workforce WF-2750", "$135", "Black", R.drawable.printer, 1235L, "Nice Scanner Lorem Ipsum is simply dummy text of the printing and typesetting industry. Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, when an unknown printer took a galley of type and scrambled it to make a type specimen book. It has survived not only five centuries, but also the .")
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityElectronicsItemsBinding.inflate(layoutInflater)
        setContentView(binding.root)
        val recyclerView = binding.recyclerView
        recyclerView.layoutManager = LinearLayoutManager(this)
        val adapter = ElectronicsAdapter(this, productList)
        adapter.setCallback(this)
        recyclerView.adapter = adapter
    }

    override fun onItemClicked(product: Product?) {
        val intent = Intent(this, ElectronicsDetailActivity::class.java)
        intent.putExtra("product", product)
        startActivity(intent)
    }
}