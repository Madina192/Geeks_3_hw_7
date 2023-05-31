package com.example.geeks_3_practice_7

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

@Parcelize
data class Laptop(
    var title : String,
    var image : String,
    var descr : String,
    var color : String,
    var price : String
) : Parcelable