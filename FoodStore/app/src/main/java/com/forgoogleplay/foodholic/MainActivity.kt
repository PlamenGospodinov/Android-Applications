package com.forgoogleplay.foodholic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class MainActivity : AppCompatActivity() {
    private  val img = arrayOf(R.drawable.banitsa,R.drawable.mekici,R.drawable.meze,
        R.drawable.musaka,R.drawable.salata,R.drawable.tarator)

    private val texts = arrayOf("Banitsa","Mekici","Meze","Musaka","Salata","Tarator")

    private val desc = arrayOf("Non-veg","Veg","Non-veg","Non-veg","Vegan","Non-veg")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val recyclerView = findViewById<RecyclerView>(R.id.recycler_view)
        recyclerView.layoutManager = LinearLayoutManager(this)
        recyclerView.adapter = CustomAdapter(img,texts,desc)
    }
}