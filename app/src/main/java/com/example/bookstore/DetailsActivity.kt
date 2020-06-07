package com.example.bookstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState : Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)
        var intent = intent
        val image = intent.getIntExtra("display_image",0)
        var bookName = intent.getStringExtra("bookName")
        var cost = intent.getStringExtra("cost")
        book_imageView.setImageResource(image)
        bookTitle_txt.text=bookName
        bookCost_txt.text=cost
    }
}
