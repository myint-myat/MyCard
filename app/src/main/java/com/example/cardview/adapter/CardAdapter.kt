package com.example.cardview.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.cardview.R
import com.example.cardview.module.Card
import kotlinx.android.synthetic.main.show_card.view.*

//import kotlinx.android.synthetic.main.show_card.view.*
//import org.w3c.dom.Text


class CardViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
    var cardName = itemView.findViewById<TextView>(R.id.card_name)
    var cardPrice = itemView.findViewById<TextView>(R.id.card_price)
    var cardImage = itemView.findViewById<ImageView>(R.id.card_image)
    var btnCount = itemView.findViewById<Button>(R.id.btn_plus)
    var btnMinus = itemView.findViewById<Button>(R.id.btn_minus)
    var txtWeight = itemView.findViewById<TextView>(R.id.txt_weight)


}

class CardAdapter(val cardList: ArrayList<Card>) : RecyclerView.Adapter<CardViewHolder>() {
    //    private var onItemClickListener:View.
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): CardViewHolder {
        val view = LayoutInflater.from(parent.context).inflate(R.layout.show_card, parent, false)
        return CardViewHolder(view)
    }

    override fun getItemCount(): Int {
        return cardList.size
    }

    override fun onBindViewHolder(holder: CardViewHolder, position: Int) {
        holder.cardName.text = cardList[position].name
        holder.cardPrice.text = cardList[position].price
        holder.cardImage.setImageResource(cardList[position].image)
        holder.btnCount.setOnClickListener {
            var count: Int = holder.txtWeight.text.toString().toInt()
            count++
            holder.txtWeight.text = count.toString()
        }

        holder.btnMinus.setOnClickListener {
            var minus: Int = holder.txtWeight.text.toString().toInt()
            minus--
            holder.txtWeight.text = minus.toString()
        }
    }
//fun setOnClickListener(itemClickListener:View.OnClickListener){
//
//}
//
}