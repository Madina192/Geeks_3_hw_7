package com.example.geeks_3_practice_7

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.geeks_3_practice_7.adapter.LaptopsAdapter
import com.example.geeks_3_practice_7.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    var arrayList : ArrayList<Laptop> = ArrayList()

    lateinit var adapter: LaptopsAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        addElements()
        adapter = LaptopsAdapter(arrayList) {
            val intent = Intent(this, DetailActivity::class.java)
            intent.putExtra("laptop", it)
            startActivity(intent)
        }
        binding.recyclerView.adapter = adapter
    }

    private fun addElements() {
        arrayList.add(Laptop("MacBook Air", "https://i.pcmag.com/imagery/reviews/01mBttlv1qMiXYpc1bfOj1h-1..v1657726621.jpg", "MagSafe, the M2 chip, up to 24GB of memory", "SILVER", "1200 $"))
        arrayList.add(Laptop("Lenovo 2022", "https://m.media-amazon.com/images/I/61QGMX0Qy6L._AC_SX679_.jpg", "15.6\" HD Touchscreen, 11th Gen Intel Core i3", "DARK GRAY", "800 $"))
        arrayList.add(Laptop("Acer Aspire 5", "https://m.media-amazon.com/images/I/71pvhTrmZDL._AC_SX450_.jpg", "Dual Core Processor - 8GB DDR4 - 128GB", "GRAY", "1000 $"))
        arrayList.add(Laptop("HP 14 Laptop", "https://m.media-amazon.com/images/I/71IOwQhjZNL._AC_SX466_.jpg", "AMD Ryzen 5 5500U, 8 GB RAM, 256 GB SSD", "SILVER", "900 $"))
        arrayList.add(Laptop("ASUS TUF Dash", "https://m.media-amazon.com/images/I/71AGOX9MORL._AC_SY450_.jpg", "Gaming Laptop, 15.6\" 144Hz FHD Display", "BLACK", "1100 $"))
        arrayList.add(Laptop("Dell 2022", "https://m.media-amazon.com/images/I/81QjZasTdyL._AC_SY450_.jpg", "ntel Celeron N4020 Processor, 16GB DDR4 RAM", "DARK GRAY", "700 $"))
        arrayList.add(Laptop("MacBook Air", "https://i.pcmag.com/imagery/reviews/01mBttlv1qMiXYpc1bfOj1h-1..v1657726621.jpg", "MagSafe, the M2 chip, up to 24GB of memory", "SILVER", "1200 $"))
        arrayList.add(Laptop("Lenovo 2022", "https://m.media-amazon.com/images/I/61QGMX0Qy6L._AC_SX679_.jpg", "15.6\" HD Touchscreen, 11th Gen Intel Core i3", "DARK GRAY", "800 $"))
    }
}