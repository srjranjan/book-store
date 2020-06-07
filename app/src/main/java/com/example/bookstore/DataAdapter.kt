package com.example.bookstore

import android.content.Context
import android.content.Intent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.contents.view.*

class DataAdapter(
    private val result: List<Bookclass>,
    var itemClickListener : OnItemClickListener) : RecyclerView.Adapter<DataAdapter.InnerDataClass>()
    {
        inner class InnerDataClass(itemView: View) : RecyclerView.ViewHolder(itemView) {

            val bookImageView : ImageView =itemView.bookImage
            val booktitle : TextView = itemView.booktitle
            val bookCost : TextView = itemView.bookcost
           fun bind(bookstore : Bookclass,clickListener : OnItemClickListener){
               itemView.setOnClickListener {
                   clickListener.onItemClick(bookstore)
               }
           }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): InnerDataClass {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.contents,parent,false)

            return InnerDataClass(view)
        }

        override fun getItemCount(): Int {
            return result.size

        }

        override fun onBindViewHolder(holder: DataAdapter.InnerDataClass, position: Int) {
            val books = result[position]
            holder.bookImageView.setImageResource(books.DisplayImage)
            holder.booktitle.text = books.Bookname
            holder.bookCost.text = books.Cost
            holder.bind(books,itemClickListener)

        }
        interface OnItemClickListener{
            fun onItemClick(bookstore:Bookclass)
        }
    }