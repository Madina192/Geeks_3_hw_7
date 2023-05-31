package com.example.geeks_3_practice_7

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.example.geeks_3_practice_7.databinding.ActivityDetailBinding

class DetailActivity : AppCompatActivity() {

    lateinit var binding: ActivityDetailBinding
    private lateinit var laptop : Laptop

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(binding.root)
        laptop = intent.getParcelableExtra("laptop")!!
        setViews()
    }

    private fun setViews(){
        Glide.with(binding.imageViewIcon).load(laptop.image).into(binding.imageViewIcon)
        binding.textViewName.text = laptop.title
        binding.textViewDescr.text = laptop.descr
        binding.textViewColor.text = laptop.color
        binding.textViewSum.text = laptop.price

    }
}