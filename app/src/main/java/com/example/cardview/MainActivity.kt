package com.example.cardview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.adapter.CardAdapter
import com.example.cardview.module.Card

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var recyclerView: RecyclerView=findViewById(R.id.cart_recycler)

        val cardArray=ArrayList<Card>()
        cardArray.add(Card("Fine Grain Sugar","Price - $ 200",R.drawable.sugar))
        cardArray.add(Card("Brawn Sugar","Price - $ 500",R.drawable.sugar1))
        cardArray.add(Card("Myanmar Rice","Price - $ 200",R.drawable.rice))

        val cardsAdapter= CardAdapter(cardArray)

        recyclerView.layoutManager= LinearLayoutManager(this)
        recyclerView.adapter=cardsAdapter
    }
}
