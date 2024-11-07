package trpl.nim234311039.artspace

import androidx.annotation.DrawableRes

data class Artwork(
    val title: String,
    val artist: String,
    val year: Int,
    @DrawableRes val imageResId: Int
)